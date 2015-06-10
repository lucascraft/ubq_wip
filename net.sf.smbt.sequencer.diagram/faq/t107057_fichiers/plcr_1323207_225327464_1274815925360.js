 
              if(typeof(dartRichmediaCreatives) == "undefined") {
                dartRichmediaCreatives = new Array();
              }
              function PlacementCreative_1274815920545(creative) {
                for(var property in creative) {
                  this[property] = creative[property];
                }
                this.getAsset = function(type) {
                    return this.assets[type];
                }
                this.macrosInExits = new Object();
                  this.macrosInExits["%j"] = "j";
                  this.macrosInExits["%eenv!"] = "eenv";
                  this.macrosInExits["%g"] = "g";
                  this.macrosInExits["%s"] = "s";
                  this.macrosInExits["%eaid!"] = "eaid";
                  this.macrosInExits["%n"] = "n";
                  this.macrosInExits["%m"] = "m";
                  this.macrosInExits["%erid!"] = "erid";
                  this.macrosInExits["%ebuy!"] = "ebuy";
                  this.macrosInExits["%ecid!"] = "ecid";
                  this.macrosInExits["%erv!"] = "erv";
                  this.macrosInExits["%epid!"] = "epid";
                  this.macrosInExits["%eadv!"] = "eadv";
                  this.macrosInExits["%esid!"] = "esid";
                  this.macrosInExits["%ekid!"] = "ekid";
                this.replaceMacros = function(url, creative) {
                  for(var macro in this.macrosInExits) {
                    if(url.indexOf(macro) != -1) {
                      var value = creative["macro_" + this.macrosInExits[macro]];
                      url = url.replace(new RegExp(macro, "g"), value);
                    }
                  }
                  return url;
                }
                this.fullScreenEnabled = false;
                this.requiredPlayerVersion = 9;
                this.asVersion = 3;
                this.assets = new Object();
                this.exitEvents = new Object();
                this.timerEvents = new Object();
                this.counterEvents = new Object();
                this.standardEvents = new Object();
                this.standardEvents["EVENT_VIDEO_UNMUTE"] = {
                  reportingId: "21"
                };
                this.standardEvents["EVENT_VIDEO_PLAY"] = {
                  reportingId: "11"
                };
                this.standardEvents["FULL_SCREEN_VIDEO_PLAYS"] = {
                  reportingId: "5"
                };
                this.standardEvents["EVENT_VIDEO_VIEW_TIMER"] = {
                  reportingId: "12"
                };
                this.standardEvents["FULL_SCREEN_VIDEO_COMPLETES"] = {
                  reportingId: "6"
                };
                this.standardEvents["EVENT_MANUAL_CLOSE"] = {
                  reportingId: "8"
                };
                this.standardEvents["FULL_SCREEN_AVERAGE_VIEW_TIME"] = {
                  reportingId: "7"
                };
                this.standardEvents["DISPLAY_TIMER"] = {
                  reportingId: "2"
                };
                this.standardEvents["INTERACTION_TIMER"] = {
                  reportingId: "3"
                };
                this.standardEvents["DYNAMIC_CREATIVE_IMPRESSION"] = {
                  reportingId: "23"
                };
                this.standardEvents["EVENT_VIDEO_STOP"] = {
                  reportingId: "20"
                };
                this.standardEvents["EVENT_VIDEO_REPLAY"] = {
                  reportingId: "17"
                };
                this.standardEvents["EVENT_VIDEO_MUTE"] = {
                  reportingId: "16"
                };
                this.standardEvents["EXPAND_TIMER"] = {
                  reportingId: "10"
                };
                this.standardEvents["EVENT_VIDEO_INTERACTION"] = {
                  reportingId: "14"
                };
                this.standardEvents["EVENT_VIDEO_MIDPOINT"] = {
                  reportingId: "18"
                };
                this.standardEvents["FULL_SCREEN_VIDEO"] = {
                  reportingId: "19"
                };
                this.standardEvents["EVENT_FULLSCREEN"] = {
                  reportingId: "22"
                };
                this.standardEvents["EVENT_USER_INTERACTION"] = {
                  reportingId: "4"
                };
                this.standardEvents["BACKUP_IMAGE_IMPRESSION"] = {
                  reportingId: "9"
                };
                this.standardEvents["EVENT_VIDEO_COMPLETE"] = {
                  reportingId: "13"
                };
                this.standardEvents["EVENT_VIDEO_PAUSE"] = {
                  reportingId: "15"
                };
                this.exitEvents["Get Started_exit"] = {
                    reportingId: 288767,
                    url: this.replaceMacros("http://www.adobe.com/devnet/flex/videotraining/?sdid=GXWFB", creative),
                    customizedWindow: false,
                    windowFeatures: "width=-1,height=-1,top=0,left=0,location=yes,menubar=yes,status=yes,toolbar=yes,scrollbars=yes",
                    targetWindow: "_blank"
                };
                this.exitEvents["Adobe Logo_exit"] = {
                    reportingId: 288789,
                    url: this.replaceMacros("http://www.adobe.com/devnet/flex/videotraining/?sdid=GXWFB", creative),
                    customizedWindow: false,
                    windowFeatures: "width=-1,height=-1,top=0,left=0,location=yes,menubar=yes,status=yes,toolbar=yes,scrollbars=yes",
                    targetWindow: "_blank"
                };
                this.timerEvents["Deepa:ViewTime"] = {
                    reportingId: 288779,
                    sourceComponentName: "Deepa",
                    sourceStandardEventId: "12"
                };
                this.timerEvents["preload_video:ViewTime"] = {
                    reportingId: 288804,
                    sourceComponentName: "preload_video",
                    sourceStandardEventId: "12"
                };
                this.timerEvents["Kevin:ViewTime"] = {
                    reportingId: 288772,
                    sourceComponentName: "Kevin",
                    sourceStandardEventId: "12"
                };
                this.timerEvents["Total Video View Timer_timer"] = {
                    reportingId: 288785,
                    sourceComponentName: "",
                    sourceStandardEventId: "-1"
                };
                this.timerEvents["Chet:ViewTime"] = {
                    reportingId: 288805,
                    sourceComponentName: "Chet",
                    sourceStandardEventId: "12"
                };
                this.counterEvents["preload_video:Unmute"] = {
                    reportingId: 288795,
                    sourceComponentName: "preload_video",
                    sourceStandardEventId: "21"
                };
                this.counterEvents["Face 4_fb logo_counter"] = {
                    reportingId: 288791,
                    sourceComponentName: "",
                    sourceStandardEventId: "-1"
                };
                this.counterEvents["Deepa:Unmute"] = {
                    reportingId: 288782,
                    sourceComponentName: "Deepa",
                    sourceStandardEventId: "21"
                };
                this.counterEvents["preload_video:Interaction"] = {
                    reportingId: 288761,
                    sourceComponentName: "preload_video",
                    sourceStandardEventId: "14"
                };
                this.counterEvents["Face 1_deepa video_counter"] = {
                    reportingId: 288793,
                    sourceComponentName: "",
                    sourceStandardEventId: "-1"
                };
                this.counterEvents["Chet:Unmute"] = {
                    reportingId: 288803,
                    sourceComponentName: "Chet",
                    sourceStandardEventId: "21"
                };
                this.counterEvents["BG Restart_counter"] = {
                    reportingId: 288786,
                    sourceComponentName: "",
                    sourceStandardEventId: "-1"
                };
                this.counterEvents["Chet:Complete"] = {
                    reportingId: 288808,
                    sourceComponentName: "Chet",
                    sourceStandardEventId: "13"
                };
                this.counterEvents["Deepa:Interaction"] = {
                    reportingId: 288800,
                    sourceComponentName: "Deepa",
                    sourceStandardEventId: "14"
                };
                this.counterEvents["Kevin:MidPoint"] = {
                    reportingId: 288771,
                    sourceComponentName: "Kevin",
                    sourceStandardEventId: "18"
                };
                this.counterEvents["Deepa:Stop"] = {
                    reportingId: 288763,
                    sourceComponentName: "Deepa",
                    sourceStandardEventId: "20"
                };
                this.counterEvents["Face 2_chet video_counter"] = {
                    reportingId: 288799,
                    sourceComponentName: "",
                    sourceStandardEventId: "-1"
                };
                this.counterEvents["Chet:Pause"] = {
                    reportingId: 288762,
                    sourceComponentName: "Chet",
                    sourceStandardEventId: "15"
                };
                this.counterEvents["Kevin:Interaction"] = {
                    reportingId: 288802,
                    sourceComponentName: "Kevin",
                    sourceStandardEventId: "14"
                };
                this.counterEvents["Chet:Interaction"] = {
                    reportingId: 288797,
                    sourceComponentName: "Chet",
                    sourceStandardEventId: "14"
                };
                this.counterEvents["Audio off_counter"] = {
                    reportingId: 288787,
                    sourceComponentName: "",
                    sourceStandardEventId: "-1"
                };
                this.counterEvents["preload_video:Mute"] = {
                    reportingId: 288770,
                    sourceComponentName: "preload_video",
                    sourceStandardEventId: "16"
                };
                this.counterEvents["preload_video:Replay"] = {
                    reportingId: 288780,
                    sourceComponentName: "preload_video",
                    sourceStandardEventId: "17"
                };
                this.counterEvents["Chet:MidPoint"] = {
                    reportingId: 288809,
                    sourceComponentName: "Chet",
                    sourceStandardEventId: "18"
                };
                this.counterEvents["Chet:Mute"] = {
                    reportingId: 288798,
                    sourceComponentName: "Chet",
                    sourceStandardEventId: "16"
                };
                this.counterEvents["Deepa:MidPoint"] = {
                    reportingId: 288794,
                    sourceComponentName: "Deepa",
                    sourceStandardEventId: "18"
                };
                this.counterEvents["Kevin:Stop"] = {
                    reportingId: 288776,
                    sourceComponentName: "Kevin",
                    sourceStandardEventId: "20"
                };
                this.counterEvents["Face 3_kevin video_counter"] = {
                    reportingId: 288764,
                    sourceComponentName: "",
                    sourceStandardEventId: "-1"
                };
                this.counterEvents["Face 6_CTA_counter"] = {
                    reportingId: 288784,
                    sourceComponentName: "",
                    sourceStandardEventId: "-1"
                };
                this.counterEvents["Deepa:Play"] = {
                    reportingId: 288766,
                    sourceComponentName: "Deepa",
                    sourceStandardEventId: "11"
                };
                this.counterEvents["Kevin:Replay"] = {
                    reportingId: 288769,
                    sourceComponentName: "Kevin",
                    sourceStandardEventId: "17"
                };
                this.counterEvents["Audo on_counter"] = {
                    reportingId: 288807,
                    sourceComponentName: "",
                    sourceStandardEventId: "-1"
                };
                this.counterEvents["Deepa:Replay"] = {
                    reportingId: 288773,
                    sourceComponentName: "Deepa",
                    sourceStandardEventId: "17"
                };
                this.counterEvents["Face 5_CTA_counter"] = {
                    reportingId: 288796,
                    sourceComponentName: "",
                    sourceStandardEventId: "-1"
                };
                this.counterEvents["preload_video:Stop"] = {
                    reportingId: 288781,
                    sourceComponentName: "preload_video",
                    sourceStandardEventId: "20"
                };
                this.counterEvents["Kevin:Pause"] = {
                    reportingId: 288790,
                    sourceComponentName: "Kevin",
                    sourceStandardEventId: "15"
                };
                this.counterEvents["Deepa:Complete"] = {
                    reportingId: 288760,
                    sourceComponentName: "Deepa",
                    sourceStandardEventId: "13"
                };
                this.counterEvents["preload_video:Pause"] = {
                    reportingId: 288778,
                    sourceComponentName: "preload_video",
                    sourceStandardEventId: "15"
                };
                this.counterEvents["Chet:Play"] = {
                    reportingId: 288788,
                    sourceComponentName: "Chet",
                    sourceStandardEventId: "11"
                };
                this.counterEvents["Kevin:Complete"] = {
                    reportingId: 288758,
                    sourceComponentName: "Kevin",
                    sourceStandardEventId: "13"
                };
                this.counterEvents["preload_video:Complete"] = {
                    reportingId: 288792,
                    sourceComponentName: "preload_video",
                    sourceStandardEventId: "13"
                };
                this.counterEvents["Deepa:Pause"] = {
                    reportingId: 288759,
                    sourceComponentName: "Deepa",
                    sourceStandardEventId: "15"
                };
                this.counterEvents["Kevin:Mute"] = {
                    reportingId: 288775,
                    sourceComponentName: "Kevin",
                    sourceStandardEventId: "16"
                };
                this.counterEvents["preload_video:Play"] = {
                    reportingId: 288768,
                    sourceComponentName: "preload_video",
                    sourceStandardEventId: "11"
                };
                this.counterEvents["Kevin:Play"] = {
                    reportingId: 288783,
                    sourceComponentName: "Kevin",
                    sourceStandardEventId: "11"
                };
                this.counterEvents["Chet:Replay"] = {
                    reportingId: 288801,
                    sourceComponentName: "Chet",
                    sourceStandardEventId: "17"
                };
                this.counterEvents["Kevin:Unmute"] = {
                    reportingId: 288765,
                    sourceComponentName: "Kevin",
                    sourceStandardEventId: "21"
                };
                this.counterEvents["Deepa:Mute"] = {
                    reportingId: 288774,
                    sourceComponentName: "Deepa",
                    sourceStandardEventId: "16"
                };
                this.counterEvents["Chet:Stop"] = {
                    reportingId: 288777,
                    sourceComponentName: "Chet",
                    sourceStandardEventId: "20"
                };
                this.counterEvents["preload_video:MidPoint"] = {
                    reportingId: 288806,
                    sourceComponentName: "preload_video",
                    sourceStandardEventId: "18"
                };
                var exitKeyvalues = "";
                var delimiter = "{DELIM}";
                for(var exitName in this.exitEvents) {
                  var exit = this.exitEvents[exitName];
                  var value = "name:" + escape(exitName) + "," + "url:" + escape(exit.url) + ","
                                + "target:" + (exit.customizedWindow ? "popup" : escape(exit.targetWindow)) + delimiter;
                  exitKeyvalues += value;
                }
                exitKeyvalues = exitKeyvalues.substring(0, exitKeyvalues.length - delimiter.length);
                this.videoComponents = new Object();
                this.videoComponents["preload_video"] = {
                  trackCustomEvents: true,
                  startMuted: false,
                  autoBuffer: true,
                  lowBWVideo: "http://gcdn.2mdn.net/MotifFiles/html/GTS/Aqua_pod/ADO003/videos/Deepa_100.flv",
                  midBWVideo: "http://gcdn.2mdn.net/MotifFiles/html/GTS/Aqua_pod/ADO003/videos/Deepa_200.flv",
                  highBWVideo: "http://gcdn.2mdn.net/MotifFiles/html/GTS/Aqua_pod/ADO003/videos/Deepa_200.flv",
                  lowBWFallbackVideo: "",
                  midBWFallbackVideo: "",
                  highBWFallbackVideo: "",
                  loopCount: 0,
                  isStreaming: false
                };
                this.videoComponents["Deepa"] = {
                  trackCustomEvents: true,
                  startMuted: false,
                  autoBuffer: true,
                  lowBWVideo: "http://gcdn.2mdn.net/MotifFiles/html/GTS/Aqua_pod/ADO003/videos/Deepa_100.flv",
                  midBWVideo: "http://gcdn.2mdn.net/MotifFiles/html/GTS/Aqua_pod/ADO003/videos/Deepa_200.flv",
                  highBWVideo: "http://gcdn.2mdn.net/MotifFiles/html/GTS/Aqua_pod/ADO003/videos/Deepa_200.flv",
                  lowBWFallbackVideo: "",
                  midBWFallbackVideo: "",
                  highBWFallbackVideo: "",
                  loopCount: 0,
                  isStreaming: false
                };
                this.videoComponents["Kevin"] = {
                  trackCustomEvents: true,
                  startMuted: false,
                  autoBuffer: false,
                  lowBWVideo: "http://gcdn.2mdn.net/MotifFiles/html/GTS/Aqua_pod/ADO003/videos/Kevin_200.flv",
                  midBWVideo: "http://gcdn.2mdn.net/MotifFiles/html/GTS/Aqua_pod/ADO003/videos/Kevin_200.flv",
                  highBWVideo: "http://gcdn.2mdn.net/MotifFiles/html/GTS/Aqua_pod/ADO003/videos/Kevin_200.flv",
                  lowBWFallbackVideo: "",
                  midBWFallbackVideo: "",
                  highBWFallbackVideo: "",
                  loopCount: 0,
                  isStreaming: false
                };
                this.videoComponents["Chet"] = {
                  trackCustomEvents: true,
                  startMuted: false,
                  autoBuffer: false,
                  lowBWVideo: "http://gcdn.2mdn.net/MotifFiles/html/GTS/Aqua_pod/ADO003/videos/Chet_100.flv",
                  midBWVideo: "http://gcdn.2mdn.net/MotifFiles/html/GTS/Aqua_pod/ADO003/videos/Chet_200.flv",
                  highBWVideo: "http://gcdn.2mdn.net/MotifFiles/html/GTS/Aqua_pod/ADO003/videos/Chet_200.flv",
                  lowBWFallbackVideo: "",
                  midBWFallbackVideo: "",
                  highBWFallbackVideo: "",
                  loopCount: 0,
                  isStreaming: false
                };
                this.isAbsoluteUrl = function(url) {
                  return (url.indexOf("http:") == 0 || url.indexOf("rtmp:") == 0);
                }
                this.childAssets = new Object();
                  this.childAssets["Adobe_FlashBuilder_flashcube_300x250_RM_main.swf"] = {
                    isHostedByCdn: false,
                    cdnName: "PID_1323207_Adobe_FlashBuilder_flashcube_300x250_RM_main.swf",
                    isVideo: false,
                    streamingUrl: "",
                    progressiveUrl: ""
                  }
                this.assetsKeyValues = "";
                for(var assetName in this.childAssets) {
                  var asset = this.childAssets[assetName];
                  if(!asset.isHostedByCdn) {
                    var fileUrl = creative.mediaServer + "/1295336/" + asset.cdnName;
                    this.assetsKeyValues += escape(assetName) + "=" + escape(fileUrl) + "&";
                  } else if(asset.isVideo) {
                    this.assetsKeyValues += escape("STR_" + assetName) + "=" + escape(asset.streamingUrl) + "&";
                    this.assetsKeyValues += escape("PRO_" + assetName) + "=" + escape(asset.progressiveUrl) + "&";
                  } else {
                    this.assetsKeyValues += escape(assetName) + "=" + escape(asset.progressiveUrl) + "&";
                  }
                }
                var videoKeyValues = "";
                this.processVideoUrl = function(videoUrl, downloadPrefix, urlType, videoComponentName) {
                  var urlKey;
                  if(this.isAbsoluteUrl(videoUrl)) {
                    urlKey = escape(urlType + "_" + videoComponentName);
                    this.assetsKeyValues += urlKey + "=" + escape(videoUrl) + "&";
                  } else {
                    urlKey = videoUrl.length > 0 ? escape(downloadPrefix + videoUrl) : "";
                  }
                  return urlKey;
                }
                var componentDelimiter = "{DELIM}";
                for(var name in this.videoComponents) {
                  var vc = this.videoComponents[name];
                  var prefix = (vc.isStreaming) ? "STR_" : "PRO_";
                  var value = "name:" + escape(name) + ",startMuted:" + escape(vc.startMuted)
                       + ",autoBuffer:" + escape(vc.autoBuffer) + ",loopCount:" + escape(vc.loopCount)
                       + ",isStreaming:" + escape(vc.isStreaming);
                  var lowVideo = this.processVideoUrl(vc.lowBWVideo, prefix, "low_video", name);
                  var midVideo = this.processVideoUrl(vc.midBWVideo, prefix, "mid_video", name);
                  var highVideo = this.processVideoUrl(vc.highBWVideo, prefix, "high_video", name);
                  var fallbackLowVideo = this.processVideoUrl(vc.lowBWFallbackVideo, "PRO_", "low_fallback", name);
                  var fallbackMidVideo = this.processVideoUrl(vc.midBWFallbackVideo, "PRO_", "mid_fallback", name);
                  var fallbackHighVideo = this.processVideoUrl(vc.highBWFallbackVideo, "PRO_", "high_fallback", name);
                  value += ",vfp_low:" + lowVideo + ",vfp_mid:" + midVideo + ",vfp_high:" + highVideo
                          + ",pfp_low:" + fallbackLowVideo + ",pfp_mid:" + fallbackMidVideo
                          + ",pfp_high:" + fallbackHighVideo + componentDelimiter;
                  videoKeyValues += value;
                }
                videoKeyValues = videoKeyValues.substring(0, videoKeyValues.length - componentDelimiter.length);
                this.assetsKeyValues = this.assetsKeyValues.substring(0, this.assetsKeyValues.length - 1);
                var isGCNAd = (creative.asContext != "") ? "true" : "false";
                var adSiteUrl = core.getSitePageUrl(creative);
                this.queryStringBase = this.swfParams + '&click='+ escape(creative.clickThroughUrl)
                                      + '&clickN=' + creative.clickN + '&rid=' + creative.renderingId
                                      + "&assets=" + escape(this.assetsKeyValues)
                                      + "&vcData=" + escape(videoKeyValues)
                                      + "&exitEvents=" + escape(exitKeyvalues)
                                      + "&googleDiscoveryUrl=" + escape(creative.googleContextDiscoveryUrl)
                                      + "&adSiteUrl=" + escape(adSiteUrl)
                                      + "&isGCNAd=" + isGCNAd;
             }
          
               function InPage_1274815920545(creative, type) {
                  this.variableName = "0_1_" + (new Date()).getTime();
                  this.url = creative.mediaServer + "/1295336/PID_1323207_Adobe_FlashBuilder_flashcube_300x250_RM_polite.swf";
                  this.altText = "";
                  this.width = "300";
                  this.height = "250";
                  this.wmode = "opaque";
                  this.duration = "none";
                  this.startTime = 0;
                  this.assetType = type;
                  this.isMainAsset = true;
                  this.cssProperty = "";
                  this.zIndex = "999";
                  this.bgColor = "#";
                  this.queryString = creative.queryStringBase + '&varName=' + this.variableName
                          + '&td=' + escape(self.location.hostname)
                          + creative.asContext + "&assetType=" + type;
              }
              var core = new RichMediaCore_56_03();
              var baseCreative = new RichMediaCreative_1274815920545(core.CREATIVE_TYPE_INPAGE);
              var creative = new PlacementCreative_1274815920545(baseCreative);
              creative.assets[core.ASSET_TYPE_INPAGE] = new InPage_1274815920545(creative, core.ASSET_TYPE_INPAGE);
              dartRichmediaCreatives[dartRichmediaCreatives.length] = creative;
              RichMediaCore_56_03.prototype.trackCsiEvent("gb");  
              document.write('<scr' + 'ipt src="' + baseCreative.globalTemplateJs + '" language="JavaScript"></scr' + 'ipt>');
              RichMediaCore_56_03.prototype.trackCsiEvent("pe") 
