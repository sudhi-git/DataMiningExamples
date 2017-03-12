package com.sudhi.datamining.fivenumber;

import com.sudhi.datamining.dataformat.DataFormat;

public class Q3Percentile {
	public static Integer calcQ3Percentile(DataFormat dataSet){
		double size = dataSet.numberList.size();
		double percentVal = (size*75)/100;
		int percentRound = (int) percentVal;
		return dataSet.numberList.get(percentRound);
	}
}
