package com.example.demo.model.response;

import java.sql.Timestamp;

public class MaxMin {
	
	public int min;
	public int max;
	
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	
	private Timestamp maxTimestamp;
	public Timestamp getMaxTimestamp() {
		return maxTimestamp;
	}
	public void setMaxTimestamp(Timestamp maxTimestamp) {
		this.maxTimestamp = maxTimestamp;
	}
	public Timestamp getMinTimestamp() {
		return minTimestamp;
	}
	public void setMinTimestamp(Timestamp minTimestamp) {
		this.minTimestamp = minTimestamp;
	}
	private Timestamp minTimestamp;
	
	
	public String toString()
    {
   	 return "("+min+","+max+")";
    }

}
