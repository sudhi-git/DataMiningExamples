package com.sudhi.datamining.fivenumber;

import com.sudhi.datamining.dataformat.DataFormat;

public class FiveNumberSummaryHelper {
	private DataFormat dataSet;
	
	public FiveNumberSummaryHelper(DataFormat dataSet) {
		super();
		this.dataSet = dataSet;
	}
	
	public FiveNumberResult calcFiveNumberSummary(){
		FiveNumberResult res = new FiveNumberResult();
		Median med = new Median();
		res.setQ1Percentile(Q1Percentile.calcQ1Percentile(dataSet));
		res.setQ3Percentile(Q3Percentile.calcQ3Percentile(dataSet));
		res.setLowerWhisker(LowerWhisker.calcLW(dataSet, res.getQ1Percentile(), res.getQ3Percentile()));
		res.setUpperWhisker(HigherWhisker.calcHW(dataSet, res.getLowerWhisker(), res.getQ3Percentile()));
		res.setMedian(med.calcMedian(dataSet));
		res.message.setMessage("Values Calculated");
		return res;
	}
}
