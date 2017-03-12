package com.sudhi.datamining.fivenumber;

import com.sudhi.datamining.messagehelper.MessageHelper;

public class FiveNumberResult {
	private Integer q1Percentile;
	private Integer q3Percentile;
	private Float median;
	private Integer UpperWhisker;
	private Integer LowerWhisker;
	public MessageHelper message = new MessageHelper();
	public Integer getQ1Percentile() {
		return q1Percentile;
	}
	public void setQ1Percentile(Integer q1Percentile) {
		this.q1Percentile = q1Percentile;
	}
	public Integer getQ3Percentile() {
		return q3Percentile;
	}
	public void setQ3Percentile(Integer q3Percentile) {
		this.q3Percentile = q3Percentile;
	}
	public Float getMedian() {
		return median;
	}
	public void setMedian(Float median) {
		this.median = median;
	}
	public Integer getUpperWhisker() {
		return UpperWhisker;
	}
	public void setUpperWhisker(Integer upperWhisker) {
		UpperWhisker = upperWhisker;
	}
	public Integer getLowerWhisker() {
		return LowerWhisker;
	}
	public void setLowerWhisker(Integer lowerWhisker) {
		LowerWhisker = lowerWhisker;
	}
}
