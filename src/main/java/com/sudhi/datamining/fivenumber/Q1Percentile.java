package com.sudhi.datamining.fivenumber;

import com.sudhi.datamining.dataformat.DataFormat;

public class Q1Percentile {
	public static Integer calcQ1Percentile(DataFormat dataSet){
		double size = dataSet.numberList.size();
		double percentVal = (size/4);
		int percentRound = (int) percentVal;
		return dataSet.numberList.get(percentRound);
	}
}
