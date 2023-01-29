Vessel Report Readme file

Build command for maven :  mvn clean package 
  
Run the jar with the cmd: java -jar RestServices-0.0.1-SNAPSHOT.jar  

when we pass list of vessels with their respective positions and timestamp,The api will return totaldistance,avgspeed ,intersectiondetails for each vessels.


URL:
http://<hostname>:8080/report

Request body:

{"vessels":[{
	"name": "Vessel 1",
	"positions": [{
		"x": 5,
		"y": 5,
		"timestamp": "2020-01-01T07:40Z"
	}, {
		"x": 9,
		"y": 9,
		"timestamp": "2020-01-01T07:55Z"
	}, {
		"x": 15,
		"y": 11,
		"timestamp": "2020-01-01T08:25Z"
	}, {
		"x": 22,
		"y": 14,
		"timestamp": "2020-01-01T08:50Z"
	}, {
		"x": 29,
		"y": 16,
		"timestamp": "2020-01-01T09:06Z"
	}, {
		"x": 35,
		"y": 17,
		"timestamp": "2020-01-01T09:24Z"
	}, {
		"x": 41,
		"y": 20,
		"timestamp": "2020-01-01T09:45Z"
	}, {
		"x": 48,
		"y": 23,
		"timestamp": "2020-01-01T10:13Z"
	}]
}, {
	"name": "Vessel 2",
	"positions": [{
		"x": 35,
		"y": 35,
		"timestamp": "2020-01-01T08:24Z"
	}, {
		"x": 41,
		"y": 33,
		"timestamp": "2020-01-01T08:48Z"
	}, {
		"x": 45,
		"y": 31,
		"timestamp": "2020-01-01T09:15Z"
	}, {
		"x": 47,
		"y": 27,
		"timestamp": "2020-01-01T09:43Z"
	}, {
		"x": 52,
		"y": 25,
		"timestamp": "2020-01-01T10:12Z"
	}, {
		"x": 56,
		"y": 23,
		"timestamp": "2020-01-01T10:37Z"
	}, {
		"x": 62,
		"y": 19,
		"timestamp": "2020-01-01T10:58Z"
	}, {
		"x": 67,
		"y": 17,
		"timestamp": "2020-01-01T11:24Z"
	}]
}, {
	"name": "Vessel 3",
	"positions": [{
		"x": 30,
		"y": 5,
		"timestamp": "2020-01-01T07:55Z"
	}, {
		"x": 29,
		"y": 9,
		"timestamp": "2020-01-01T08:20Z"
	}, {
		"x": 26,
		"y": 15,
		"timestamp": "2020-01-01T08:49Z"
	}, {
		"x": 24,
		"y": 18,
		"timestamp": "2020-01-01T09:14Z"
	}, {
		"x": 21,
		"y": 23,
		"timestamp": "2020-01-01T09:40Z"
	}, {
		"x": 19,
		"y": 27,
		"timestamp": "2020-01-01T10:08Z"
	}, {
		"x": 16,
		"y": 31,
		"timestamp": "2020-01-01T10:24Z"
	}, {
		"x": 15,
		"y": 37,
		"timestamp": "2020-01-01T10:43Z"
	}]
}]}



Api Response:


[
    {
        "vesselName": "Vessel 1",
        "totalDistance": 47.284032133635066,
        "avgSpeed": 23.642016066817533,
        "intersectresponse": [
            {
                "name1": "Vessel 1",
                "name2": "Vessel 3",
                "timestamp1": "2020-01-01T08:50:00.000+00:00",
                "timestamp2": "2020-01-01T08:49:00.000+00:00",
                "intesectPoint": {
                    "a": 25,
                    "b": 15
                }
            }
        ]
    },
    {
        "vesselName": "Vessel 2",
        "totalDistance": 37.72239535053248,
        "avgSpeed": 12.574131783510827,
        "intersectresponse": []
    },
    {
        "vesselName": "Vessel 3",
        "totalDistance": 35.82271121372412,
        "avgSpeed": 17.91135560686206,
        "intersectresponse": []
    }
]


