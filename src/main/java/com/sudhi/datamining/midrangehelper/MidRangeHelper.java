package com.sudhi.datamining.midrangehelper;

import java.util.Iterator;

import com.sudhi.datamining.dataformat.DataFormat;

public class MidRangeHelper {
	private DataFormat dataSet;

	public MidRangeHelper(DataFormat dataSet) {
		super();
		this.dataSet = dataSet;
	}
	
	public MidrangeResult calculateMidrange(){
		MidrangeResult midrange = new MidrangeResult();
		Iterator<Integer> itr1 = dataSet.getNumberList().iterator();
		Iterator<Integer> itr2 = dataSet.getNumberList().iterator();
		float min = itr1.next();
		float max = 0;
		while(itr2.hasNext()){
			int temp=itr2.next();
			if(min>temp){
				min = temp;
			}
			if(max<temp){
				max = temp;
			}
		}
		midrange.setMidrange((min + max)/2);
		midrange.message.setMessage("Midrange Calculated");
		return midrange;
	}

}
