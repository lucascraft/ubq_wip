document.write('');

if(typeof(dartCallbackObjects) == "undefined")
  var dartCallbackObjects = new Array();
if(typeof(dartCreativeDisplayManagers) == "undefined")
  var dartCreativeDisplayManagers = new Object();
if(typeof(dartMotifAds) == "undefined")
  var dartMotifAds = new Array();
if(!self.dartLoadedGlobalTemplates_56_03) {
  self.dartLoadedGlobalTemplates_56_03 = {};
}
if(self.dartLoadedGlobalTemplates_56_03["@GT_TYPE@"]) {
  self.dartLoadedGlobalTemplates_56_03["@GT_TYPE@"].isLoaded = true;
}

function RichMediaCore_56_03() {
  this.CREATIVE_TYPE_EXPANDING = "ExpandingFlash";
  this.CREATIVE_TYPE_FLOATING = "FloatingFlash";
  this.CREATIVE_TYPE_INPAGE = "InpageFlash";
  this.CREATIVE_TYPE_INPAGE_WITH_FLOATING = "InpageFlashFloatingFlash";
  this.CREATIVE_TYPE_FLOATING_WITH_REMINDER = "FloatingFlashReminderFlash";
  this.CREATIVE_TYPE_INPAGE_WITH_OVERLAY = "InpageFlashOverlayFlash";
  this.ASSET_TYPE_FLOATING = "Floating";
  this.ASSET_TYPE_INPAGE = "Inpage";
  this.ASSET_TYPE_EXPANDING = "Expanding";
  this.ASSET_TYPE_REMINDER = "Reminder";
  this.ASSET_TYPE_OVERLAY = "Overlay";
  this.STANDARD_EVENT_DISPLAY_TIMER = "DISPLAY_TIMER";
  this.STANDARD_EVENT_INTERACTION_TIMER = "INTERACTION_TIMER";
  this.STANDARD_EVENT_INTERACTIVE_IMPRESSION = "EVENT_USER_INTERACTION";
  this.STANDARD_EVENT_FULL_SCREEN_VIDEO_PLAYS = "";
  this.STANDARD_EVENT_FULL_SCREEN_VIDEO_COMPLETES = "";
  this.STANDARD_EVENT_FULL_SCREEN_AVERAGE_VIEW_TIME = "";
  this.STANDARD_EVENT_MANUAL_CLOSE = "EVENT_MANUAL_CLOSE";
  this.STANDARD_EVENT_BACKUP_IMAGE = "BACKUP_IMAGE_IMPRESSION";
  this.STANDARD_EVENT_EXPAND_TIMER = "EXPAND_TIMER";
  this.STANDARD_EVENT_VIDEO_PLAY = "EVENT_VIDEO_PLAY";
  this.STANDARD_EVENT_VIDEO_VIEW_TIMER = "EVENT_VIDEO_VIEW_TIMER";
  this.STANDARD_EVENT_VIDEO_VIEW_COMPLETE = "EVENT_VIDEO_COMPLETE";
  this.STANDARD_EVENT_VIDEO_INTERACTION = "EVENT_VIDEO_INTERACTION";
  this.STANDARD_EVENT_VIDEO_PAUSE = "EVENT_VIDEO_PAUSE";
  this.STANDARD_EVENT_VIDEO_MUTE = "EVENT_VIDEO_MUTE";
  this.STANDARD_EVENT_VIDEO_REPLAY = "EVENT_VIDEO_REPLAY";
  this.STANDARD_EVENT_VIDEO_MIDPOINT = "EVENT_VIDEO_MIDPOINT";
  this.STANDARD_EVENT_VIDEO_FULLSCREEN = "";
  this.STANDARD_EVENT_VIDEO_STOP = "EVENT_VIDEO_STOP";
  this.STANDARD_EVENT_VIDEO_UNMUTE = "EVENT_VIDEO_UNMUTE";
  this.STANDARD_EVENT_FULLSCREEN = "EVENT_FULLSCREEN";
  this.STANDARD_EVENT_DYNAMIC_CREATIVE_IMPRESSION = "DYNAMIC_CREATIVE_IMPRESSION";
};
RichMediaCore_56_03.prototype.isPageLoaded = false;
RichMediaCore_56_03.prototype.csiTimes = new Object();
RichMediaCore_56_03.prototype.setCsiEventsRecordedDuringBreakout = function(creative) {
  if(creative.gtStartLoadingTime != undefined)
    this.csiTimes["gb"] = creative.gtStartLoadingTime;
};
RichMediaCore_56_03.prototype.csiHasValidStart = function(creative) {
  return ((creative.csiAdRespTime >= 0) && (creative.csiAdRespTime < 1e5));
};
RichMediaCore_56_03.prototype.shouldReportCsi = function(creative) {
  
  return this.csiHasValidStart(creative) || (Math.floor(Math.random() * 1001) == 1);
};
RichMediaCore_56_03.prototype.shouldCsi = function(asset, creativeType) {
  switch (creativeType) {
    case this.CREATIVE_TYPE_INPAGE_WITH_FLOATING:
      return asset.assetType == this.ASSET_TYPE_INPAGE;
    case this.CREATIVE_TYPE_FLOATING_WITH_REMINDER:
      return asset.assetType == this.ASSET_TYPE_FLOATING;
    case this.CREATIVE_TYPE_INPAGE_WITH_OVERLAY:
      return asset.assetType == this.ASSET_TYPE_INPAGE;
    default: return true;
  }
};
RichMediaCore_56_03.prototype.trackCsiEvent = function(event) {
  this.csiTimes[event] = new Date().getTime();
};
RichMediaCore_56_03.prototype.getCsiServer = function() {
  return (self.location.protocol &&
      self.location.protocol.toString().toLowerCase() == 'https:') ?
        "https://static.doubleclick.net" : "http://static.2mdn.net"; 
};
RichMediaCore_56_03.prototype.reportCsi = function(creative) {
  if (!creative.previewMode && this.shouldReportCsi(creative)) {
    var url = this.getCsiServer() + "/csi/d?s=rmad&v=2&rt=";
    var beginTimes = "";
    var intervals = "";
    for(var event in this.csiTimes) {
      var loadingTime = (this.csiTimes[event] - creative.csiBaseline);
      url += event + "." + (loadingTime > 0 ? loadingTime : 0) + ",";
      if (event == "pb" || event == "gb" || event == "fb" ) {
        beginTimes += event + "." + (loadingTime > 0 ? loadingTime : 0) + ",";
      }
    }
    url = url.replace(/\,$/, '');
    var plcrLoadingTime = this.csiTimes["pe"] - this.csiTimes["pb"];
    var gtLoadingTime = this.csiTimes["ge"] - this.csiTimes["gb"];
    var flashLoadingTime = this.csiTimes["fe"] - this.csiTimes["fb"];
    intervals = "pl." + (plcrLoadingTime > 0 ? plcrLoadingTime : 0) + ","
        + "gl." + (gtLoadingTime > 0 ? gtLoadingTime : 0) + ","
        + "fl." + (flashLoadingTime > 0 ? flashLoadingTime : 0);
    url += "&irt=" + beginTimes.replace(/\,$/, '') + "&it=" + intervals;
    var regEx = new RegExp(/(.*\/\/)/);
    url += "&adi=asd_" + creative.adServer.replace(regEx, '')
          + ",csd_" + creative.mediaServer.replace(regEx, '')
          + ",gt_" + creative.globalTemplateJs.replace(/(.*\/)/, '');
    if (this.csiHasValidStart(creative)) {
      url += "&srt=" + creative.csiAdRespTime;
    }
    this.trackUrl(url, true, creative.previewMode);
  }
};
RichMediaCore_56_03.prototype._isValidStartTime = function(startTime) {
  return this._isValidNumber(startTime);
};
RichMediaCore_56_03.prototype._convertDuration = function(duration) {
  if(duration) {
    duration = duration.toString().toUpperCase();
    switch(duration) {
    case "AUTO": return "AUTO";
    case "NONE": return 0;
    default: return (this._isValidNumber(duration) ? eval(duration) : 0);
    }
  }
  return 0;
};
RichMediaCore_56_03.prototype.convertUnit = function(pos) {
  if(pos != "") {
    pos = pos.toLowerCase().replace(new RegExp("pct", "g"), "%");
    if(pos.indexOf("%") < 0 && pos.indexOf("px") < 0 && pos.indexOf("pxc") < 0)
      pos += "px";
  }
  return pos;
};
RichMediaCore_56_03.prototype._isValidNumber = function(num) {
  var floatNum = parseFloat(num);
  if(isNaN(floatNum) || floatNum < 0)
    return false;
  return (floatNum == num);
};
RichMediaCore_56_03.prototype.writeSurveyURL = function(creative) {
  if(!creative.previewMode && creative.surveyUrl.length > 0) {
    document.write('<scr' + 'ipt src="' + creative.surveyUrl + '" language="JavaScript"></scr' + 'ipt>');
  }
};
RichMediaCore_56_03.prototype.postPublisherData = function(creative, publisherURL) {
  if(!creative.previewMode && this.isInterstitialCreative(creative) && publisherURL != "") {
    var postImg = new Image();
    postImg.src = publisherURL;
  }
};
RichMediaCore_56_03.prototype.isInterstitialCreative = function(creative) {
  return (creative.type == this.CREATIVE_TYPE_FLOATING
          || creative.type == this.CREATIVE_TYPE_FLOATING_WITH_REMINDER);
};
RichMediaCore_56_03.prototype.isBrowserComplient = function(plugin) {
  return (this.isInternetExplorer() || this.isFirefox() || this.isSafari() || this.isChrome()) && (this.isWindows() || this.isMac()) && this.getPluginInfo() >= plugin;
};
RichMediaCore_56_03.prototype.shouldDisplayFloatingAsset = function(duration) {
  return !this.isInternetExplorer() || this._convertDuration(duration) || this.getIEVersion() >= 5.5;
};
RichMediaCore_56_03.prototype.isWindows = function() {
  return (navigator.appVersion.indexOf("Windows") != -1);
};
RichMediaCore_56_03.prototype.isFirefox = function() {
  var appUserAgent = navigator.userAgent.toUpperCase();
  if(appUserAgent.indexOf("GECKO") != -1) {
    if(appUserAgent.indexOf("FIREFOX") != -1) {
      var version = parseFloat(appUserAgent.substr(appUserAgent.lastIndexOf("/") + 1));
      return (version >= 1);
    }
    else if(appUserAgent.indexOf("NETSCAPE") != -1) {
      version = parseFloat(appUserAgent.substr(appUserAgent.lastIndexOf("/") + 1));
      return (version >= 8);
    } else {
      return false;
    }
  }
  else {
    return false;
  }
};
RichMediaCore_56_03.prototype.isSafari = function() {
  var br = "Safari";
  var index = navigator.userAgent.indexOf(br);
  var appVendor = (navigator.vendor != undefined) ? navigator.vendor.toUpperCase() : "";
  return (navigator.appVersion.indexOf(br) != -1) && parseFloat(navigator.userAgent.substring(index + br.length + 1)) >= 312.6 && (appVendor.indexOf("APPLE") != -1);
};
RichMediaCore_56_03.prototype.isChrome = function() {
  var appUserAgent = navigator.userAgent.toUpperCase();
  var appVendor = (navigator.vendor != undefined) ? navigator.vendor.toUpperCase() : "";
  return (appUserAgent.indexOf("CHROME") != -1) && (appVendor.indexOf("GOOGLE") != -1);
};
RichMediaCore_56_03.prototype.isMac = function() {
  return (navigator.appVersion.indexOf("Mac") != -1);
};
RichMediaCore_56_03.prototype.isInternetExplorer = function() {
  return (navigator.appVersion.indexOf("MSIE") != -1 && navigator.userAgent.indexOf("Opera") < 0);
};
RichMediaCore_56_03.prototype.getIEVersion = function() {
  var version = 0;
  if(this.isInternetExplorer()) {
    var key = "MSIE ";
    var index = navigator.appVersion.indexOf(key) + key.length;
    var subString = navigator.appVersion.substr(index);
    version = parseFloat(subString.substring(0, subString.indexOf(";")));
  }
  return version;
};
RichMediaCore_56_03.prototype.getPluginInfo = function() {
  return (this.isInternetExplorer() && this.isWindows()) ? this._getIeWindowsFlashPluginVersion() : this._detectNonWindowsFlashPluginVersion();
};
RichMediaCore_56_03.prototype._detectNonWindowsFlashPluginVersion = function() {
  var flashVersion = 0;
  var key = "Shockwave Flash";
  if(navigator.plugins && (navigator.plugins["Shockwave Flash 2.0"] || navigator.plugins[key])) {
    var version2Offset = navigator.plugins["Shockwave Flash 2.0"] ? " 2.0" : "";
    var flashDescription = navigator.plugins[key + version2Offset].description;
    var keyIndex = flashDescription.indexOf(key) + (key.length+1);
    var dotIndex = flashDescription.indexOf(".");
    var majorVersion = flashDescription.substring(keyIndex, dotIndex);
    var descArray = flashDescription.split(" ");
    var minorVersion = (parseInt(descArray[descArray.length - 1].replace(new RegExp("[A-Za-z]", "g"), "")));
    if(isNaN(minorVersion)) {
      minorVersion = "0";
    }
    flashVersion = parseFloat(majorVersion + "." + minorVersion);
    if(flashVersion > 6.0 && flashVersion < 6.65) {
      flashVersion = 0 ;
    }
  }
  return flashVersion;
};
RichMediaCore_56_03.prototype._getIeWindowsFlashPluginVersion = function() {
  var versionStr = "";
  var flashVersion = 0;
  var versionArray = new Array();
  var tempArray = new Array();
  var lineFeed = "\r\n";
  var defSwfVersion = 0;
  var str = 'swfVersion = '+ defSwfVersion + lineFeed +
    'mtfIsOk = ' + false + lineFeed +
    'On Error Resume Next' + lineFeed +
    'set motifSwfObject = CreateObject(\"ShockwaveFlash.ShockwaveFlash\")' + lineFeed +
    'mtfIsOk = IsObject(motifSwfObject)' + lineFeed +
    'if mtfIsOk = true then' + lineFeed +
    'swfVersion = motifSwfObject.GetVariable(\"$version\")' + lineFeed +
    'end if' + lineFeed + '';
  window.execScript(str, "VBScript");
  if(mtfIsOk) {
    versionStr = swfVersion;
    tempArray = versionStr.split(" ");
    if(tempArray.length > 1) {
      versionArray = tempArray[1].split(",");
      var versionMajor = versionArray[0];
      var versionRevision = versionArray[2];
      if(versionMajor > 9 && versionArray.length > 3) {
        versionRevision = versionArray[versionArray.length - 1];
      }
      flashVersion = parseFloat(versionMajor + "." + versionRevision);
    }
  }
  return flashVersion;
};
RichMediaCore_56_03.prototype.trackBackupImageEvent = function(adserverUrl) {
  var activityString = "eid1=9;ecn1=1;etm1=0;";
  var timeStamp = new Date();
  var postImage = document.createElement("IMG");
  postImage.src = adserverUrl + "&timestamp=" + timeStamp.getTime() + ";" + activityString;
};
RichMediaCore_56_03.prototype.trackUrl = function(url, createElement, previewMode) {
  if(previewMode || url == "") {
    return;
  }
  if (createElement) {
    var postImage = document.createElement("IMG");
    postImage.src = url;
  }
  else {
    document.write('<IMG SRC="'+ url + '" style="display:none" width="0px" height="0px" alt="">');
  }
};
RichMediaCore_56_03.prototype.logThirdPartyImpression = function(creative) {
  this.trackUrl(creative.thirdPartyImpUrl, false, creative.previewMode);
};
RichMediaCore_56_03.prototype.logThirdPartyBackupImageImpression = function(creative, createElement) {
  this.trackUrl(creative.thirdPartyBackupImpUrl, createElement, creative.previewMode);
};
RichMediaCore_56_03.prototype.logThirdPartyFlashDisplayImpression = function(creative, createElement) {
  this.trackUrl(creative.thirdPartyFlashDisplayUrl, createElement, creative.previewMode);
};
RichMediaCore_56_03.prototype.isPartOfArrayPrototype = function(subject) {
  for(var prototypeItem in Array.prototype) {
    if(prototypeItem == subject) {
      return true;
    }
  }
  return false;
};
RichMediaCore_56_03.prototype.toObject = function(variableName) {
  try {
    if(document.layers) {
      return (document.layers[variableName]) ? eval(document.layers[variableName]) : null;
    }
    else if(document.all && !document.getElementById) {
      return (eval("window." + variableName)) ? eval("window." + variableName) : null;
    }
    else if(document.getElementById && document.body.style) {
      return (document.getElementById(variableName)) ? eval(document.getElementById(variableName)) : null;
    }
  } catch(e){}
  return null;
};
RichMediaCore_56_03.prototype.getCallbackObjectIndex = function(obj) {
  for(var i = 0; i < dartCallbackObjects.length; i++) {
    if(dartCallbackObjects[i] == obj)
      return i;
  }
  dartCallbackObjects[dartCallbackObjects.length] = obj;
  return dartCallbackObjects.length - 1;
};
RichMediaCore_56_03.prototype.registerPageLoadHandler = function(handler, obj) {
  var callback = this.generateGlobalCallback(handler, obj);
  if(this.isInternetExplorer()) {
    if(self.document.readyState == "complete")
      callback();
    else
      self.attachEvent("onload", callback);
  }
  else if(this.isFirefox()) {
    if(this.isPageLoaded) {
      callback();
    }
    
    else {
      self.addEventListener("load", callback, true);
    }
  }
  else if(this.isSafari() || this.isChrome()) {
    if(self.document.readyState == "complete")
      callback();
    else
      self.addEventListener("load", callback, true);
  }
};
RichMediaCore_56_03.prototype.pageLoaded = function() {
  RichMediaCore_56_03.prototype.isPageLoaded = true;
};
RichMediaCore_56_03.prototype.registerPageUnLoadHandler = function(handler, obj) {
  var callback = this.generateGlobalCallback(handler, obj);
  if(this.isInternetExplorer() && this.isWindows()) {
    self.attachEvent("onunload", callback);
  }
  else if(this.isFirefox() || this.isSafari() || this.isChrome()) {
    self.addEventListener("unload", callback, true);
  }
};
RichMediaCore_56_03.prototype.registerTimeoutHandler = function(timeout, handler, obj) {
  window.setTimeout(this.generateGlobalCallback(handler, obj), timeout);
};
RichMediaCore_56_03.prototype.createFunction = function(name, ownerObject, args) {
  var fun = "dartCallbackObjects[" + this.getCallbackObjectIndex(ownerObject) + "]." + name + "(";
  for(var i = 0; i < args.length; i++) {
    fun += "dartCallbackObjects[" + this.getCallbackObjectIndex(args[i]) + "]";
    if(i != (args.length - 1))
      fun += ",";
  }
  fun += ")";
  return new Function(fun);
};
RichMediaCore_56_03.prototype.generateGlobalCallback = function(handler, obj) {
  if(obj) {
    var index = this.getCallbackObjectIndex(obj);
    handler = "if(dartCallbackObjects["+ index +"] != null) dartCallbackObjects["+ index +"]." + handler;
  }
  return new Function(handler);
};
RichMediaCore_56_03.prototype.registerEventHandler = function(event, element, handler, obj) {
  var callback = this.generateGlobalCallback(handler, obj);
  if(this.isInternetExplorer() && this.isWindows()) {
    self.attachEvent("on" + event, callback);
  }
  else if(this.isFirefox() || this.isSafari() || this.isChrome()) {
    element.addEventListener(event, callback, false);
  }
};
RichMediaCore_56_03.prototype.scheduleCallbackOnLoad = function(callback) {
  var onloadCheckInterval = 200;
  if(window.document.readyState.toLowerCase() == "complete")
    eval(callback);
  else
    this.registerTimeoutHandler(onloadCheckInterval, "scheduleCallbackOnLoad('" + callback + "')", this);
};
RichMediaCore_56_03.prototype.getStyle = function(obj) {
  if(window.getComputedStyle)
    return window.getComputedStyle(obj, "");
  else if(obj.currentStyle)
    return obj.currentStyle;
  else
    return obj.style;
};
RichMediaCore_56_03.prototype.getWindowDimension = function() {
  var dimension = new Object();
  if(document.documentElement && document.compatMode == "CSS1Compat") {
    dimension.width = document.documentElement.clientWidth;
    dimension.height = document.documentElement.clientHeight;
  } else if(document.body && (document.body.clientWidth || document.body.clientHeight) && !this.isSafari()) {
    dimension.width = document.body.clientWidth;
    dimension.height = document.body.clientHeight;
  } else if(typeof(window.innerWidth) == 'number') {
    dimension.width = window.innerWidth;
    dimension.height = window.innerHeight;
  }
  return dimension;
};
RichMediaCore_56_03.prototype.getScrollbarPosition = function() {
  var scrollPos = new Object();
  scrollPos.scrollTop = 0;
  scrollPos.scrollLeft = 0;
  if(typeof(window.pageYOffset) == 'number') {
    scrollPos.scrollTop = window.pageYOffset;
    scrollPos.scrollLeft = window.pageXOffset;
  } else if(document.body && (document.body.scrollLeft || document.body.scrollTop)) {
    scrollPos.scrollTop = document.body.scrollTop;
    scrollPos.scrollLeft = document.body.scrollLeft;
  } else if(document.documentElement && (document.documentElement.scrollLeft || document.documentElement.scrollTop)) {
    scrollPos.scrollTop = document.documentElement.scrollTop;
    scrollPos.scrollLeft = document.documentElement.scrollLeft;
  }
  return scrollPos;
};
RichMediaCore_56_03.prototype.isInFriendlyIFrame = function() {
  return (this.isInMsnFriendlyIFrame() || this.isInAolFriendlyIFrame()
          || this.isInYahooFriendlyIFrame() || this.isInClientPreviewIFrame());
};
RichMediaCore_56_03.prototype.isInMsnFriendlyIFrame = function() {
  return (typeof(inDapIF) != "undefined" && inDapIF);
};
RichMediaCore_56_03.prototype.isInAolFriendlyIFrame = function() {
  return (typeof(inFIF) != "undefined" && inFIF);
};
RichMediaCore_56_03.prototype.isInMsnAjaxEnvironment = function() {
  return (typeof(inDapMgrIf) != "undefined" && inDapMgrIf);
};
RichMediaCore_56_03.prototype.isInYahooFriendlyIFrame = function() {
  return (typeof(isAJAX) != "undefined" && isAJAX);
};
RichMediaCore_56_03.prototype.isInClientPreviewIFrame = function() {
  if(typeof(StudioPreviewResponse) != "undefined") {
    return !(new StudioPreviewResponse()).isAdslotDetected;
  } else {
    return false;
  }
};
RichMediaCore_56_03.prototype.isInAdSenseIFrame = function() {
  return (typeof(IN_ADSENSE_IFRAME) != "undefined") && IN_ADSENSE_IFRAME;
};
RichMediaCore_56_03.prototype.checkDimension = function(dim) {
  if (typeof dim == "number") {
    return dim + "px";
  } else {
    return dim + (dim != "" && dim != "auto" && dim.indexOf("px") < 0 ? "px" : "");
  }
};
RichMediaCore_56_03.prototype.setFlashVariable = function(asVersion, flashObject, variableName, value) {
  if (asVersion == 1) {
    flashObject.SetVariable("_root." + variableName, value);
  } else {
    flashObject.changeInputVariable(variableName, value);
  }
};
RichMediaCore_56_03.prototype.getFlashVariable = function(asVersion, flashObject, variableName) {
  if (asVersion == 1) {
    return flashObject.GetVariable("_root." + variableName);
  } else {
    return flashObject.getFlashVariable(variableName);
  }
};
RichMediaCore_56_03.prototype.getSalign = function(expandedWidth, expandedHeight, offsetTop, offsetLeft, offsetRight, offsetBottom) {
  var salign = "";
  if (offsetTop == 0 && offsetBottom != expandedHeight) {
    salign += "T";
  } else if (offsetTop != 0 && offsetBottom == expandedHeight) {
    salign += "B";
  }
  if (offsetLeft == 0 && offsetRight != expandedWidth) {
    salign += "L";
  } else if (offsetLeft != 0 && offsetRight == expandedWidth) {
    salign += "R";
  }
  if ((salign == "T" || salign == "B") && (offsetLeft != 0 || offsetRight != expandedWidth)) {
    return "";
  }
  if ((salign == "L" || salign == "R") && (offsetTop != 0 || offsetBottom != expandedHeight)) {
    return "";
  }
  return salign;
};
RichMediaCore_56_03.prototype.usesSalignForExpanding = function(salign, wmode) {
  return ( (this.isMac() && (this.isSafari() || this.isFirefox()))
           || (this.isWindows() && this.isFirefox() && wmode.toLowerCase() == "window") ) && salign.length > 0;
};
RichMediaCore_56_03.prototype.unclipFlashObject = function(asset, width, height) {
  this.clipFlashObject(asset, width, height, "auto", "auto", "auto", "auto");
};
RichMediaCore_56_03.prototype.clipFlashObject = function(asset, width, height, offsetTop, offsetRight, offsetBottom, offsetLeft) {
  width        = this.checkDimension(width);
  height       = this.checkDimension(height);
  offsetTop    = this.checkDimension(offsetTop);
  offsetRight  = this.checkDimension(offsetRight);
  offsetBottom = this.checkDimension(offsetBottom);
  offsetLeft   = this.checkDimension(offsetLeft);
  if (this.usesSalignForExpanding(asset.salign, asset.wmode)) {
    var fl = document.getElementById("FLASH_"+asset.variableName);
    fl.style.width = width;
    fl.style.height = height;
    fl.width = width;
    fl.height = height;
    fl.style.marginLeft = offsetLeft == "auto" ? "0px" : offsetLeft;
    fl.style.marginTop = offsetTop == "auto" ? "0px" : offsetTop;
  }
  var exp = this.toObject("DIV_" + asset.variableName);
  exp.style.clip = "rect(" + offsetTop + " " + offsetRight + " " + offsetBottom + " " + offsetLeft + ")";
};
RichMediaCore_56_03.prototype.getSitePageUrl = function(creative) {
  if (creative.type == this.CREATIVE_TYPE_INPAGE_WITH_OVERLAY) {
    return "";
  }
  if (creative.previewMode) {
    return creative.livePreviewSiteUrl;
  } else {
    if (creative.type == this.CREATIVE_TYPE_INPAGE && creative.servingMethod == "i") {
      return self.document.referrer;
    } else {
      return self.location.href;
    }
  }
};
RichMediaCore_56_03.prototype.getElementPosition = function(elementName) {
  var obj = this.toObject(elementName);
  var adPosition = new Object();
  if(obj.getBoundingClientRect) {
  	adPosition.left = obj.getBoundingClientRect().left;
  	adPosition.top = obj.getBoundingClientRect().top;
  } else {
    adPosition.left = 0;
    adPosition.top = 0;
    if (obj.offsetParent) {
      do {
        adPosition.left += obj.offsetLeft;
        adPosition.top += obj.offsetTop;
      } while (obj = obj.offsetParent);
    }
    var windowScroll = this.getScrollbarPosition();
    adPosition.top -= windowScroll.scrollTop;
    adPosition.left -= windowScroll.scrollLeft;
  }
  return adPosition;
};

document.write('\n \n              ');

              function PlcrInfo(filename, uid) {
                this.filename = filename;
                this.uniqueId = uid;
              }
              var richMediaPlcrMap = {};
              richMediaPlcrMap["0"] = new PlcrInfo("plcr_1323207_0_1274815925391.js", "1274815920576");
              richMediaPlcrMap["225327464"] = new PlcrInfo("plcr_1323207_225327464_1274815925360.js", "1274815920545");
              richMediaPlcrMap["225327516"] = new PlcrInfo("plcr_1323207_225327516_1274815925391.js", "1274815920561");
              var richMediaPlcrMap_1274815920576 = richMediaPlcrMap;
              var plcrInfo_1274815920576 = richMediaPlcrMap_1274815920576["225327464"];
              if (!plcrInfo_1274815920576) {
                plcrInfo_1274815920576 = richMediaPlcrMap_1274815920576["0"];
              }
              function RichMediaCreative_1274815920576(type) {
                var core = new RichMediaCore_56_03();
                this.creativeIdentifier = "GlobalTemplate_" + "1274815920576" + (new Date()).getTime();
                this.mtfNoFlush = "".toLowerCase();
                this.globalTemplateVersion = "56_03";
                this.isInterstitial = false;
                this.mediaServer = "http://s0.2mdn.net";
                this.adServer = "http://ad.doubleclick.net";
                this.adserverUrl = "http://ad.doubleclick.net/activity;src=1295336;met=1;v=1;pid=49110971;aid=225327464;ko=0;cid=36923163;rid=36941041;rv=1;";
                this.stringPostingUrl = "http://ad.doubleclick.net/activity;src=1295336;stragg=1;v=1;pid=49110971;aid=225327464;ko=0;cid=36923163;rid=36941041;rv=1;rn=2485194;";
                this.swfParams = 'ct=FR&st=&ac=1&zp=&bw=2&dma=1&city=4984&src=1295336&rv=1&rid=36941041&=300x250&';
                this.renderingId = "36941041";
                this.previewMode = (("%PreviewMode" == "true") ? true : false);
                this.debugEventsMode = (("%DebugEventsMode" == "true") ? true : false);
                this.pubHideObjects = "";
                this.pubHideApplets = "";
                this.mtfInline = ("".toLowerCase() == "true");
                this.pubTop  = core.convertUnit("");
                this.pubLeft = core.convertUnit("");
                this.pubDuration = "";
                this.pubWMode = "";
                this.isRelativeBody = ("" == "relative") ? true : false;
                this.debugJSMode = ("" == "true") ? true : false;
                this.adjustOverflow = ("" == "true");
                this.asContext = (('' != "") ? ('&keywords=' + '') : "")
                                  + (('' != "") ? ('&latitude=' + '') : "")
                                  + (('' != "") ? ('&longitude=' + '') : "");
                this.clickThroughUrl = "http://ad.doubleclick.net/click%3Bh%3Dv8/3a04/3/0/%2a/b%3B225327464%3B0-0%3B0%3B49110971%3B4307-300/250%3B36923163/36941041/1%3B%3B%7Esscs%3D%3f";
                this.clickN = "";
                this.type = type;
                this.uniqueId = plcrInfo_1274815920576.uniqueId;
                this.thirdPartyImpUrl = "";
                this.thirdPartyFlashDisplayUrl = "";
                this.thirdPartyBackupImpUrl = "";
                this.surveyUrl = "";
                this.googleContextDiscoveryUrl = "http://pagead2.googlesyndication.com/pagead/ads?client=dclk-3pas-query&output=xml&geo=true";
                this.livePreviewSiteUrl = "%LivePreviewSiteUrl";
                this.servingMethod = "j";
                if(this.previewMode && this.googleContextDiscoveryUrl.indexOf("adtest=on") == -1) {
                  this.googleContextDiscoveryUrl += "&adtest=on";
                }
                this.macro_j = "2469262202763280483-1747315658";
                this.macro_eenv = "j";
                this.macro_g = "ct=FR&st=&ac=1&zp=&bw=2&dma=1&city=4984";
                this.macro_s = "N4270.Dzone";
                this.macro_eaid = "225327464";
                this.macro_n = "2485194";
                this.macro_m = "2469262202763280483";
                this.macro_erid = "36941041";
                this.macro_ebuy = "4536580";
                this.macro_ecid = "36923163";
                this.macro_erv = "1";
                this.macro_epid = "49110971";
                this.macro_eadv = "1295336";
                this.macro_esid = "877223";
                this.macro_ekid = "0";
              }
              eval("RichMediaCreative_"+plcrInfo_1274815920576.uniqueId+" = RichMediaCreative_1274815920576;");
              
document.write('\n          \n                ');

                function generateFixedFlashCode() {
                    var core = new RichMediaCore_56_03();
                    var creative = new RichMediaCreative_1274815920576(core.CREATIVE_TYPE_INPAGE);
                    RichMediaCreative_1274815920576.prototype.csiBaseline = new Date().getTime();
                    RichMediaCreative_1274815920576.prototype.csiAdRespTime = 
                        isNaN("") ? -1 : RichMediaCreative_1274815920576.prototype.csiBaseline - parseFloat("");
                    RichMediaCreative_1274815920576.prototype.globalTemplateJs = "http://s0.2mdn.net/879366/inpageGlobalTemplate_v2_56_03"
                        + (creative.debugJSMode ? "_origin" : "" ) + ".js";
                    core.logThirdPartyImpression(creative);
                    if(core.isBrowserComplient(9)) {
                        var plcrJs = "http://s0.2mdn.net/1295336/" + plcrInfo_1274815920576.filename;
                        RichMediaCore_56_03.prototype.trackCsiEvent("pb");  
                        document.write('<scr' + 'ipt src="' + plcrJs + '" language="JavaScript"></scr' + 'ipt>');
                    }
                    else {
                        document.write('<A TARGET="_blank" HREF="http://ad.doubleclick.net/activity;src%3D1295336%3Bmet%3D1%3Bv%3D1%3Bpid%3D49110971%3Baid%3D225327464%3Bko%3D0%3Bcid%3D36923163%3Brid%3D36941041%3Brv%3D1%3Bcs%3Dq%3Beid1%3D288767%3Becn1%3D1%3Betm1%3D0%3B_dc_redir%3Durl%3fhttp://ad.doubleclick.net/click%3Bh%3Dv8/3a04/3/0/%2a/b%3B225327464%3B0-0%3B0%3B49110971%3B4307-300/250%3B36923163/36941041/1%3B%3B%7Esscs%3D%3fhttp://www.adobe.com/devnet/flex/videotraining/?sdid=GXWFB"><IMG SRC="http://s0.2mdn.net/1295336/PID_1323207_Adobe_Flashbuilder_Trade_300x250_img.gif" width="300" height="250" BORDER=0 alt=""></A>');
                        core.trackBackupImageEvent(creative.adserverUrl);
                        core.logThirdPartyBackupImageImpression(creative, false);
                    }
                    core.writeSurveyURL(creative);
                }
                generateFixedFlashCode();
                
document.write('\n                <NOSCRIPT>\n                    <A TARGET=\"_blank\" HREF=\"http://ad.doubleclick.net/activity;src%3D1295336%3Bmet%3D1%3Bv%3D1%3Bpid%3D49110971%3Baid%3D225327464%3Bko%3D0%3Bcid%3D36923163%3Brid%3D36941041%3Brv%3D1%3Bcs%3Dq%3Beid1%3D288767%3Becn1%3D1%3Betm1%3D0%3B_dc_redir%3Durl%3fhttp://ad.doubleclick.net/click%3Bh%3Dv8/3a04/3/0/%2a/b%3B225327464%3B0-0%3B0%3B49110971%3B4307-300/250%3B36923163/36941041/1%3B%3B%7Esscs%3D%3fhttp://www.adobe.com/devnet/flex/videotraining/?sdid=GXWFB\">\n                    <IMG SRC=\"http://s0.2mdn.net/1295336/PID_1323207_Adobe_Flashbuilder_Trade_300x250_img.gif\" width=\"300\" height=\"250\" BORDER=\"0\" alt=\"\">\n                    </A>\n                    <IMG SRC=\"http://ad.doubleclick.net/activity;src=1295336;met=1;v=1;pid=49110971;aid=225327464;ko=0;cid=36923163;rid=36941041;rv=1;&timestamp=2485194;eid1=9;ecn1=1;etm1=0;\" width=\"0px\" height=\"0px\" style=\"visibility:hidden\" BORDER=\"0\"/>\n                    <IMG SRC=\"\" width=\"0px\" height=\"0px\" style=\"visibility:hidden\" BORDER=\"0\"/>\n                    <IMG SRC=\"\" width=\"0px\" height=\"0px\" style=\"visibility:hidden\" BORDER=\"0\"/>\n                </NOSCRIPT>\n                ');

                    var core = new RichMediaCore_56_03();
                    if(core.isInMsnAjaxEnvironment()) {
                        window.setTimeout("document.close();", 1000);
                    }
                
document.write('\n');
