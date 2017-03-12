package com.sudhi.datamining.fivenumber;

import com.sudhi.datamining.dataformat.DataFormat;

public class Median {
	public Float calcMedian(DataFormat dataSet){
		float temp = dataSet.numberList.size();
		float midWay = ((temp+1)/2);
		double mid = midWay - 0.5;
		if(mid==midWay){
			return (float) dataSet.numberList.get((int) mid);
		}else{
			int readIndexL = (int) mid-1;
			int readIndexU = (int) mid;
			float dataL = dataSet.numberList.get(readIndexL);
			float dataH = dataSet.numberList.get(readIndexU);
			return (dataL+dataH)/2;
		}
	}

}
