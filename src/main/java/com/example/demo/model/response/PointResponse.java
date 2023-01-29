package com.example.demo.model.response;

import java.sql.Timestamp;
import java.util.List;

public class PointResponse {

	private String name1;
	private String name2;
	private Timestamp timestamp1;
	private Timestamp timestamp2;
	private Point intesectPoint;

	public Point getIntesectPoint() {
		return intesectPoint;
	}

	public void setIntesectPoint(Point intesectPoint) {
		this.intesectPoint = intesectPoint;
	}

	public Timestamp getTimestamp1() {
		return timestamp1;
	}

	public void setTimestamp1(Timestamp timestamp1) {
		this.timestamp1 = timestamp1;
	}

	public Timestamp getTimestamp2() {
		return timestamp2;
	}

	public void setTimestamp2(Timestamp timestamp2) {
		this.timestamp2 = timestamp2;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

}
