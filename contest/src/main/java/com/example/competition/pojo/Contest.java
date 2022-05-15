package com.example.competition.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contest {
	String conId;
	String conName;
	String type;
	String startTime;
	String endTime;
	String conInfo;

}
