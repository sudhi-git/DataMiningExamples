package com.sudhi.datamining.sort;

import java.util.Collections;

import com.sudhi.datamining.dataformat.DataFormat;

public class SortHelper {
	private DataFormat dataSet;

	public SortHelper(DataFormat dataSet) {
		super();
		this.dataSet = dataSet;
	}
	
	public DataFormat doSort(){
		Collections.sort(dataSet.numberList);
		return dataSet;
	}
}
