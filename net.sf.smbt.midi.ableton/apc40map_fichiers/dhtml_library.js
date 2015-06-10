//*******************************************************************************************************
//*******************************************************************************************************
//
//	CORE MENU UTILITIES
//		3rd part stuff that the uber dhtml consumes. Should not be changed.
//		
//*******************************************************************************************************
//*******************************************************************************************************
DOM = (document.getElementById) ? 1 : 0;
NS4 = (document.layers) ? 1 : 0;
// We need to explicitly detect Konqueror
// because Konqueror 3 sets IE = 1 ... AAAAAAAAAARGHHH!!!
Konqueror = (navigator.userAgent.indexOf("Konqueror") > -1) ? 1 : 0;
// We need to detect Konqueror 2.2 as it does not handle the window.onresize event
Konqueror22 = (navigator.userAgent.indexOf("Konqueror 2.2") > -1 || navigator.userAgent.indexOf("Konqueror/2.2") > -1) ? 1 : 0;
Opera = (navigator.userAgent.indexOf("Opera") > -1) ? 1 : 0;
Opera5 = (navigator.userAgent.indexOf("Opera 5") > -1 || navigator.userAgent.indexOf("Opera/5") > -1) ? 1 : 0;
Opera6 = (navigator.userAgent.indexOf("Opera 6") > -1 || navigator.userAgent.indexOf("Opera/6") > -1) ? 1 : 0;
Opera56 = Opera5 || Opera6;
IE = (navigator.userAgent.indexOf("MSIE") > -1) ? 1 : 0;
IE = IE && !Opera;
IE5 = IE && DOM;
IE4 = (document.all) ? 1 : 0;
IE4 = IE4 && IE && !DOM;
//*******************************************************************************************************
//	Menu positioning stuff from selectedit js
//*******************************************************************************************************
function getOffsetLeft(eElement)
{
	eElement	= document.getElementById( eElement );
   if (!eElement && this)                    // if argument is invalid
   {                                         // (not specified, is null or is 0)
      eElement = this;                       // and function is a method
   }                                         // identify the element as the method owner
   var DL_bIE = document.all ? true : false; // initialize var to identify IE
   var nLeftPos = eElement.offsetLeft;       // initialize var to store calculations
   var eParElement = eElement.offsetParent;  // identify first offset parent element
   while (eParElement != null)
   {                                         // move up through element hierarchy
      if(DL_bIE)                             // if browser is IE, then...
      {
         if( (eParElement.tagName != "TABLE") && (eParElement.tagName != "BODY") )
         {                                   // if parent is not a table or the body, then...
            nLeftPos += eParElement.clientLeft; // append cell border width to calcs
         }
      }
      else                                   // if browser is Gecko, then...
      {
         if(eParElement.tagName == "TABLE")  // if parent is a table, then...
         {                                   // get its border as a number
            var nParBorder = parseInt(eParElement.border);
            if(isNaN(nParBorder))            // if no valid border attribute, then...
            {                                // check the table's frame attribute
               var nParFrame = eParElement.getAttribute('frame');
               if(nParFrame != null)         // if frame has ANY value, then...
               {
                  nLeftPos += 1;             // append one pixel to counter
               }
            }
            else if(nParBorder > 0)          // if a border width is specified, then...
            {
               nLeftPos += nParBorder;       // append the border width to counter
            }
         }
      }
      nLeftPos += eParElement.offsetLeft;    // append left offset of parent
      eParElement = eParElement.offsetParent; // and move up the element hierarchy
   }                                         // until no more offset parents exist
   return nLeftPos;                          // return the number calculated
}
function getOffsetTop(eElement)
{
	eElement	= document.getElementById( eElement );
   if (!eElement && this)                    // if argument is invalid
   {                                         // (not specified, is null or is 0)
      eElement = this;                       // and function is a method
   }                                         // identify the element as the method owner
   var DL_bIE = document.all ? true : false; // initialize var to identify IE
   var nTopPos = eElement.offsetTop;         // initialize var to store calculations
   var eParElement = eElement.offsetParent;  // identify first offset parent element
   while (eParElement != null)
   {                                         // move up through element hierarchy
      if(DL_bIE)                             // if browser is IE, then...
      {
         if( (eParElement.tagName != "TABLE") && (eParElement.tagName != "BODY") && (eParElement.tagName != "HTML") )
         {                                   // if parent a table cell, then...
            nTopPos += eParElement.clientTop; // append cell border width to calcs
         }
      }
      else                                   // if browser is Gecko, then...
      {
         if(eParElement.tagName == "TABLE")  // if parent is a table, then...
         {                                   // get its border as a number
            var nParBorder = parseInt(eParElement.border);
            if(isNaN(nParBorder))            // if no valid border attribute, then...
            {                                // check the table's frame attribute
               var nParFrame = eParElement.getAttribute('frame');
               if(nParFrame != null)         // if frame has ANY value, then...
               {
                  nTopPos += 1;              // append one pixel to counter
               }
            }
            else if(nParBorder > 0)          // if a border width is specified, then...
            {
               nTopPos += nParBorder;        // append the border width to counter
            }
         }
      }
      nTopPos += eParElement.offsetTop;      // append top offset of parent
      eParElement = eParElement.offsetParent; // and move up the element hierarchy
   }                                         // until no more offset parents exist
   return nTopPos;                           // return the number calculated
}
function setTop(layer,y) {
//layerTop[layer] = y;
	if (DOM && !Opera5) {
		document.getElementById(layer).style.top = y + "px";
	} else if (Opera5) {
		document.getElementById(layer).style.top = y;
	} else if (NS4) {
		document.layers[layer].top = y;
	} else {
		document.all[layer].style.pixelTop = y;
	}
}
function setWidth(layer,w) {
	if (DOM) {
		document.getElementById(layer).style.width = w;
	} else if (NS4) {
//		document.layers[layer].width = w;
	} else {
		document.all[layer].style.pixelWidth = w;
	}
}
function getOffsetWidth(layer) {
	var value = 0;
	if (DOM && !Opera56) {
		value = document.getElementById(layer).offsetWidth;
	} else if (NS4) {
		value = document.layers[layer].document.width;
	} else if (Opera56) {
		value = document.getElementById(layer).style.pixelWidth;
	} else {	// IE4 IS SIMPLY A BASTARD !!!
		if (document.all["IE4" + layer]) {
			layer = "IE4" + layer;
		}
		value = document.all[layer].offsetWidth;
	}
	return (value);
}
function setHeight(layer,h) {	// unused, not tested
	if (DOM) {
		document.getElementById(layer).style.height = h;
	} else if (NS4) {
//		document.layers[layer].height = h;
	} else {
		document.all[layer].style.pixelHeight = h;
	}
}
function getOffsetHeight(layer) {
	var value = 0;
	if (DOM && !Opera56) {
		value = document.getElementById(layer).offsetHeight;
	} else if (NS4) {
		value = document.layers[layer].document.height;
	} else if (Opera56) {
		value = document.getElementById(layer).style.pixelHeight;
	} else {	// IE4 IS SIMPLY A BASTARD !!!
		if (document.all["IE4" + layer]) {
			layer = "IE4" + layer;
		}
		value = document.all[layer].offsetHeight;
	}
	return (value);
}
function getWindowWidth() {
	var value = 0;
	if ((DOM && !IE) || NS4 || Konqueror || Opera) {
		value = top.innerWidth;
//	} else if (NS4) {
//		value = document.width;
	} else {	// IE
		if (document.documentElement && document.documentElement.clientWidth) {
			value = document.documentElement.clientWidth;
		} else if (document.body) {
			value = document.body.clientWidth;
		}
	}
	if (isNaN(value)) {
		value = top.innerWidth;
	}
	return (value);
}
function getWindowXOffset() {
	var value = 0;
	if ((DOM && !IE) || NS4 || Konqueror || Opera) {
		value = window.pageXOffset;
	} else {	// IE
		if (document.documentElement && document.documentElement.scrollLeft) {
			value = document.documentElement.scrollLeft;
		} else if (document.body) {
			value = document.body.scrollLeft;
		}
	}
	return (value);
}
function getWindowHeight() {
	var value = 0;
	if ((DOM && !IE) || NS4 || Konqueror || Opera) {
		value = top.innerHeight;
	} else {	// IE
		if (document.documentElement && document.documentElement.clientHeight) {
			value = document.documentElement.clientHeight;
		} else if (document.body) {
			value = document.body.clientHeight;
		}
	}
	if (isNaN(value)) {
		value = top.innerHeight;
	}
	return (value);
}
function getWindowYOffset() {
	var value = 0;
	if ((DOM && !IE) || NS4 || Konqueror || Opera) {
		value = window.pageYOffset;
	} else {	// IE
		if (document.documentElement && document.documentElement.scrollTop) {
			value = document.documentElement.scrollTop;
		} else if (document.body) {
			value = document.body.scrollTop;
		}
	}
	return (value);
}
function getAllChildren(e) {
  // Returns all children of element. Workaround required for IE5/Windows. Ugh.
  return e.all ? e.all : e.getElementsByTagName('*');
}
document.getElementsBySelector = function(selector) {
  // Attempt to fail gracefully in lesser browsers
  if (!document.getElementsByTagName) {
    return new Array();
  }
  // Split selector in to tokens
  var tokens = selector.split(' ');
  var currentContext = new Array(document);
  for (var i = 0; i < tokens.length; i++) {
    token = tokens[i].replace(/^\s+/,'').replace(/\s+$/,'');;
    if (token.indexOf('#') > -1) {
      // Token is an ID selector
      var bits = token.split('#');
      var tagName = bits[0];
      var id = bits[1];
      var element = document.getElementById(id);
      if (tagName && element.nodeName.toLowerCase() != tagName) {
        // tag with that ID not found, return false
        return new Array();
      }
      // Set currentContext to contain just this element
      currentContext = new Array(element);
      continue; // Skip to next token
    }
    if (token.indexOf('.') > -1) {
      // Token contains a class selector
      var bits = token.split('.');
      var tagName = bits[0];
      var className = bits[1];
      if (!tagName) {
        tagName = '*';
      }
      // Get elements matching tag, filter them for class selector
      var found = new Array;
      var foundCount = 0;
      for (var h = 0; h < currentContext.length; h++) {
        var elements;
        if (tagName == '*') {
            elements = getAllChildren(currentContext[h]);
        } else {
            elements = currentContext[h].getElementsByTagName(tagName);
        }
        for (var j = 0; j < elements.length; j++) {
          found[foundCount++] = elements[j];
        }
      }
      currentContext = new Array;
      var currentContextIndex = 0;
      for (var k = 0; k < found.length; k++) {
        if (found[k].className && found[k].className.match(new RegExp('\\b'+className+'\\b'))) {
          currentContext[currentContextIndex++] = found[k];
        }
      }
      continue; // Skip to next token
    }
    // Code to deal with attribute selectors
    if (token.match(/^(\w*)\[(\w+)([=~\|\^\$\*]?)=?"?([^\]"]*)"?\]$/)) {
      var tagName = RegExp.$1;
      var attrName = RegExp.$2;
      var attrOperator = RegExp.$3;
      var attrValue = RegExp.$4;
      if (!tagName) {
        tagName = '*';
      }
      // Grab all of the tagName elements within current context
      var found = new Array;
      var foundCount = 0;
      for (var h = 0; h < currentContext.length; h++) {
        var elements;
        if (tagName == '*') {
            elements = getAllChildren(currentContext[h]);
        } else {
            elements = currentContext[h].getElementsByTagName(tagName);
        }
        for (var j = 0; j < elements.length; j++) {
          found[foundCount++] = elements[j];
        }
      }
      currentContext = new Array;
      var currentContextIndex = 0;
      var checkFunction; // This function will be used to filter the elements
      switch (attrOperator) {
        case '=': // Equality
          checkFunction = function(e) { return (e.getAttribute(attrName) == attrValue); };
          break;
        case '~': // Match one of space seperated words 
          checkFunction = function(e) { return (e.getAttribute(attrName).match(new RegExp('\\b'+attrValue+'\\b'))); };
          break;
        case '|': // Match start with value followed by optional hyphen
          checkFunction = function(e) { return (e.getAttribute(attrName).match(new RegExp('^'+attrValue+'-?'))); };
          break;
        case '^': // Match starts with value
          checkFunction = function(e) { return (e.getAttribute(attrName).indexOf(attrValue) == 0); };
          break;
        case '$': // Match ends with value - fails with "Warning" in Opera 7
          checkFunction = function(e) { return (e.getAttribute(attrName).lastIndexOf(attrValue) == e.getAttribute(attrName).length - attrValue.length); };
          break;
        case '*': // Match ends with value
          checkFunction = function(e) { return (e.getAttribute(attrName).indexOf(attrValue) > -1); };
          break;
        default :
          // Just test for existence of attribute
          checkFunction = function(e) { return e.getAttribute(attrName); };
      }
      currentContext = new Array;
      var currentContextIndex = 0;
      for (var k = 0; k < found.length; k++) {
        if (checkFunction(found[k])) {
          currentContext[currentContextIndex++] = found[k];
        }
      }
      // alert('Attribute Selector: '+tagName+' '+attrName+' '+attrOperator+' '+attrValue);
      continue; // Skip to next token
    }
    // If we get here, token is JUST an element (not a class or ID selector)
    tagName = token;
    var found = new Array;
    var foundCount = 0;
    for (var h = 0; h < currentContext.length; h++) {
	  if (currentContext[h])
	  {
		var elements = currentContext[h].getElementsByTagName(tagName);
		for (var j = 0; j < elements.length; j++) {
			found[foundCount++] = elements[j];
		}
	  }
	}
    currentContext = found;
  }
  return currentContext;
}
function HandlerSet() {
    this.clearHandlers();
}
HandlerSet.prototype = {
    addHandler : function(f, key) {
        key = key || this.uniqueID++;
        this.installedHandlers[key] = f;
        return key;
    },
    removeHandler : function(key) {
        delete this.installedHandlers[key];
    },
    clearHandlers : function() {
        this.installedHandlers = { };
        this.uniqueID = 0;
    },
    replaceHandlers : function(f, key) {
        clearHandlers();
        return addHandler(f, key);
    },
    applyAll : function(object, arguments) {
        for (var handler in this.installedHandlers) {
            this.installedHandlers[handler].apply(object, arguments);
        }
    },
    debug : function() {
        var str = "";
        for (var p in this.installedHandlers) {
            str += p + " => " + this.installedHandlers[p] + "\n";
        }
        alert(str);
    }
};
function isEventHandler(x) {
    return (typeof x == 'function' &&
            x.handlers &&
            x.handlers.constructor == HandlerSet);
}
function makeEventHandler(original) {
    var handlers = new HandlerSet();
    if (typeof original == 'function') {
        handlers.addHandler(original);
    }
    // The event handler is a function, so it can be used with the DOM.
    // But when it's called, we apply all the handlers in the set.
    var result = function() {
        handlers.applyAll(this, arguments);
    };
    // We also expose its handler set so we can get at it later.
    result.handlers = handlers;
    return result;
}
var Behavior = {
    registry : new Array,
    register : function(sheet) {
        Behavior.registry.push(sheet);
    },
    registerEventHandlers : function(element, handlers) {
        for (var event in handlers) {
            if (!isEventHandler(element[event])) {
                element[event] = makeEventHandler(element[event]);
            }
            element[event].handlers.addHandler(handlers[event]);
        }
    },
    apply : function() {
        for (var i = 0; i < Behavior.registry.length; i++) {
            var sheet = Behavior.registry[i];
            for (var selector in sheet) {
                var list = document.getElementsBySelector(selector);
                if (!list) {
                    continue;
                }
                for (var j = 0; j < list.length; j++) {
                    Behavior.registerEventHandlers(list[j], sheet[selector]);
                }
            }
        }
    },
    addLoadHandler : function(handler) {
        var oldHandler = window.onload;
        if (typeof oldHandler != 'function') {
            window.onload = handler;
        }
        else {
            window.onload = function() {
                oldHandler();
                handler();
            };
        }
	}
};
Behavior.addLoadHandler(function() { Behavior.apply(); updatePNG();});
