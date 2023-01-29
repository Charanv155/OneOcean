package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.request.RequestBodyModel;
import com.example.demo.model.request.Vessel;
import com.example.demo.model.response.PointResponse;
import com.example.demo.model.response.ResponseReport;
import com.example.demo.util.VesselUtil;

import org.springframework.stereotype.Component;

@Component
public class VesselService {

	public List<ResponseReport> getReport(RequestBodyModel vessels) {

		List<ResponseReport> response = new ArrayList<>();

		for (Vessel v : vessels.getVessels()) {
			ResponseReport vesselResponse = new ResponseReport();
			vesselResponse.setVesselName(v.getName());
			vesselResponse.setTotalDistance(VesselUtil.calculateDistance(v));
			vesselResponse.setAvgSpeed(VesselUtil.calculateSpeed(vesselResponse.getTotalDistance(), v));
			List<PointResponse> intersectionDetails = new ArrayList<>();
			for (Vessel vv : vessels.getVessels()) {
				
				if (vv.getName() != v.getName()) {
					intersectionDetails = VesselUtil.cal(vv, v);
				}
			}
			vesselResponse.setIntersectresponse(intersectionDetails);
			response.add(vesselResponse);
		}
		return response;

	}

}
