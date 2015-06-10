/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2008 - 2010, Lucas Bigeardel
 * 
 * The library is released under:
 * 
 * A) LGPL
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA 02110-1301 USA
 * 
 * B) EPL
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Lucas Bigeardel <lucas.bigeardel@gmail.com> - Initial API and implementation
 ***********************************************************************************/

package net.sf.smbt.osc.ableton.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.sf.smbt.ezableton.AbletonLiveSndCmd;
import net.sf.smbt.ezableton.CLIP_STATE;
import net.sf.smbt.ezableton.EzabletonFactory;
import net.sf.smbt.ezableton.LiveArmReq;
import net.sf.smbt.ezableton.LiveClipInfo;
import net.sf.smbt.ezableton.LiveClipPosition;
import net.sf.smbt.ezableton.LiveDetailView;
import net.sf.smbt.ezableton.LiveDevice;
import net.sf.smbt.ezableton.LiveDeviceParam;
import net.sf.smbt.ezableton.LiveDeviceParamSet;
import net.sf.smbt.ezableton.LiveDeviceRange;
import net.sf.smbt.ezableton.LiveDeviceRangeAllQ;
import net.sf.smbt.ezableton.LiveDeviceRangeQ;
import net.sf.smbt.ezableton.LiveDeviceView;
import net.sf.smbt.ezableton.LiveDevicelist;
import net.sf.smbt.ezableton.LiveMasterDeviceView;
import net.sf.smbt.ezableton.LiveMasterMeter;
import net.sf.smbt.ezableton.LiveMasterPanReq;
import net.sf.smbt.ezableton.LiveMasterVolume;
import net.sf.smbt.ezableton.LiveMasterVolumeReq;
import net.sf.smbt.ezableton.LiveMuteReq;
import net.sf.smbt.ezableton.LiveNameClipQ;
import net.sf.smbt.ezableton.LiveNameClipReq;
import net.sf.smbt.ezableton.LiveNameClipblockreq;
import net.sf.smbt.ezableton.LiveNameSceneBlockReq;
import net.sf.smbt.ezableton.LiveNameSceneQ;
import net.sf.smbt.ezableton.LiveNameSceneReq;
import net.sf.smbt.ezableton.LiveNameTrackQ;
import net.sf.smbt.ezableton.LiveNameTrackReq;
import net.sf.smbt.ezableton.LiveNameTrackblockReq;
import net.sf.smbt.ezableton.LiveNextCueReq;
import net.sf.smbt.ezableton.LiveOverdub;
import net.sf.smbt.ezableton.LivePanSet;
import net.sf.smbt.ezableton.LivePitchSet;
import net.sf.smbt.ezableton.LivePlay;
import net.sf.smbt.ezableton.LivePlayClipReq;
import net.sf.smbt.ezableton.LivePlayClipSlotReq;
import net.sf.smbt.ezableton.LivePlayContinueReq;
import net.sf.smbt.ezableton.LivePlayReq;
import net.sf.smbt.ezableton.LivePlaySceneReq;
import net.sf.smbt.ezableton.LivePrevCueReq;
import net.sf.smbt.ezableton.LiveRedoReq;
import net.sf.smbt.ezableton.LiveReturnDeviceRangeAllQ;
import net.sf.smbt.ezableton.LiveReturnDeviceRangeQ;
import net.sf.smbt.ezableton.LiveReturnDeviceView;
import net.sf.smbt.ezableton.LiveReturnDevicelist;
import net.sf.smbt.ezableton.LiveReturnMeter;
import net.sf.smbt.ezableton.LiveReturnMuteReq;
import net.sf.smbt.ezableton.LiveReturnPan;
import net.sf.smbt.ezableton.LiveReturnPanReq;
import net.sf.smbt.ezableton.LiveReturnSend;
import net.sf.smbt.ezableton.LiveReturnSendReq;
import net.sf.smbt.ezableton.LiveReturnSolo;
import net.sf.smbt.ezableton.LiveReturnVolume;
import net.sf.smbt.ezableton.LiveReturnVolumeReq;
import net.sf.smbt.ezableton.LiveScene2;
import net.sf.smbt.ezableton.LiveSceneReq;
import net.sf.smbt.ezableton.LiveScenesQ;
import net.sf.smbt.ezableton.LiveSendReq;
import net.sf.smbt.ezableton.LiveStateRcv;
import net.sf.smbt.ezableton.LiveStateReq;
import net.sf.smbt.ezableton.LiveStopClipReq;
import net.sf.smbt.ezableton.LiveStopReq;
import net.sf.smbt.ezableton.LiveTempoRcv;
import net.sf.smbt.ezableton.LiveTempoReq;
import net.sf.smbt.ezableton.LiveTimeRcv;
import net.sf.smbt.ezableton.LiveTimeReq;
import net.sf.smbt.ezableton.LiveTrackDeviceView;
import net.sf.smbt.ezableton.LiveTrackInfo;
import net.sf.smbt.ezableton.LiveTrackJump;
import net.sf.smbt.ezableton.LiveTrackMeter;
import net.sf.smbt.ezableton.LiveTrackMute;
import net.sf.smbt.ezableton.LiveTrackName;
import net.sf.smbt.ezableton.LiveTrackPan;
import net.sf.smbt.ezableton.LiveTrackPitch;
import net.sf.smbt.ezableton.LiveTrackSend;
import net.sf.smbt.ezableton.LiveTrackSolo;
import net.sf.smbt.ezableton.LiveTrackVolume;
import net.sf.smbt.ezableton.LiveTracksQ;
import net.sf.smbt.ezableton.LiveTracksReq;
import net.sf.smbt.ezableton.LiveUndoReq;
import net.sf.smbt.ezableton.LiveVolume;
import net.sf.smbt.ezableton.LiveVolumeSet;
import net.sf.smbt.ezableton.METER_INPUT;
import net.sf.smbt.ezableton.PLAY_STATUS;
import net.sf.smbt.ezableton.TRACK_ARM_STATUS;
import net.sf.smbt.ezableton.TRACK_MUTE_STATUS;
import net.sf.smbt.ezableton.TRACK_SOLO_STATUS;
import net.sf.smbt.ezableton.livePlaySelectionReq;
import net.sf.xqz.model.cmd.Cmd;

import com.illposed.osc.OSCBundle;
import com.illposed.osc.OSCMessage;
import com.illposed.osc.OSCPacket;

public class AbletonLive8Utils {
	
	public final static AbletonLive8Utils INSTANCE = new AbletonLive8Utils();
	
	public List<AbletonLiveSndCmd> handleAbletonLiveOSCPacket(OSCPacket packet) {
		try {
			List<AbletonLiveSndCmd> lst = _handleAbletonLiveOSCPacket(packet);
			for (AbletonLiveSndCmd cmd : lst) {
				if (cmd != null) {
					cmd.setMsg(packet);
				}
			}
			return lst;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<AbletonLiveSndCmd>();
	}
	
	private List<AbletonLiveSndCmd> _handleAbletonLiveOSCPacket(OSCPacket packet) throws Exception {
		if (packet instanceof OSCMessage) {
			OSCMessage msg = (OSCMessage) packet;
			String addr = msg.getAddress();
			
			if (addr.equals("/live/scenes")) {
				Object[] args = msg.getArguments();
				Integer numScenes = (Integer) args[0];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveScenesQ(numScenes)});
			} else if (addr.equals("/live/tracks")) {
				Object[] args = msg.getArguments();
				Integer numTracks = (Integer) args[0];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveTracksQ(numTracks)});
			} else if (addr.equals("/live/tempo")) {
				Object[] args = msg.getArguments();
				Float tempo = (Float) args[0];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveTempo(tempo)});
			} else if (addr.equals("/live/time")) {
				Object[] args = msg.getArguments();
				Float time = (Float) args[0];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveTime(time)});
			} else if (addr.equals("/live/master/meter")) {
				Object[] args = msg.getArguments();
				Integer which = (Integer) args[0];
				Float level = (Float) args[1];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveMasterMeter(which, level)});
			}  else if (addr.equals("/live/track/meter")) {
				Object[] args = msg.getArguments();
				Integer trackID = (Integer) args[0];
				Integer which = (Integer) args[1];
				Float level = (Float) args[2];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveTrackMeter(trackID, which, level)});
			} else if (addr.equals("/live/arm")) {
				Object[] args = msg.getArguments();
				Integer trackID = (Integer) args[0];
				Integer value = (Integer) args[1];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveArm(trackID, value)});
			} else if (addr.equals("/live/clip/info")) {
				Object[] args = msg.getArguments();
				Integer trackID		= (Integer) args[0];
				Integer clipID		= (Integer) args[1];
				Integer clipState	= (Integer) args[2];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveClipInfo(trackID, clipID, clipState)});
			} else if (addr.equals("/live/clip/position")) {
				Object[] args = msg.getArguments();
				Integer trackID		= (Integer) args[0];
				Integer clipID		= (Integer) args[1];
				Float position		= (Float)   args[2];
				Float length		= (Float)   args[3];
				Float loopStart		= (Float)   args[4];
				Float loopEnd		= (Float)   args[5];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveClipPosition(trackID, clipID, position, length, loopStart, loopEnd)});
			} else if (addr.equals("/live/detail/view")) {
				Object[] args = msg.getArguments();
				Integer value = (Integer) args[0];
				((LiveDetailView)msg).setValue(value);
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveDetailView(value)});
			} else if (addr.equals("/live/device/param")) {
				Object[] args = msg.getArguments();
				Integer trackID = (Integer) args[0];
				Integer deviceID = (Integer) args[1];
				Integer param = (Integer) args[2];
				Object obj = args[3];
				String name = (String) args[4];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveDevice(trackID, deviceID, param, obj, name)});
			}   else if (addr.equals("/live/device")) {
				Object[] args = msg.getArguments();
				Integer trackID = (Integer) args[0];
				Integer deviceID = (Integer) args[1];
				Integer param = (Integer) args[2];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveDevice(trackID, deviceID, param)});
			}  else if (addr.equals("/live/device/range")) {
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveDeviceRange(msg)});
			}  else if (addr.equals("/live/return/device/range")) {
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveReturnDeviceRange(msg)});
			} else if (addr.equals("/live/devicelist")) {
				Object[] args = msg.getArguments();
				Integer trackID = (Integer) args[0];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveDevicelist(trackID)});
			} else if (addr.equals("/live/master/device/view")) {
				Object[] args = msg.getArguments();
				Integer deviceID = (Integer) args[0];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveMasterDeviceView(deviceID)});
			} else if (addr.equals("/live/master/pan")) {
				Object[] args = msg.getArguments();
				Float pan = (Float) args[0];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveMasterPan(0, pan)});
			} else if (addr.equals("/live/master/volume")) {
				Object[] args = msg.getArguments();
				Float level = (Float) args[0];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveMasterVolume(0, level)});
			} else if (addr.equals("/live/mute")) {
				Object[] args = msg.getArguments();
				Integer trackID = (Integer) args[0];
				Integer status = (Integer) args[1];
				TRACK_MUTE_STATUS STATUS = status == TRACK_MUTE_STATUS.MUTE.getValue() ? TRACK_MUTE_STATUS.MUTE : TRACK_MUTE_STATUS.UNMUTE;
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveMute(trackID, STATUS)});
			} else if (addr.equals("/live/name/clipblock")) {
				Object[] args = msg.getArguments();
				Integer trackID = (Integer) args[0];
				Integer clipID = (Integer) args[1];
				Integer sizeX = (Integer) args[2];
				Integer sizeY = (Integer) args[3];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveNameClipblock(trackID, clipID, sizeX, sizeY)});
			} else if (addr.equals("/live/name/clip")) {
				Object[] args = msg.getArguments();
				Integer trackID = (Integer) args[0];
				Integer clipID = (Integer) args[1];
				String label = (String) args[2];
				Integer color = (Integer) args[3];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveNameClip(trackID, clipID, label, color)});
			} else if (addr.equals("/live/name/scene/block")) {
				Object[] args = msg.getArguments();
				Integer trackID = (Integer) args[0];
				Integer size = (Integer) args[1];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveNameSceneBlock(trackID, size)});
			} else if (addr.equals("/live/name/scene")) {
				Object[] args = msg.getArguments();
				Integer sceneID = (Integer) args[0];
				String sceneName = (String) args[1];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveNameScene(sceneID, sceneName)});
			} else if (addr.equals("/live/name/trackblock")) {
				Object[] args = msg.getArguments();
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveNameTrackblock(args)});
			} else if (addr.equals("/live/name/track")) {
				Object[] args = msg.getArguments();
				Integer trackID = (Integer) args[0];
				String trackName = (String) args[1];
				Integer color = 0;
				if (args.length > 2) {
					color = (Integer) args[2];
				}
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveNameTrack(trackID, trackName, color)});
			} else if (addr.equals("/live/next/cue")) {
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveNextCue()});
			} else if (addr.equals("/live/prev/cue")) {
				return Arrays.asList(new AbletonLiveSndCmd[]{createLivePrevCue()});
			} else if (addr.equals("/live/pan/set")) {
				Object[] args = msg.getArguments();
				Integer trackID = (Integer) args[0];
				Float value = (Float) args[1];
				((LivePanSet)msg).setTrackID(trackID);
				((LivePanSet)msg).setValue(value);
				return Arrays.asList(new AbletonLiveSndCmd[]{createLivePanSet(msg)});
			} else if (addr.equals("/live/pitch/set")) {
				Object[] args = msg.getArguments();
				Integer trackID = (Integer) args[0];
				Integer clip = (Integer) args[1];
				Integer coarse = (Integer) args[2];
				Integer fine = (Integer) args[3];
				
				((LivePitchSet)msg).setTrackID(trackID);
				((LivePitchSet)msg).setClip(clip);
				((LivePitchSet)msg).setCoarse(coarse);
				((LivePitchSet)msg).setFine(fine);
				return Arrays.asList(new AbletonLiveSndCmd[]{createLivePitchSet(trackID, clip, coarse, fine)});
			} else if (addr.equals("/live/play/clip")) {
				createLivePlayClip();
			} else if (addr.equals("/live/play/clipslot")) {
				Object[] args = msg.getArguments();
				Integer trackID = (Integer) args[0];
				Integer clip = (Integer) args[1];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLivePlayClipslot(trackID, clip)});
			} else if (addr.equals("/live/play/continue")) {
				return Arrays.asList(new AbletonLiveSndCmd[]{createLivePlayContinue()});
			} else if (addr.equals("/live/play")) {
				Object[] args = msg.getArguments();
				Integer status = (Integer) args[0];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLivePlay(status)});
			} else if (addr.equals("/live/play/scene")) {
				Object[] args = msg.getArguments();
				Integer sceneID = (Integer) args[0];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLivePlayScene(sceneID)});
			} else if (addr.equals("/live/prec/cue")) {
				return Arrays.asList(new AbletonLiveSndCmd[]{createLivePrecCue()});
			} else if (addr.equals("/live/redo")) {
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveRedo()});
			} else if (addr.equals("/live/return/devicelist")) {
				Object[] args = msg.getArguments();
				Integer trackID = (Integer) args[0];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveDevicelist(trackID)});
			} else if (addr.equals("/live/return/meter")) {
				Object[] args = msg.getArguments();
				Integer trackID = (Integer) args[0];
				Integer which = (Integer) args[1];
				Float level = (Float) args[2];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveReturnMeter(trackID, which, level)});
			}  else if (addr.equals("/live/track/meter")) {
				Object[] args = msg.getArguments();
				Integer trackID = (Integer) args[0];
				Integer which = (Integer) args[1];
				Float level = (Float) args[2];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveTrackMeter(trackID, which, level)});
			}  else if (addr.equals("/live/return/device/view")) {
				Object[] args = msg.getArguments();
				Integer trackID = (Integer) args[0];
				Integer deviceID = (Integer) args[1];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveDeviceView(trackID, deviceID)});
			} else if (addr.equals("/live/return/mute")) {
				Object[] args = msg.getArguments();
				Integer trackID = (Integer) args[0];
				Integer status = (Integer) args[1];
				TRACK_MUTE_STATUS muteStatus = status == TRACK_MUTE_STATUS.MUTE_VALUE ? TRACK_MUTE_STATUS.MUTE : TRACK_MUTE_STATUS.UNMUTE;
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveMute(trackID, muteStatus)});
			} else if (addr.equals("/live/return/pan")) {
				Object[] args = msg.getArguments();
				Integer trackID = (Integer) args[0];
				Float pan  = (Float) args[1];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveReturnPan(trackID, pan)});
			} else if (addr.equals("/live/return/send")) {
				Object[] args = msg.getArguments();
				Integer trackID = (Integer) args[0];
				Integer send = (Integer) args[1];
				Float level = (Float) args[2];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveReturnSend(trackID, level, send)});
			} else if (addr.equals("/live/return/solo")) {
				Object[] args = msg.getArguments();
				Integer trackID = (Integer) args[0];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveReturnSolo(trackID)});
			} else if (addr.equals("/live/return/volume")) {
				Object[] args = msg.getArguments();
				Integer trackID = (Integer) args[0];
				Float value = (Float) args[1];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveReturnVolume(trackID, value)});
			} else if (addr.equals("/live/scene")) {
				Object[] args = msg.getArguments();
				Integer mode = (Integer) args[0];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveScene2(mode)});
			} else if (addr.equals("/live/send")) {
				Object[] args = msg.getArguments();
				Integer trackID = (Integer) args[0];
				Integer value = (Integer) args[1];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveSend(trackID, value)});
			} else if (addr.equals("/live/state")) {
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveState()});
			} else if (addr.equals("/live/stop/clip")) {
				Object[] args = msg.getArguments();
				Integer trackID = (Integer) args[0];
				Integer clipID = (Integer) args[1];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveStopClip(trackID, clipID)});
			} else if (addr.equals("/live/track/info")) {
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveTrackInfo()});
			} else if (addr.equals("/live/stop")) {
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveStop()});
			} else if (addr.equals("/live/track/device/view")) {
				Object[] args = msg.getArguments();
				Integer trackID = (Integer) args[0];
				Integer deviceID = (Integer) args[1];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveTrackDeviceView(trackID, deviceID)});
			} else if (addr.equals("/live/track/jump")) {
				Object[] args = msg.getArguments();
				Integer trackID = (Integer) args[0];
				Float beats = (Float) args[1];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveTrackJump(trackID, beats)});
			} else if (addr.equals("/live/tracks")) {
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveTracks()});
			} else if (addr.equals("/live/undo")) {
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveUndo()});
			}  else if (addr.equals("/live/volume")) {
				AbletonLiveSndCmd cmd = null;
				Object[] args = msg.getArguments();
				if (args[0] instanceof Integer) {
					Integer trackID = (Integer) args[0];
					Float level = (Float) args[1];
					cmd = createLiveVolume(trackID, level);
				} else {				
					Float level = (Float) args[0];
					cmd = createLiveVolume(level);
				}
				return Arrays.asList(new AbletonLiveSndCmd[]{cmd});
			} else if (addr.equals("/live/time")) {
				Object[] args = msg.getArguments();
				Float time = (Float) args[0];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveTime(time)});
			} else if (addr.equals("/live/volume/set")) {
				Object[] args = msg.getArguments();
				Integer trackID = (Integer) args[0];
				Float level = (Float) args[1];
				return Arrays.asList(new AbletonLiveSndCmd[]{createLiveVolumeSet(trackID, level)});
			} else if (addr.equals("/live/play/selection")) {
				return Arrays.asList(new AbletonLiveSndCmd[]{createLivePlaySelection()});
			}
		} else if (packet instanceof OSCBundle) {
			OSCBundle bundle = (OSCBundle) packet;
			List<AbletonLiveSndCmd> list = new ArrayList<AbletonLiveSndCmd>();
			for (OSCPacket p : bundle.getPackets()) {
				list.addAll(handleAbletonLiveOSCPacket(p));
			}
			return list;
		}
		return new ArrayList<AbletonLiveSndCmd>();
	}
	
	public AbletonLiveSndCmd createLiveScenesQ() {
		return EzabletonFactory.eINSTANCE.createLiveScenesQ();
	}
	
	public AbletonLiveSndCmd createLiveScenesQ(int numScenes) {
		LiveScenesQ liveScenesQ = EzabletonFactory.eINSTANCE.createLiveScenesQ();
		liveScenesQ.setNumScenes(numScenes);
		return liveScenesQ;
	}
	
	public AbletonLiveSndCmd createLiveVolume(float level) {
		LiveVolume liveVolume = EzabletonFactory.eINSTANCE.createLiveVolume();
		liveVolume.setLevel(level);
		return liveVolume;
	}
	
	public AbletonLiveSndCmd createLiveVolume(int trackID, float level) {
		LiveVolume liveVolume = EzabletonFactory.eINSTANCE.createLiveVolume();
		liveVolume.setTrackID(trackID);
		liveVolume.setLevel(level);
		return liveVolume;
	}
	
	public AbletonLiveSndCmd createLiveTracksQ() {
		return EzabletonFactory.eINSTANCE.createLiveTracksQ();
	}
	
	public AbletonLiveSndCmd createLiveTracksQ(int numTracks) {
		LiveTracksQ liveTracksQ = EzabletonFactory.eINSTANCE.createLiveTracksQ();
		liveTracksQ.setNumTracks(numTracks);
		return liveTracksQ;
	}
	
	public AbletonLiveSndCmd createLiveTrackMeter(int trackID, int direction, float level) {
		LiveTrackMeter liveTrackMeter = EzabletonFactory.eINSTANCE.createLiveTrackMeter();
		liveTrackMeter.setTrackID(trackID);
		liveTrackMeter.setLevel(level);
		liveTrackMeter.setWhich(direction==0?METER_INPUT.LEFT_METER:METER_INPUT.RIGHT_METER);
		return liveTrackMeter;
	}
	
	public AbletonLiveSndCmd createLiveTempo(float tempo) { 
		LiveTempoRcv liveTempoRcv = EzabletonFactory.eINSTANCE.createLiveTempoRcv();
		liveTempoRcv.setStamp(new Float(tempo).longValue());
		return liveTempoRcv; 
	}
	
	public AbletonLiveSndCmd createLiveArm(int trackID, int status) {
		LiveArmReq liveArmReq = EzabletonFactory.eINSTANCE.createLiveArmReq();
		liveArmReq.setTrackID(trackID);
		liveArmReq.setStatus(status==TRACK_ARM_STATUS.ARMED_VALUE ? TRACK_ARM_STATUS.ARMED : TRACK_ARM_STATUS.DISARMED);
		return liveArmReq; 
	}
	
	public AbletonLiveSndCmd createLiveClipPosition(int trackID, int clipID, float position, float length, float loopStart, float loopEnd) {
		LiveClipPosition liveClipPosition = EzabletonFactory.eINSTANCE.createLiveClipPosition();
		liveClipPosition.setTrackID(trackID);
		liveClipPosition.setClipID(clipID);
		liveClipPosition.setPosition(position);
		liveClipPosition.setLength(length);
		liveClipPosition.setLoopStart(loopStart);
		liveClipPosition.setLoopEnd(loopEnd);
		return liveClipPosition;
	}
	
	public AbletonLiveSndCmd createLiveClipInfo(int trackID, int clipID, int clipState) {
		LiveClipInfo liveClipInfo = EzabletonFactory.eINSTANCE.createLiveClipInfo();
		liveClipInfo.setTrackID(trackID);
		liveClipInfo.setClipID(clipID);
		liveClipInfo.setStatus(CLIP_STATE.get(clipState));
		return liveClipInfo; 
	}
	
	public AbletonLiveSndCmd createLiveDetailView(int value) {
		LiveDetailView liveDetailView = EzabletonFactory.eINSTANCE.createLiveDetailView();
		liveDetailView.setValue(value);
		return liveDetailView; 
	}
	
	public AbletonLiveSndCmd createLiveMasterMeter(int which, float level) {
		LiveMasterMeter liveMasterMeter = EzabletonFactory.eINSTANCE.createLiveMasterMeter();
		liveMasterMeter.setWhich(which==0?METER_INPUT.LEFT_METER:METER_INPUT.RIGHT_METER);
		liveMasterMeter.setLevel(level);
		return liveMasterMeter;
	}
	
	public AbletonLiveSndCmd createLiveDevice(int trackID, int deviceID, int param) {
		LiveDevice liveDevice = EzabletonFactory.eINSTANCE.createLiveDevice();
		liveDevice.setTrackID(trackID);
		liveDevice.setDeviceID(deviceID);
		liveDevice.setParam(param);
		return liveDevice; 
	}
	
	public AbletonLiveSndCmd createLiveDevice(int trackID, int deviceID, int param, Object val, String name) {
		LiveDeviceParam liveDeviceParam = EzabletonFactory.eINSTANCE.createLiveDeviceParam();
		liveDeviceParam.setTrackID(trackID);
		liveDeviceParam.setDeviceID(deviceID);
		liveDeviceParam.setParam(param);
		liveDeviceParam.setValue(val);
		liveDeviceParam.setName(name);
		liveDeviceParam.setType(val != null ? val.getClass().getCanonicalName() : "");
		
		return liveDeviceParam; 
	}
	
	public AbletonLiveSndCmd createLiveMasterDeviceView(int deviceID) {
		LiveMasterDeviceView liveMasterDeviceView = EzabletonFactory.eINSTANCE.createLiveMasterDeviceView();
		liveMasterDeviceView.setDeviceID(deviceID);
		return liveMasterDeviceView; 
	}
	
	public AbletonLiveSndCmd createLiveMasterPan(int trackID, float pan) {
		LiveMasterPanReq liveMasterPanReq = EzabletonFactory.eINSTANCE.createLiveMasterPanReq();
		liveMasterPanReq.setTrackID(trackID);
		liveMasterPanReq.setPan(pan);
		return liveMasterPanReq; 
	}
	
	public AbletonLiveSndCmd createLiveMasterVolume(int trackID, float level) {
		LiveMasterVolume liveMasterVolume = EzabletonFactory.eINSTANCE.createLiveMasterVolume();
		liveMasterVolume.setTrackID(trackID);
		liveMasterVolume.setLevel(level);
		return liveMasterVolume; 
	}
	
	public AbletonLiveSndCmd createLiveNameClipblock(int trackID, int clipID, int sizeX, int sizeY) {
		LiveNameClipblockreq liveNameClipblockreq = EzabletonFactory.eINSTANCE.createLiveNameClipblockreq();
		liveNameClipblockreq.setTrackID(trackID);
		liveNameClipblockreq.setClipID(clipID);
		liveNameClipblockreq.setSizeX(sizeX);
		liveNameClipblockreq.setSizeY(sizeY);
		return liveNameClipblockreq; 
	}
	
	public AbletonLiveSndCmd createLiveNameClip(int trackID, int clipID, String label, int color) {
		LiveNameClipReq liveNameClipReq = EzabletonFactory.eINSTANCE.createLiveNameClipReq();
		liveNameClipReq.setTrackID(trackID);
		liveNameClipReq.setClipID(clipID);
		liveNameClipReq.setLabel(label);
		liveNameClipReq.setColor(color);
		return liveNameClipReq; 
	}
	
	public AbletonLiveSndCmd createLiveNameSceneBlock(int trackID, int size) {
		LiveNameSceneBlockReq liveNameSceneBlockReq = EzabletonFactory.eINSTANCE.createLiveNameSceneBlockReq();
		liveNameSceneBlockReq.setTrackID(trackID);
		liveNameSceneBlockReq.setSize(size);
		return liveNameSceneBlockReq; 
	}
	
	public AbletonLiveSndCmd createLiveNameScene(int  sceneID, String name) {
		LiveNameSceneReq liveNameSceneReq = EzabletonFactory.eINSTANCE.createLiveNameSceneReq();
		liveNameSceneReq.setSceneID(sceneID);
		liveNameSceneReq.setSceneName(name);
		return liveNameSceneReq; 
	}
	
	public AbletonLiveSndCmd createLiveNameTrackblock(Object[] args){
		LiveNameTrackblockReq liveNameTrackblockReq = EzabletonFactory.eINSTANCE.createLiveNameTrackblockReq();
		liveNameTrackblockReq.setTrackID(0);
		liveNameTrackblockReq.setSize(args.length);
		
		List<String> trackNames = new ArrayList<String>();
		for (Object o : args) {
			trackNames.add((String)o);
		}
		
		liveNameTrackblockReq.getTrackName().addAll(trackNames);
		
		return liveNameTrackblockReq; 
	}
	
	public AbletonLiveSndCmd createLiveNameTrackQ() {
		return EzabletonFactory.eINSTANCE.createLiveNameTrackQ();
	}
	
	public AbletonLiveSndCmd createLiveNameSceneQ() {
		return EzabletonFactory.eINSTANCE.createLiveNameSceneQ();
	}
	
	public AbletonLiveSndCmd createLiveNameClipQ() {
		return EzabletonFactory.eINSTANCE.createLiveNameClipQ();
	}
	
	public AbletonLiveSndCmd createLiveNameTrack(int trackID, String name, int color) {
		LiveNameTrackReq liveNameTrackReq = EzabletonFactory.eINSTANCE.createLiveNameTrackReq();
		liveNameTrackReq.setTrackID(trackID);
		liveNameTrackReq.setTrackName(name);
		liveNameTrackReq.setColor(color);
		return liveNameTrackReq; 
	}
	
	public AbletonLiveSndCmd createLiveNameTrack(int trackID) {
		LiveNameTrackReq liveNameTrackReq = EzabletonFactory.eINSTANCE.createLiveNameTrackReq();
		liveNameTrackReq.setTrackID(trackID);
		return liveNameTrackReq; 
	}
	
	public AbletonLiveSndCmd createLiveNextCue() {
		return EzabletonFactory.eINSTANCE.createLiveNextCueReq();
	}
	
	public AbletonLiveSndCmd createLivePrevCue() { 
		return EzabletonFactory.eINSTANCE.createLivePrevCueReq();
	}
	
	public AbletonLiveSndCmd createLivePanSet(OSCMessage msg) { 
		return EzabletonFactory.eINSTANCE.createLivePanSet();
	}
	
	public AbletonLiveSndCmd createLiveDeviceRangeQ(int trackID, int deviceID, int param) {
		LiveDeviceRangeQ liveDeviceRange = EzabletonFactory.eINSTANCE.createLiveDeviceRangeQ();
		liveDeviceRange.setTrackID(trackID);
		liveDeviceRange.setDeviceID(deviceID);
		liveDeviceRange.setParam(param);
		return liveDeviceRange;
	}
	
	public AbletonLiveSndCmd createLiveDeviceRangeAllQ(int trackID, int deviceID) {
		LiveDeviceRangeAllQ liveDeviceRange = EzabletonFactory.eINSTANCE.createLiveDeviceRangeAllQ();
		liveDeviceRange.setTrackID(trackID);
		liveDeviceRange.setDeviceID(deviceID);
		return liveDeviceRange;
	}
	
	public AbletonLiveSndCmd createLiveReturnDeviceRangeQ(int trackID, int deviceID, int param) {
		LiveReturnDeviceRangeQ liveDeviceRange = EzabletonFactory.eINSTANCE.createLiveReturnDeviceRangeQ();
		liveDeviceRange.setTrackID(trackID);
		liveDeviceRange.setDeviceID(deviceID);
		liveDeviceRange.setParam(param);
		return liveDeviceRange;
	}
	
	public AbletonLiveSndCmd createLiveReturnDeviceRangeAllQ(int trackID, int deviceID) {
		LiveReturnDeviceRangeAllQ liveDeviceRange = EzabletonFactory.eINSTANCE.createLiveReturnDeviceRangeAllQ();
		liveDeviceRange.setTrackID(trackID);
		liveDeviceRange.setDeviceID(deviceID);
		return liveDeviceRange;
	}
	
	public AbletonLiveSndCmd createLiveDeviceRange(OSCMessage msg) {
		LiveDeviceRange liveDeviceRange = EzabletonFactory.eINSTANCE.createLiveDeviceRange();
		liveDeviceRange.setTrackID((Integer)msg.getArguments()[0]);
		liveDeviceRange.setDeviceID((Integer)msg.getArguments()[1]);
		liveDeviceRange.setMsg(msg);
		return liveDeviceRange;
	}
	
	public AbletonLiveSndCmd createLiveDeviceRangeAll(OSCMessage msg) {
		LiveDeviceRangeAllQ liveDeviceRange = EzabletonFactory.eINSTANCE.createLiveDeviceRangeAllQ();
		liveDeviceRange.setTrackID((Integer)msg.getArguments()[0]);
		liveDeviceRange.setDeviceID((Integer)msg.getArguments()[1]);
		liveDeviceRange.setMsg(msg);
		return liveDeviceRange;
	}
	
	public AbletonLiveSndCmd createLiveReturnDeviceRange(OSCMessage msg) {
		LiveReturnDeviceRangeQ liveDeviceRange = EzabletonFactory.eINSTANCE.createLiveReturnDeviceRangeQ();
		liveDeviceRange.setTrackID((Integer)msg.getArguments()[0]);
		liveDeviceRange.setDeviceID((Integer)msg.getArguments()[1]);
		liveDeviceRange.setMsg(msg);
		return liveDeviceRange;
	}
	
	public AbletonLiveSndCmd createLiveReturnDeviceRangeAll(OSCMessage msg) {
		LiveReturnDeviceRangeAllQ liveDeviceRange = EzabletonFactory.eINSTANCE.createLiveReturnDeviceRangeAllQ();
		liveDeviceRange.setTrackID((Integer)msg.getArguments()[0]);
		liveDeviceRange.setDeviceID((Integer)msg.getArguments()[1]);
		liveDeviceRange.setMsg(msg);
		return liveDeviceRange;
	}
	
	public AbletonLiveSndCmd createLivePitchSet(int trackID, int clip, int coarse, int fine) {
		LivePitchSet livePitchSet = EzabletonFactory.eINSTANCE.createLivePitchSet();
		livePitchSet.setTrackID(trackID);
		livePitchSet.setClip(clip);
		livePitchSet.setCoarse(coarse);
		livePitchSet.setFine(fine);
		return livePitchSet;
	}
	
	public AbletonLiveSndCmd createLivePlayClip() {
		return EzabletonFactory.eINSTANCE.createLivePlayClipReq();
	}
	
	public AbletonLiveSndCmd createLivePlayClipslot(int trackID, int clipID) {
		LivePlayClipSlotReq livePlayClipSlotReq = EzabletonFactory.eINSTANCE.createLivePlayClipSlotReq();
		livePlayClipSlotReq.setTrackID(trackID);
		livePlayClipSlotReq.setClipID(clipID);
		return livePlayClipSlotReq;
	}
	
	public AbletonLiveSndCmd createLivePlayContinue() {
		return EzabletonFactory.eINSTANCE.createLivePlayContinueReq();
	}
	
	public AbletonLiveSndCmd createLivePlay() {
		return createLivePlay(2);
	}
	
	public AbletonLiveSndCmd createLivePlay(int status) {
		LivePlay livePlay = EzabletonFactory.eINSTANCE.createLivePlay();
		livePlay.setStatus(status==2?PLAY_STATUS.PLAY:PLAY_STATUS.STOP);
		return livePlay;
	}
	
	public AbletonLiveSndCmd createLivePlayScene(int sceneID) {
		LivePlaySceneReq playSceneReq = EzabletonFactory.eINSTANCE.createLivePlaySceneReq();
		playSceneReq.setSceneID(sceneID);
		return playSceneReq;
	}
	
	public AbletonLiveSndCmd createLivePrecCue() {
		return EzabletonFactory.eINSTANCE.createLivePrevCueReq();
	}
	
	public AbletonLiveSndCmd createLiveRedo() {
		return EzabletonFactory.eINSTANCE.createLiveRedoReq();
	}
	
	public AbletonLiveSndCmd createLiveDevicelist(int trackID) {
		LiveDevicelist devicelist = EzabletonFactory.eINSTANCE.createLiveDevicelist();
		devicelist.setTrackID(trackID);
		return devicelist;
	}
	
	public AbletonLiveSndCmd createLiveDeviceView(int trackID, int deviceID) {
		LiveDeviceView devicelist = EzabletonFactory.eINSTANCE.createLiveDeviceView();
		devicelist.setTrackID(trackID);
		devicelist.setDeviceID(deviceID);
		return devicelist;
	}
	
	public LiveOverdub createLiveOverdub() {
		LiveOverdub liveOverdub = (LiveOverdub) EzabletonFactory.eINSTANCE.createLiveOverdub();
		return liveOverdub;
	}
	
	public AbletonLiveSndCmd createLiveMute(int trackID, TRACK_MUTE_STATUS STATUS) {
		LiveMuteReq liveMuteReq = EzabletonFactory.eINSTANCE.createLiveMuteReq();
		liveMuteReq.setTrackID(trackID);
		liveMuteReq.setStatus(STATUS);
		return liveMuteReq;
	}
	
	public AbletonLiveSndCmd createLiveReturnPan(int trackID, float pan) {
		LiveReturnPan liveReturnPan = EzabletonFactory.eINSTANCE.createLiveReturnPan();
		liveReturnPan.setTrackID(trackID);
		liveReturnPan.setPan(pan);
		return liveReturnPan;
	}
	
	public AbletonLiveSndCmd createLiveReturnMeter(int trackID, int which, float level) {
		LiveReturnMeter liveReturnMeter = EzabletonFactory.eINSTANCE.createLiveReturnMeter();
		liveReturnMeter.setTrackID(trackID);
		liveReturnMeter.setWhich(METER_INPUT.get(which));
		liveReturnMeter.setLevel(level);
		return liveReturnMeter;
	}
	
	public AbletonLiveSndCmd createLiveReturnSend(int trackID, float level, int send) { 
		LiveReturnSend liveReturnSend = EzabletonFactory.eINSTANCE.createLiveReturnSend();
		liveReturnSend.setTrackID(trackID);
		liveReturnSend.setLevel(level);
		liveReturnSend.setSend(send);
		return liveReturnSend;
	}
	
	public AbletonLiveSndCmd createLiveReturnSolo(int trackID) {
		LiveReturnSolo liveReturnSolo = EzabletonFactory.eINSTANCE.createLiveReturnSolo();
		liveReturnSolo.setTrackID(trackID);
		return liveReturnSolo;
	}
	
	public AbletonLiveSndCmd createLiveReturnVolume(int trackID, float level) { 
		LiveReturnVolume liveReturnVolume = EzabletonFactory.eINSTANCE.createLiveReturnVolume();
		liveReturnVolume.setTrackID(trackID);
		liveReturnVolume.setLevel(level);
		return liveReturnVolume;
	}
	
	public AbletonLiveSndCmd createLiveScene(String mode, int sceneID) { 
		LiveSceneReq liveSceneReq = EzabletonFactory.eINSTANCE.createLiveSceneReq();
		liveSceneReq.setMode(mode);
		liveSceneReq.setSceneID(sceneID);
		return liveSceneReq;
	}
	
	public AbletonLiveSndCmd createLiveScene2(int sceneID) { 
		LiveScene2 liveScene = EzabletonFactory.eINSTANCE.createLiveScene2();
		liveScene.setSceneID(sceneID);
		return liveScene;
	}
	
	public AbletonLiveSndCmd createLiveSend(int trackID, int value) { 
		LiveSendReq liveSendReq = EzabletonFactory.eINSTANCE.createLiveSendReq();
		liveSendReq.setTrackID(trackID);
		liveSendReq.setValue(value);
		return liveSendReq;
	}
	
	public AbletonLiveSndCmd createLiveState() {
		return EzabletonFactory.eINSTANCE.createLiveStateReq();
	}
	
	public AbletonLiveSndCmd createLiveStopClip(int trackID, int clipID) {
		LiveStopClipReq liveStopClipReq = EzabletonFactory.eINSTANCE.createLiveStopClipReq();
		liveStopClipReq.setTrackID(trackID);
		liveStopClipReq.setClipID(clipID);
		return liveStopClipReq;
	}
	
	public AbletonLiveSndCmd createLiveTrackInfo() { 
		return EzabletonFactory.eINSTANCE.createLiveTrackInfo();
	}
	
	public AbletonLiveSndCmd createLiveTrackVolume(int trackID, float volume) { 
		LiveTrackVolume trackVolume = EzabletonFactory.eINSTANCE.createLiveTrackVolume();
		trackVolume.setVolume(volume);
		trackVolume.setTrackID(trackID);
		return trackVolume;
	}
	
	public AbletonLiveSndCmd createLiveTrackMute(int trackID, TRACK_MUTE_STATUS state) { 
		LiveTrackMute trackMute = EzabletonFactory.eINSTANCE.createLiveTrackMute();
		trackMute.setState(state);
		trackMute.setTrackID(trackID);
		return trackMute;
	}
	
	public AbletonLiveSndCmd createLiveTrackSolo(int trackID, TRACK_SOLO_STATUS state) { 
		LiveTrackSolo trackSolo = EzabletonFactory.eINSTANCE.createLiveTrackSolo();
		trackSolo.setState(state);
		trackSolo.setTrackID(trackID);
		return trackSolo;
	}
	
	public AbletonLiveSndCmd createLiveTrackName(int trackID, String name) { 
		LiveTrackName trackName = EzabletonFactory.eINSTANCE.createLiveTrackName();
		trackName.setName(name);
		trackName.setTrackID(trackID);
		return trackName;
	}
	
	public AbletonLiveSndCmd createLiveTrackPan(int trackID, float pan) { 
		LiveTrackPan trackPan = EzabletonFactory.eINSTANCE.createLiveTrackPan();
		trackPan.setPan(pan);
		trackPan.setTrackID(trackID);
		return trackPan;
	}
	
	public AbletonLiveSndCmd createLiveTrackSend(int trackID, float send) { 
		LiveTrackSend trackSend = EzabletonFactory.eINSTANCE.createLiveTrackSend();
		trackSend.setSend(send);
		trackSend.setTrackID(trackID);
		return trackSend;
	}
	
	public AbletonLiveSndCmd createLiveTrackPitch(int trackID, float pitch) { 
		LiveTrackPitch trackPan = EzabletonFactory.eINSTANCE.createLiveTrackPitch();
		trackPan.setPitch(pitch);
		trackPan.setTrackID(trackID);
		return trackPan;
	}
	

	
	public AbletonLiveSndCmd createLiveStop() { 
		return EzabletonFactory.eINSTANCE.createLiveStopReq();
	}
	
	public AbletonLiveSndCmd createLiveTrackDeviceView(int trackID, int deviceID) {
		LiveTrackDeviceView liveTrackDeviceView = EzabletonFactory.eINSTANCE.createLiveTrackDeviceView();
		liveTrackDeviceView.setTrackID(trackID);
		liveTrackDeviceView.setDeviceID(deviceID);
		return liveTrackDeviceView;
	}
	
	public AbletonLiveSndCmd createLiveTrackJump(int trackID, float beats) { 
		LiveTrackJump liveTrackJump = EzabletonFactory.eINSTANCE.createLiveTrackJump();
		liveTrackJump.setTrackID(trackID);
		liveTrackJump.setBeats(beats);
		return liveTrackJump;
	}
	
	public AbletonLiveSndCmd createLiveTracks() { 
		return EzabletonFactory.eINSTANCE.createLiveTracksReq();
	}
	
	public AbletonLiveSndCmd createLiveUndo() { 
		return EzabletonFactory.eINSTANCE.createLiveUndoReq();
	}
	
	public AbletonLiveSndCmd createLiveTime(float time) {
		LiveTimeRcv liveTimeRcv = EzabletonFactory.eINSTANCE.createLiveTimeRcv();
		liveTimeRcv.setTime(time);
		return liveTimeRcv;
	}
	
	public AbletonLiveSndCmd createLiveVolumeSet(int trackID, float level) {
		LiveVolumeSet liveTimeVolumeSet = EzabletonFactory.eINSTANCE.createLiveVolumeSet();
		liveTimeVolumeSet.setTrackID(trackID);
		liveTimeVolumeSet.setLevel(level);
		return liveTimeVolumeSet;
	}
	
	public AbletonLiveSndCmd createLivePlaySelection() {
		return EzabletonFactory.eINSTANCE.createlivePlaySelectionReq();
	}
	
	public byte[] dumpAbletonLiveCommand(Cmd cmd) {
		OSCMessage msg = new OSCMessage();
		if (cmd instanceof LiveVolume) {
			msg.setAddress("/live/volume");
			msg.addArgument(new Integer(((LiveVolume)cmd).getTrackID()));
			msg.addArgument(new Float(((LiveVolume)cmd).getLevel()));
			((LiveVolume) cmd).setMsg(msg);
		} else if (cmd instanceof LiveNameTrackQ) {
			msg.setAddress("/live/name/track");
			((LiveNameTrackQ) cmd).setMsg(msg);
		} else if (cmd instanceof LiveScenesQ) {
			msg.setAddress("/live/scenes");
			((LiveScenesQ) cmd).setMsg(msg);
		} else if (cmd instanceof LiveTracksQ) {
			msg.setAddress("/live/tracks");
			((LiveTracksQ) cmd).setMsg(msg);
		} else if (cmd instanceof LiveNameSceneQ) {
			msg.setAddress("/live/name/scene");
			((LiveNameSceneQ) cmd).setMsg(msg);
		} else if (cmd instanceof LiveNameClipQ) {
			msg.setAddress("/live/name/clip");
			((LiveNameClipQ) cmd).setMsg(msg);
		} else if (cmd instanceof LiveTimeRcv) {
			LiveTimeRcv liveTimeRcv = (LiveTimeRcv) cmd;
			msg.setAddress("/live/time");
			msg.addArgument(new Float(liveTimeRcv.getTime()));
			((LiveTimeRcv) cmd).setMsg(msg);
		} else if (cmd instanceof LiveTempoRcv) {
			LiveTempoRcv liveTempoRcv = (LiveTempoRcv) cmd;
			msg.setAddress("/live/tempo");
			msg.addArgument(new Float(liveTempoRcv.getTempo()));
			((LiveTempoRcv) cmd).setMsg(msg);
		} else if (cmd instanceof LiveTempoReq) {
			LiveTempoReq liveTempoReq = (LiveTempoReq) cmd;
			msg.setAddress("/live/tempo");
			msg.addArgument(new Float(liveTempoReq.getStamp()));
			((LiveTempoReq) cmd).setMsg(msg);
		}  else if (cmd instanceof LiveTimeReq) {
			msg.setAddress("/live/time");
		}  else if (cmd instanceof LiveArmReq) {
			LiveArmReq liveArmReq = (LiveArmReq) cmd;
			msg.setAddress("/live/arm");
			msg.addArgument(new Integer(liveArmReq.getTrackID()));
			((LiveArmReq) cmd).setMsg(msg);
		} else if (cmd instanceof LiveClipInfo) {
			LiveClipInfo liveClipInfo = (LiveClipInfo) cmd;
			msg.setAddress("/live/clip/info");
			msg.addArgument(new Integer(liveClipInfo.getTrackID()));
			msg.addArgument(new Integer(liveClipInfo.getClipID()));
			((LiveClipInfo) cmd).setMsg(msg);
		} else if (cmd instanceof LiveDetailView) {
			LiveDetailView liveDetailView = (LiveDetailView) cmd;
			msg.setAddress("/live/detail/view");
			msg.addArgument(new Integer(liveDetailView.getValue()));
			((LiveDetailView) cmd).setMsg(msg);
		} else if (cmd instanceof LiveDevice) {
			LiveDevice liveDevice = (LiveDevice) cmd;
			msg.setAddress("/live/device");
			msg.addArgument(new Integer(liveDevice.getTrackID()));
			msg.addArgument(new Integer(liveDevice.getDeviceID()));
			msg.addArgument(new Integer(liveDevice.getParam()));
			((LiveDevice) cmd).setMsg(msg);
		} else if (cmd instanceof LiveDeviceParam) {
			LiveDeviceParam liveDevice = (LiveDeviceParam) cmd;
			msg.setAddress("/live/device/param");
			msg.addArgument(new Integer(liveDevice.getTrackID()));
			msg.addArgument(new Integer(liveDevice.getDeviceID()));
			msg.addArgument(new Integer(liveDevice.getParam()));
			msg.addArgument(liveDevice.getValue());
			msg.addArgument(liveDevice.getName());
			((LiveDevice) cmd).setMsg(msg);
		}  else if (cmd instanceof LiveDeviceRangeQ) {
			LiveDeviceRangeQ liveDevice = (LiveDeviceRangeQ) cmd;
			msg.setAddress("/live/device/range");
			msg.addArgument(new Integer(liveDevice.getTrackID()));
			msg.addArgument(new Integer(liveDevice.getDeviceID()));
			msg.addArgument(new Integer(liveDevice.getParam()));
			((LiveDeviceRangeQ) cmd).setMsg(msg);
		}  else if (cmd instanceof LiveDeviceRangeAllQ) {
			LiveDeviceRangeAllQ liveDevice = (LiveDeviceRangeAllQ) cmd;
			msg.setAddress("/live/device/range");
			msg.addArgument(new Integer(liveDevice.getTrackID()));
			msg.addArgument(new Integer(liveDevice.getDeviceID()));
			((LiveDeviceRangeAllQ) cmd).setMsg(msg);
		}  else if (cmd instanceof LiveReturnDeviceRangeQ) {
			LiveReturnDeviceRangeQ liveDevice = (LiveReturnDeviceRangeQ) cmd;
			msg.setAddress("/live/return/device/range");
			msg.addArgument(new Integer(liveDevice.getTrackID()));
			msg.addArgument(new Integer(liveDevice.getDeviceID()));
			msg.addArgument(new Integer(liveDevice.getParam()));
			((LiveReturnDeviceRangeQ) cmd).setMsg(msg);
		}  else if (cmd instanceof LiveReturnDeviceRangeAllQ) {
			LiveReturnDeviceRangeAllQ liveDevice = (LiveReturnDeviceRangeAllQ) cmd;
			msg.setAddress("/live/return/device/range");
			msg.addArgument(new Integer(liveDevice.getTrackID()));
			msg.addArgument(new Integer(liveDevice.getDeviceID()));
			((LiveReturnDeviceRangeAllQ) cmd).setMsg(msg);
		} else if (cmd instanceof LiveDevicelist) {
			LiveDevicelist liveDeviceList = (LiveDevicelist) cmd;
			msg.setAddress("/live/devicelist");
			msg.addArgument(new Integer(liveDeviceList.getTrackID()));
			((LiveDevicelist) cmd).setMsg(msg);
		} else if (cmd instanceof LiveTrackPan) {
			LiveTrackPan liveTrackPan = (LiveTrackPan) cmd;
			msg.setAddress("/live/pan");
			msg.addArgument(new Integer(liveTrackPan.getTrackID()));
			msg.addArgument(liveTrackPan.getPan());
			((LiveTrackPan) cmd).setMsg(msg);
		} else if (cmd instanceof LiveTrackVolume) {
			LiveTrackVolume liveTrackVolume = (LiveTrackVolume) cmd;
			msg.setAddress("/live/volume");
			msg.addArgument(new Integer(liveTrackVolume.getTrackID()));
			msg.addArgument(new Float(liveTrackVolume.getVolume()));
			((LiveTrackVolume) cmd).setMsg(msg);
		} else if (cmd instanceof LiveTrackSolo) {
			LiveTrackSolo liveTrackSolo = (LiveTrackSolo) cmd;
			msg.setAddress("/live/solo");
			msg.addArgument(new Integer(liveTrackSolo.getTrackID()));
			msg.addArgument(new Integer(liveTrackSolo.getState().getValue()));
			((LiveTrackSolo) cmd).setMsg(msg);
		} else if (cmd instanceof LiveTrackMute) {
			LiveTrackMute liveTrackMute = (LiveTrackMute) cmd;
			msg.setAddress("/live/mute");
			msg.addArgument(new Integer(liveTrackMute.getTrackID()));
			msg.addArgument(new Integer(liveTrackMute.getState().getValue()));
			((LiveTrackMute) cmd).setMsg(msg);
		} else if (cmd instanceof LiveTrackSend) {
			LiveTrackSend liveTrackMute = (LiveTrackSend) cmd;
			msg.setAddress("/live/send");
			msg.addArgument(new Integer(liveTrackMute.getTrackID()));
			msg.addArgument(new Integer(1));
			msg.addArgument(new Float(liveTrackMute.getSend()));
			((LiveTrackSend) cmd).setMsg(msg);
		} else if (cmd instanceof LiveTrackPitch) {
			LiveTrackPitch liveTrackMute = (LiveTrackPitch) cmd;
			msg.setAddress("/live/pitch");
			msg.addArgument(new Integer(liveTrackMute.getTrackID()));
			msg.addArgument(new Float(-48f + (96f * liveTrackMute.getPitch())));
			msg.addArgument(new Float(-50f + (100f * liveTrackMute.getPitch())));
			((LiveTrackPitch) cmd).setMsg(msg);
		} else if (cmd instanceof LiveMasterDeviceView) {
			LiveMasterDeviceView liveMasterDeviceView = (LiveMasterDeviceView) cmd;
			msg.setAddress("/live/master/device/view");
			msg.addArgument(new Integer(liveMasterDeviceView.getDeviceID()));
			((LiveMasterDeviceView) cmd).setMsg(msg);
		} else if (cmd instanceof LiveMasterPanReq) {
			LiveMasterPanReq liveMasterPanReq = (LiveMasterPanReq) cmd;
			msg.setAddress("/live/master/pan");
			msg.addArgument(liveMasterPanReq.getPan());
			((LiveMasterPanReq) cmd).setMsg(msg);
		} else if (cmd instanceof LiveMasterVolume) {
			LiveMasterVolume liveMasterVolume = (LiveMasterVolume) cmd;
			msg.setAddress("/live/master/volume");
			msg.addArgument(liveMasterVolume.getLevel());
			((LiveMasterVolume) cmd).setMsg(msg);
		} else if (cmd instanceof LiveMasterVolumeReq) {
			LiveMasterVolumeReq liveMasterVolumeReq = (LiveMasterVolumeReq) cmd;
			msg.setAddress("/live/master/volume");
			msg.addArgument(liveMasterVolumeReq.getLevel());
			((LiveMasterVolumeReq) cmd).setMsg(msg);
		} else if (cmd instanceof LiveMuteReq) {
			LiveMuteReq liveMuteReq = (LiveMuteReq) cmd;
			msg.setAddress("/live/mute");
			msg.addArgument(liveMuteReq.getTrackID());
			msg.addArgument(liveMuteReq.getStatus().getValue());
			((LiveMuteReq) cmd).setMsg(msg);
		} else if (cmd instanceof LiveNameClipblockreq) {
			LiveNameClipblockreq liveNameClipblockreq = (LiveNameClipblockreq) cmd;
			msg.setAddress("/live/name/clipblock");
			msg.addArgument(liveNameClipblockreq.getTrackID());
			msg.addArgument(liveNameClipblockreq.getClipID());
			msg.addArgument(liveNameClipblockreq.getSizeX());
			msg.addArgument(liveNameClipblockreq.getSizeY());
			((LiveNameClipblockreq) cmd).setMsg(msg);
		} else if (cmd instanceof LiveNameClipReq) {
			LiveNameClipReq liveNameClipReq = (LiveNameClipReq) cmd;
			msg.setAddress("/live/name/clip");
			msg.addArgument(liveNameClipReq.getTrackID());
			msg.addArgument(liveNameClipReq.getClipID());
			msg.addArgument(liveNameClipReq.getLabel());
			((LiveNameClipReq) cmd).setMsg(msg);
		} else if (cmd instanceof LiveNameSceneBlockReq) {
			LiveNameSceneBlockReq liveNameSceneBlockReq = (LiveNameSceneBlockReq) cmd;
			msg.setAddress("/live/name/scene/block");
			msg.addArgument(liveNameSceneBlockReq.getTrackID());
			msg.addArgument(liveNameSceneBlockReq.getSize());
			((LiveNameSceneBlockReq) cmd).setMsg(msg);
		} else if (cmd instanceof LiveNameSceneReq) {
			LiveNameSceneReq liveNameSceneReq = (LiveNameSceneReq) cmd;
			msg.setAddress("/live/name/scene");
			msg.addArgument(liveNameSceneReq.getSceneID());
			msg.addArgument(liveNameSceneReq.getSceneName());
			((LiveNameSceneReq) cmd).setMsg(msg);
		} else if (cmd instanceof LiveNameTrackblockReq) {
			LiveNameTrackblockReq liveNameTrackblockReq = (LiveNameTrackblockReq) cmd;
			msg.setAddress("/live/name/trackblock");
			msg.addArgument(liveNameTrackblockReq.getTrackID());
			msg.addArgument(liveNameTrackblockReq.getSize());
			((LiveNameTrackblockReq) cmd).setMsg(msg);
		} else if (cmd instanceof LiveNameTrackReq) {
			LiveNameTrackReq liveNameTrackReq = (LiveNameTrackReq) cmd;
			msg.setAddress("/live/name/track");
			msg.addArgument(liveNameTrackReq.getTrackName());
			msg.addArgument(liveNameTrackReq.getColor());
			((LiveNameTrackReq) cmd).setMsg(msg);
		} else if (cmd instanceof LiveNextCueReq) {
			msg.setAddress("/live/next/cue");
			((LiveNextCueReq) cmd).setMsg(msg);
		} else if (cmd instanceof LiveOverdub) {
			msg.setAddress("/live/prev/cue");
			((LiveOverdub) cmd).setMsg(msg);
		} else if (cmd instanceof LivePanSet) {
			msg.setAddress("/live/pan/set");
			msg.addArgument(((LivePanSet) cmd).getTrackID());
			((LivePanSet) cmd).setMsg(msg);
		} else if (cmd instanceof LivePitchSet) {
			LivePitchSet livePitchSet = (LivePitchSet) cmd;
			msg.setAddress("/live/pitch/set");
			msg.addArgument(new Integer(livePitchSet.getTrackID()));
			msg.addArgument(new Integer(livePitchSet.getClip()));
			msg.addArgument(new Integer(livePitchSet.getCoarse()));
			msg.addArgument(new Integer(livePitchSet.getFine()));
			((LivePitchSet) cmd).setMsg(msg);
		} else if (cmd instanceof LivePlayClipReq) {
			msg.setAddress("/live/play/clip");
			((LivePlayClipReq) cmd).setMsg(msg);
		} else if (cmd instanceof LivePlayClipSlotReq) {
			LivePlayClipSlotReq livePlayClipSlotReq = (LivePlayClipSlotReq) cmd;
			msg.setAddress("/live/play/clipslot");
			msg.addArgument(new Integer(livePlayClipSlotReq.getTrackID()));
			msg.addArgument(new Integer(livePlayClipSlotReq.getClipID()));
			((LivePlayClipSlotReq) cmd).setMsg(msg);
		} else if (cmd instanceof LivePlayContinueReq) {
			msg.setAddress("/live/play/continue");
			((LivePlayContinueReq) cmd).setMsg(msg);
		} else if (cmd instanceof LivePlayReq) {
			msg.setAddress("/live/play");
			((LivePlayReq) cmd).setMsg(msg);
		}  else if (cmd instanceof LivePlay) {
			msg.setAddress("/live/play");
			((LivePlay) cmd).setMsg(msg);
		} else if (cmd instanceof LivePlaySceneReq) {
			LivePlaySceneReq livePlaySceneReq = (LivePlaySceneReq) cmd;
			msg.setAddress("/live/play/scene");
			msg.addArgument(new Integer(livePlaySceneReq.getSceneID()));
			((LivePlaySceneReq) cmd).setMsg(msg);
		} else if (cmd instanceof LivePrevCueReq) {
			msg.setAddress("/live/prec/cue");
			((LivePrevCueReq) cmd).setMsg(msg);
		} else if (cmd instanceof LiveRedoReq) {
			msg.setAddress("/live/redo");
			((LiveRedoReq) cmd).setMsg(msg);
		} else if (cmd instanceof LiveReturnDevicelist) {
			msg.setAddress("/live/return/devicelist");
			((LiveReturnDevicelist) cmd).setMsg(msg);
		} else if (cmd instanceof LiveReturnDeviceView) {
			msg.setAddress("/live/return/device/view");
			((LiveReturnDeviceView) cmd).setMsg(msg);
		} else if (cmd instanceof LiveReturnMuteReq) {
			LiveReturnMuteReq liveReturnMuteReq = (LiveReturnMuteReq) cmd;
			msg.setAddress("/live/return/mute");
			msg.addArgument(new Integer(liveReturnMuteReq.getTrackID()));
			msg.addArgument(new Integer(liveReturnMuteReq.getStatus().getValue()));
			((LiveReturnMuteReq) cmd).setMsg(msg);
		} else if (cmd instanceof LiveReturnPan) {
			LiveReturnPan liveReturnPan = (LiveReturnPan) cmd;
			msg.setAddress("/live/return/pan");
			msg.addArgument(new Integer(liveReturnPan.getTrackID()));
			msg.addArgument(new Float(liveReturnPan.getPan()));
			((LiveReturnPan) cmd).setMsg(msg);
		} else if (cmd instanceof LiveReturnPanReq) {
			LiveReturnPanReq liveReturnPanReq = (LiveReturnPanReq) cmd;
			msg.setAddress("/live/return/pan");
			msg.addArgument(new Float(liveReturnPanReq.getTrackID()));
			msg.addArgument(new Float(liveReturnPanReq.getPan()));
			((LiveReturnPanReq) cmd).setMsg(msg);
		} else if (cmd instanceof LiveReturnSend) {
			LiveReturnSend liveReturnSend = (LiveReturnSend) cmd;
			msg.setAddress("/live/return/send");
			msg.addArgument(new Integer(liveReturnSend.getTrackID()));
			msg.addArgument(new Float(liveReturnSend.getLevel()));
			msg.addArgument(new Integer(liveReturnSend.getSend()));
			((LiveReturnSend) cmd).setMsg(msg);
		} else if (cmd instanceof LiveReturnSendReq) {
			LiveReturnSendReq liveReturnSendReq = (LiveReturnSendReq) cmd;
			msg.setAddress("/live/return/send");
			msg.addArgument(new Integer(liveReturnSendReq.getTrackID()));
			msg.addArgument(new Float(liveReturnSendReq.getLevel()));
			msg.addArgument(new Integer(liveReturnSendReq.getSend()));
			((LiveReturnSendReq) cmd).setMsg(msg);
		} else if (cmd instanceof LiveReturnSolo) {
			LiveReturnSolo liveReturnSolo = (LiveReturnSolo) cmd;
			msg.setAddress("/live/return/solo");
			msg.addArgument(new Integer(liveReturnSolo.getTrackID()));
			((LiveReturnSolo) cmd).setMsg(msg);
		} else if (cmd instanceof LiveReturnVolume) {
			LiveReturnVolume liveReturnVolume = (LiveReturnVolume) cmd;
			msg.setAddress("/live/return/volume");
			msg.addArgument(new Integer(liveReturnVolume.getTrackID()));
			msg.addArgument(new Float(liveReturnVolume.getLevel()));
			((LiveReturnVolume) cmd).setMsg(msg);
		} else if (cmd instanceof LiveReturnVolumeReq) {
			LiveReturnVolumeReq liveReturnVolumeReq = (LiveReturnVolumeReq) cmd;
			msg.setAddress("/live/return/volume");
			msg.addArgument(new Integer(liveReturnVolumeReq.getTrackID()));
			msg.addArgument(new Float(liveReturnVolumeReq.getLevel()));
			((LiveReturnVolumeReq) cmd).setMsg(msg);
		} else if (cmd instanceof LiveScene2) {
			LiveScene2 liveScene2 = (LiveScene2) cmd;
			msg.setAddress("/live/scene");
			msg.addArgument(new Integer(liveScene2.getSceneID()));
			((LiveScene2) cmd).setMsg(msg);
		}  else if (cmd instanceof LiveSceneReq) {
			LiveSceneReq liveSceneReq = (LiveSceneReq) cmd;
			msg.setAddress("/live/scene");
			msg.addArgument(new Integer(liveSceneReq.getMode()));
			msg.addArgument(new Integer(liveSceneReq.getSceneID()));
			((LiveSceneReq) cmd).setMsg(msg);
		} else if (cmd instanceof LiveSendReq) {
			msg.setAddress("/live/send");
			((LiveSendReq) cmd).setMsg(msg);
		} else if (cmd instanceof LiveStateRcv) {
			LiveStateRcv liveStateRcv = (LiveStateRcv) cmd;
			msg.setAddress("/live/state");
			msg.addArgument(new Float(liveStateRcv.getTempo()));
			((LiveStateRcv) cmd).setMsg(msg);
		} else if (cmd instanceof LiveStateReq) {
			((LiveStateReq) cmd).setMsg(msg);
		} else if (cmd instanceof LiveStopClipReq) {
			LiveStopClipReq liveStopClipReq = (LiveStopClipReq) cmd;
			msg.setAddress("/live/stop/clip");
			msg.addArgument(new Integer(liveStopClipReq.getTrackID()));
			msg.addArgument(new Integer(liveStopClipReq.getClipID()));
			((LiveStopClipReq) cmd).setMsg(msg);
		} else if (cmd instanceof LiveTrackInfo) {
			LiveTrackInfo liveTrackInfo = (LiveTrackInfo) cmd;
			msg.setAddress("/live/track/info");
			msg.addArgument(new Integer(liveTrackInfo.getTrackID()));
			((LiveTrackInfo) cmd).setMsg(msg);
		} else if (cmd instanceof LiveStopReq) {
			msg.setAddress("/live/stop");
			((LiveStopReq) cmd).setMsg(msg);
		} else if (cmd instanceof LiveTrackDeviceView) {
			LiveTrackDeviceView liveTrackDeviceView = (LiveTrackDeviceView) cmd;
			msg.setAddress("/live/track/device/view");
			msg.addArgument(new Integer(liveTrackDeviceView.getTrackID()));
			msg.addArgument(new Integer(liveTrackDeviceView.getDeviceID()));
			((LiveTrackInfo) cmd).setMsg(msg);
		} else if (cmd instanceof LiveTrackJump) {
			LiveTrackJump liveTrackJump = (LiveTrackJump) cmd;
			msg.setAddress("/live/track/jump");
			msg.addArgument(new Integer(liveTrackJump.getTrackID()));
			msg.addArgument(new Float(liveTrackJump.getBeats()));
			((LiveTrackJump) cmd).setMsg(msg);
		} else if (cmd instanceof LiveTracksReq) {
			msg.setAddress("/live/tracks");
			((LiveTracksReq) cmd).setMsg(msg);
		} else if (cmd instanceof LiveUndoReq) {
			msg.setAddress("/live/undo");
			((LiveUndoReq) cmd).setMsg(msg);
		} else if (cmd instanceof LiveTimeRcv) {
			LiveTimeRcv liveTimeRcv = (LiveTimeRcv) cmd;
			msg.setAddress("/live/time");
			msg.addArgument(new Float(liveTimeRcv.getTime()));
			((LiveTimeRcv) cmd).setMsg(msg);
		} else if (cmd instanceof LiveVolumeSet) {
			LiveVolumeSet liveVolumeSet = (LiveVolumeSet) cmd;
			msg.setAddress("/live/volume/set");
			msg.addArgument(new Integer(liveVolumeSet.getTrackID()));
			msg.addArgument(new Float(liveVolumeSet.getLevel()));
			((LiveVolumeSet) cmd).setMsg(msg);
		} else if (cmd instanceof LiveDeviceParamSet) {
			LiveDeviceParamSet liveDeviceParamSet = (LiveDeviceParamSet) cmd;
			msg.setAddress("/live/device");
			msg.addArgument(new Integer(liveDeviceParamSet.getTrackID()));
			msg.addArgument(new Integer(liveDeviceParamSet.getDeviceID()));
			msg.addArgument(new Integer(liveDeviceParamSet.getPIndex()));
			
			Object o = liveDeviceParamSet.getValue();

			if (o instanceof String) {
				try {
					Float vf = Float.parseFloat(o.toString());
					Integer itg = new Integer(vf.intValue());
					msg.addArgument(itg);
				} catch (Exception e) {
				}
			} else if (o instanceof Float) {
				msg.addArgument(o);
			} else if (o instanceof Integer) {
				msg.addArgument(o);	
			}
			//System.out.println("/live/device "+ msg.getArguments()[0] + " " + msg.getArguments()[1] + " " + msg.getArguments()[2] + " " + msg.getArguments()[3]);
			((LiveDeviceParamSet) cmd).setMsg(msg);
		} else if (cmd instanceof livePlaySelectionReq) {
			msg.setAddress("/live/play/selection");
			((livePlaySelectionReq) cmd).setMsg(msg);
		} else if (cmd instanceof livePlaySelectionReq) {
			msg.setAddress("/live/play/selection");
			((livePlaySelectionReq) cmd).setMsg(msg);
		}
		return msg.getByteArray();
	}
	public AbletonLiveSndCmd createLiveTempoReqCmd() {
		LiveTempoReq liveTempoReq = EzabletonFactory.eINSTANCE.createLiveTempoReq();
		return liveTempoReq;
	}
	public AbletonLiveSndCmd createLiveTempoRcvCmd(float tempo) {
		LiveTempoRcv liveTempoRcv = EzabletonFactory.eINSTANCE.createLiveTempoRcv();
		liveTempoRcv.setTempo(tempo);
		return liveTempoRcv;
	}
	public LiveTimeReq createLiveTimeReqCmd() {
		LiveTimeReq liveTimeReq = EzabletonFactory.eINSTANCE.createLiveTimeReq();
		return liveTimeReq;
	}
}