package com.sudhi.datamining.standarddev;

import java.util.Iterator;

import com.sudhi.datamining.dataformat.DataFormat;
import com.sudhi.datamining.fivenumber.Median;

public class StandardDeviation {
	private DataFormat dataSet;
	private StdDevDataStructure stdDev = new StdDevDataStructure();

	public StandardDeviation(DataFormat dataSet) {
		super();
		this.dataSet = dataSet;
	}
	
	public StdDevDataStructure calcValues(){
		Iterator<Integer> itr1 = dataSet.numberList.iterator();
		float totalValue = 0;
		float totalValSq = 0;
		Median med = new Median();
		while(itr1.hasNext()){
			float temp = itr1.next();
			totalValue = totalValue + temp;
			totalValSq = totalValSq + (temp * temp);
		}
		stdDev.setMean(totalValue/dataSet.numberList.size());
		stdDev.setMedian(med.calcMedian(dataSet));
		float variance = (totalValSq - ((totalValue*totalValue)/dataSet.numberList.size()))/dataSet.numberList.size();
		stdDev.setVariance(variance);
		stdDev.setStdDev(Math.sqrt(variance));
		stdDev.message.setMessage("Values Calculated");
		return stdDev;
	}
	
}
