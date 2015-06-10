//*******************************************************************************************************
//*******************************************************************************************************
//
//	UBER SITE UTILITIES
//
//*******************************************************************************************************
//*******************************************************************************************************

//-------------------------------------------------------------------------------------------------------
//	Email validation
//-------------------------------------------------------------------------------------------------------
function IsEmail( string ) 
{
	return (string.search(/^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/) != -1);
}

//-------------------------------------------------------------------------------------------------------
//	Image swap
//-------------------------------------------------------------------------------------------------------
function swapImg(id,img)
{
	if( document.getElementById)
	{
		if( document.getElementById(id))
		{	
			obj	= document.getElementById(id);
			obj.setAttribute( 'src', img );
		}
	}
}

//-------------------------------------------------------------------------------------------------------
//	Swap divs
//-------------------------------------------------------------------------------------------------------
function swapDivContents(id_src, id_dest)
{
	if( document.getElementById)
	{
		if( document.getElementById(id_src))
		{	
			src_obj	= document.getElementById(id_src);

			if( document.getElementById(id_dest))
			{	
				dest_obj	= document.getElementById(id_dest);
				dest_obj.innerHTML = src_obj.innerHTML;
			}
		}
	}
}

//-------------------------------------------------------------------------------------------------------
//	Redirect
//-------------------------------------------------------------------------------------------------------
function redirectTo( nav )
{
	//	Selected a url?
	dropdown	= nav.options;
	value		= dropdown[dropdown.selectedIndex].value;

	if ( value )
	{
		window.location.href = value;	
	}
}

//*******************************************************************************************************
//*******************************************************************************************************
//
//	UBER MENU SETUP
//		Uses functions defined in /uber/dhtml_library.js
//
//*******************************************************************************************************
//*******************************************************************************************************

//-------------------------------------------------------------------------------------------------------
//	Main nav image swaps
//-------------------------------------------------------------------------------------------------------
function ButtonOn( object, hover )
{
	ButtonID = object.id;
	MenuID	 = ButtonID.substring( 2, ButtonID.length );
	changeTo = hover ? menuimages_hover[MenuID] : menuimages_active[MenuID];
	
	swapImg('img-'+MenuID, changeTo );
}

function ButtonOff( object )
{
	ButtonID = object.id;
	MenuID	 = ButtonID.substring( 2, ButtonID.length );
	changeTo = menuimages_default[MenuID];
	
	swapImg('img-'+MenuID, changeTo );
}


//-------------------------------------------------------------------------------------------------------
//	Menu swaps
//-------------------------------------------------------------------------------------------------------
function MenuOn( object )
{
	ItemID   = object.id;
	MenuID	 = ItemID.substring( 2, ItemID.length );
	
	menuObj	 = document.getElementById( 'm-' + MenuID );
	
	if (menuObj)
	{
		MenuRePosition( menuObj );
		menuObj.style.display = "block";
	}
}

function MenuOff( object )
{
	ItemID   = object.id;
	MenuID	 = ItemID.substring( 2, ItemID.length );
	menuObj	 = document.getElementById( 'm-' + MenuID);
	
	if (menuObj)
	{
		menuObj.style.display = "none";
	}
}

//-------------------------------------------------------------------------------------------------------
//	DHTML swaps
//-------------------------------------------------------------------------------------------------------
function Menu2On( object )
{
	object.style.display	= "block";
}

function Menu2Off( object )
{
	object.style.display	= "none";
}

//-------------------------------------------------------------------------------------------------------
//	Sub Menu swaps
//-------------------------------------------------------------------------------------------------------
function SubMenuOn( object )
{
	if( object.className != "m1" )
	{
		//	Highlight the parent link (link moused over to get the submenu)
		sublinks	= object.getElementsByTagName( "a" );
		sublinks[0].setAttribute( "baseclass", sublinks[0].className );

		if( sublinks[0].className == "showsub" )
		{
			highlightclassname	= " highlight-active";
		}
		else
		{
			highlightclassname	= " highlight";
		}

		sublinks[0].className	= sublinks[0].className + highlightclassname;
		//	----------
		
		submenus	= object.getElementsByTagName( 'ul' );

		if( submenus.length == 0 )
		{
			return;
		}

		MenuObj	= submenus[0];
	}

	MenuObj.style.display = "block";
}

function SubMenuOff( object )
{
	if( object.className != "m1" )
	{
		//	Un-highlight the parent link (link moused over to get the submenu)
		sublinks	= object.getElementsByTagName( "a" );
		sublinks[0].className	= sublinks[0].getAttribute( "baseclass" );
		//	----------
		
		submenus	= object.getElementsByTagName( 'ul' );

		if( submenus.length == 0 )
		{
			return;
		}

		MenuObj	= submenus[0];
	}

	MenuObj.style.display = "none";
}

//-------------------------------------------------------------------------------------------------------
//	Menu positioning
//-------------------------------------------------------------------------------------------------------
function MenuRePosition( object )
{
	ButtonID	= ButtonGetButtonID( object );

	//	Menus right
	if( menu_positioning == 1 )
	{
		object.style.left = ( getOffsetLeft( ButtonID ) + getOffsetWidth( ButtonID )) +  'px';
		object.style.top  = getOffsetTop( ButtonID ) + 'px';
	}
	//	Menus below (default)
	else
	{
		object.style.left = getOffsetLeft( ButtonID ) + 'px';
		object.style.top  = ( getOffsetTop( ButtonID ) + getOffsetHeight( ButtonID )) + 'px';
	}
}

function ButtonGetButtonID( object )
{
	while ( object.parentNode.tagName != "BODY" )
	{
		object	= object.parentNode;
	}

	MenuID		= object.getAttribute( "id" );
	MenuID	    = MenuID.substring( 2, MenuID.length );
	ButtonID	= "b-" + MenuID;

	return ButtonID;
}

//-------------------------------------------------------------------------------------------------------
//	Apply the page rules
//-------------------------------------------------------------------------------------------------------
var	rules = {
	'.m1':
	{
		onmouseover	: function() { ButtonOn( this, false );	Menu2On( this ) },
		onmouseout	: function() { ButtonOff( this );		Menu2Off( this ) }
	},

	'ul.m1 li':
	{
		onmouseover	: function() { ButtonOn( this, false );	SubMenuOn( this ) },
		onmouseout	: function() { ButtonOff( this );		SubMenuOff( this ) }
	},

	'#nav-main a':
	{
		onmouseover	: function() { ButtonOn( this, true );  MenuOn( this ) },
		onmouseout	: function() { ButtonOff( this );		MenuOff( this ) }
	}
};

Behavior.register(rules);
