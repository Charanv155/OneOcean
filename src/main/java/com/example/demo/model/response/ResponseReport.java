package com.example.demo.model.response;

import java.util.List;

public class ResponseReport {

	private String vesselName;
	private double totalDistance;
	private double avgSpeed;
	private List<PointResponse> intersectresponse;

	public List<PointResponse> getIntersectresponse() {
		return intersectresponse;
	}

	public void setIntersectresponse(List<PointResponse> intersectresponse) {
		this.intersectresponse = intersectresponse;
	}

	public double getAvgSpeed() {
		return avgSpeed;
	}

	public void setAvgSpeed(double avgSpeed) {
		this.avgSpeed = avgSpeed;
	}

	public double getTotalDistance() {
		return totalDistance;
	}

	public void setTotalDistance(double totalDistance) {
		this.totalDistance = totalDistance;
	}

	public String getVesselName() {
		return vesselName;
	}

	public void setVesselName(String vesselName) {
		this.vesselName = vesselName;
	}

}
