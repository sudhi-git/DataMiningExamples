package com.sudhi.datamining.standarddev;

import com.sudhi.datamining.messagehelper.MessageHelper;

public class StdDevDataStructure {
	public MessageHelper message = new MessageHelper();
	private Float mean;
	private Float median;
	private Float variance;
	private double stdDev;
	public Float getMean() {
		return mean;
	}
	public void setMean(Float mean) {
		this.mean = mean;
	}
	public Float getMedian() {
		return median;
	}
	public void setMedian(Float median) {
		this.median = median;
	}
	public Float getVariance() {
		return variance;
	}
	public void setVariance(Float variance) {
		this.variance = variance;
	}
	public double getStdDev() {
		return stdDev;
	}
	public void setStdDev(double d) {
		this.stdDev = d;
	}
	
	
	

}
