package com.example.competition.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Intern {
	String internId;
	String inName;
	String type;
	String startTime;
	String endTime;
	String Info;

}
