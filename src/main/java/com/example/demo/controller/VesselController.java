package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.request.RequestBodyModel;
import com.example.demo.model.response.ResponseReport;
import com.example.demo.service.VesselService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VesselController {

	@Autowired
	private VesselService vesselService;

	@PostMapping(value = "/report")
	public List<ResponseReport> getReport(@RequestBody RequestBodyModel vessels) {
		return vesselService.getReport(vessels);

	}

}
