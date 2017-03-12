package com.sudhi.datamining.fivenumber;

import java.util.Iterator;

import com.sudhi.datamining.dataformat.DataFormat;

public class HigherWhisker {
	public static Integer calcHW(DataFormat dataSet, Integer q1, Integer q3){
		Double IQR = (q3-q1)*1.5;
		Iterator<Integer> itr = dataSet.numberList.iterator();
		int prevValue = 0;
		while(itr.hasNext()){
			int Value = (int) itr.next();
			if(Value > IQR.intValue()){
				break;
			}else{
				prevValue = Value;
			}
		}
		return prevValue;
	}
}
