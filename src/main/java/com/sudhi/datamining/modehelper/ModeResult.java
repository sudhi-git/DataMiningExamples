package com.sudhi.datamining.modehelper;

import java.util.List;

import com.sudhi.datamining.messagehelper.MessageHelper;

public class ModeResult {
	public String resId;
	public List<ModeResultSub> modeList;
	public Integer modality;
	public MessageHelper message = new MessageHelper();
	public String getResId() {
		return resId;
	}
	public void setResId(String resId) {
		this.resId = resId;
	}

	public List<ModeResultSub> getModeList() {
		return modeList;
	}
	public void setModeList(List<ModeResultSub> modeList) {
		this.modeList = modeList;
	}
	public Integer getModality() {
		return modality;
	}
	public void setModality(Integer modality) {
		this.modality = modality;
	}
}
