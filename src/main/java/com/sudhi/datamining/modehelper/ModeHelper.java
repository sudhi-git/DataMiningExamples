package com.sudhi.datamining.modehelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import com.sudhi.datamining.dataformat.DataFormat;

public class ModeHelper {
	
	private DataFormat dataSet = new DataFormat();

	public ModeHelper(DataFormat dataSet) {
		super();
		this.dataSet = dataSet;
	}
	
	public ModeResult calculateModeValue(){
		Map<Integer, Integer> dataFreq = new HashMap<Integer, Integer>();
		Iterator<Integer> itr = dataSet.numberList.iterator();
		ModeResult mr = new ModeResult();
		Integer modeValue = 0;
		List<ModeResultSub> modeValues = new ArrayList<ModeResultSub>();
		while(itr.hasNext()){
			int temp = (int) itr.next();
			if(dataFreq.containsKey(temp)){
				//Entry exists. Update the Frequency
				int freq = dataFreq.get(temp);
				freq++;
				dataFreq.replace(temp, freq);
			}else{
				dataFreq.put(temp, 1);
			}
		}
		Iterator<Integer> itr1 = dataFreq.keySet().iterator();
		while(itr1.hasNext()){
			int key = itr1.next();
			if(modeValue < dataFreq.get(key)){
				modeValue = dataFreq.get(key);
			}
		}
		if(modeValue == 1){
			mr.setResId(dataSet.getId());
			mr.setModality(0);
			mr.message.setMessage("No mode for the given dataset");
		}else if(modeValue>1){
			itr1 = dataFreq.keySet().iterator();
			while(itr1.hasNext()){
				int key = itr1.next();
				if(modeValue == dataFreq.get(key)){
					ModeResultSub mrs = new ModeResultSub();
					mrs.setDataSetValue(key);
					mrs.setModeCount(modeValue);
					modeValues.add(mrs);
				}
			}
			mr.setResId(dataSet.getId());
			mr.setModality(modeValues.size());;
			mr.setModeList(modeValues);
			mr.message.setMessage("Mode calculated!");
		}
		return mr;
	}
}