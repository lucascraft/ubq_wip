isHuman=false;
iFrameSet=false;
startMonitoring();
function startMonitoring(){
if(document.addEventListener){
window.onclick=function(){
validateHuman();
};
window.onkeyup=function(){
validateHuman();
};
}else{
if(window.document.attachEvent){
window.document.attachEvent("onkeyup",validateHuman);
window.document.attachEvent("onclick",validateHuman);
}
}
}
function validateHuman(e){
if(isHuman){
return true;
}
if(!iFrameSet){
insertIframe=document.createElement("IFRAME");
insertIframe.setAttribute("src","/contentmgr/formatter/blank.htm");
insertIframe.id="setashuman";
insertIframe.style.width="0px";
insertIframe.style.height="0px";
document.body.appendChild(insertIframe);
iFrameSet=true;
}
if(document.getElementById("setashuman")){
var _2=document.createElement("script");
_2.src="/webos/turingtest_sethuman.js";
_2.type="text/javascript";
document.getElementsByTagName("head")[0].appendChild(_2);
isHuman=true;
}
}

