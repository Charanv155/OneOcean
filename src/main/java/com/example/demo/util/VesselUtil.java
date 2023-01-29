package com.example.demo.util;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.example.demo.model.request.Position;
import com.example.demo.model.request.RequestBodyModel;
import com.example.demo.model.request.Vessel;
import com.example.demo.model.response.MaxMin;
import com.example.demo.model.response.Point;
import com.example.demo.model.response.PointResponse;

public class VesselUtil {

	public static Map<String, List<MaxMin>> maxmap = new LinkedHashMap<>();

	public static double calculateDistance(Vessel v) {

		List<Position> positions = v.getPositions();
		double distance = 0;
		for (int i = 0; i < positions.size() - 1; i++) {
			int x = positions.get(i + 1).getX() - positions.get(i).getX();
			int y = positions.get(i + 1).getY() - positions.get(i).getY();
			distance += Math.sqrt(x * x + y * y);

		}
		return distance;
	}

	public static double calculateSpeed(double totalDistance, Vessel v) {

		List<Position> positions = v.getPositions();
		Timestamp startime = positions.get(0).getTimestamp();
		Timestamp endtime = positions.get(positions.size() - 1).getTimestamp();

		long diff = endtime.getTime() - startime.getTime();
		long diffHours = diff / (60 * 60 * 1000);

		return totalDistance / diffHours;

	}

	public static List<PointResponse> cal(Vessel vv, Vessel v) {
		List<PointResponse> resultList = new ArrayList<>();
		PointResponse pr = new PointResponse();
		for (int i = 0; i < v.getPositions().size()-1 ; i++) {
			for (int j = 0; j < vv.getPositions().size()-1 ; j++) {
				Point result = getIntersectPoint(v.getPositions().get(i).getX(), v.getPositions().get(i).getY(),
						v.getPositions().get(i + 1).getX(), v.getPositions().get(i + 1).getY(),
						vv.getPositions().get(j).getX(), vv.getPositions().get(j).getY(),
						vv.getPositions().get(j + 1).getX(), vv.getPositions().get(j + 1).getY());
				if (result != null) {
					pr.setIntesectPoint(result);
					pr.setTimestamp1(v.getPositions().get(i).getTimestamp());
					pr.setTimestamp2(vv.getPositions().get(j).getTimestamp());
					pr.setName1(v.getName());
					pr.setName2(vv.getName());
					resultList.add(pr);
				}

			}
		}

		return resultList;
	}

	public static Point getIntersectPoint(double x1, double y1, double x2, double y2, double x3, double y3, double x4,
			double y4) {
		double d = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);
		if (d == 0) {
			return null;
		}

		double xi = ((x3 - x4) * (x1 * y2 - y1 * x2) - (x1 - x2) * (x3 * y4 - y3 * x4)) / d;
		double yi = ((y3 - y4) * (x1 * y2 - y1 * x2) - (y1 - y2) * (x3 * y4 - y3 * x4)) / d;

		if (xi < Math.min(x1, x2) || xi > Math.max(x1, x2) || xi < Math.min(x3, x4) || xi > Math.max(x3, x4)) {
			return null;
		}
		if (yi < Math.min(y1, y2) || yi > Math.max(y1, y2) || yi < Math.min(y3, y4) || yi > Math.max(y3, y4)) {
			return null;
		}
		Point p = new Point();
		p.setA((int) xi);
		p.setB((int) yi);
		return p;
	}

}
