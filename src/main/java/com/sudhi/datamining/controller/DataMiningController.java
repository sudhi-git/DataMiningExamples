package com.sudhi.datamining.controller;

import java.io.IOException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sudhi.datamining.dataformat.DataFormat;
import com.sudhi.datamining.fivenumber.FiveNumberResult;
import com.sudhi.datamining.fivenumber.FiveNumberSummaryHelper;
import com.sudhi.datamining.midrangehelper.MidRangeHelper;
import com.sudhi.datamining.midrangehelper.MidrangeResult;
import com.sudhi.datamining.modehelper.ModeHelper;
import com.sudhi.datamining.modehelper.ModeResult;
import com.sudhi.datamining.sort.SortHelper;
import com.sudhi.datamining.standarddev.StandardDeviation;
import com.sudhi.datamining.standarddev.StdDevDataStructure;

@RestController
@RequestMapping("/datamining")
public class DataMiningController {
	
	@RequestMapping(path="/mode/", method = RequestMethod.POST, consumes="application/json", produces = "application/json")
	public ResponseEntity<?> calculateMode(@RequestBody DataFormat dataSet) throws IOException{
		ModeHelper modeCalc = new ModeHelper(dataSet);
		return new ResponseEntity<ModeResult> (modeCalc.calculateModeValue(), HttpStatus.OK);
	}
	@RequestMapping(path="/midrange/", method = RequestMethod.POST, consumes="application/json", produces = "application/json")
	public ResponseEntity<?> calculateMidRange(@RequestBody DataFormat dataSet) throws IOException{
		MidRangeHelper midCalc = new MidRangeHelper(dataSet);
		return new ResponseEntity<MidrangeResult> (midCalc.calculateMidrange(), HttpStatus.OK);
	}
	@RequestMapping(path="/stddev/", method = RequestMethod.POST, consumes="application/json", produces = "application/json")
	public ResponseEntity<?> calculateStdDev(@RequestBody DataFormat dataSet) throws IOException{
		StandardDeviation stdDev = new StandardDeviation(dataSet);
		return new ResponseEntity<StdDevDataStructure> (stdDev.calcValues(), HttpStatus.OK);
	}
	@RequestMapping(path="/fivenumber/", method = RequestMethod.POST, consumes="application/json", produces = "application/json")
	public ResponseEntity<?> calculateFiveNumber(@RequestBody DataFormat dataSet) throws IOException{
		FiveNumberSummaryHelper fiveNumber = new FiveNumberSummaryHelper(dataSet);
		return new ResponseEntity<FiveNumberResult> (fiveNumber.calcFiveNumberSummary(), HttpStatus.OK);
	}
	@RequestMapping(path="/sortdata/", method = RequestMethod.POST, consumes="application/json", produces = "application/json")
	public ResponseEntity<?> sortDataSet(@RequestBody DataFormat dataSet) throws IOException{
		SortHelper sorter = new SortHelper(dataSet);
		return new ResponseEntity<DataFormat> (sorter.doSort(), HttpStatus.OK);
	}
}

