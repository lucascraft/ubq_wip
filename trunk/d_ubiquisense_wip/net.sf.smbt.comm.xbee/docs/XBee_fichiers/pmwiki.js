function checkCookies() {
//alert(document.cookie);
    
    var allCookies = document.cookie.split(';');
    for(var c=0;c < allCookies.length;c++)
    {
	ck = allCookies[c].split('=');
	for (var i=0;i<2;i++) {
	   // remove leading blanks 
	    while (ck[i].charAt(0)==' ') 
		ck[i] = ck[i].substring(1,ck[i].length);
	   // remove trailing blanks 
	    while (ck[i].charAt(ck[i].length-1)==' ') 
		ck[i] = ck[i].substring(0,ck[i].length-1);
        }
	if (ck[0].match(/_links$/) )  
	{
	   //alert (ck[0] + " " + ck[1]);
           value = ck[1].split('&');
           toggleObj(ck[0],value[0],value[1],value[2],"");

	}
    }
}

