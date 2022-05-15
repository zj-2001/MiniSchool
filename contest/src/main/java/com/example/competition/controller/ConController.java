package com.example.competition.controller;

import com.alibaba.fastjson.JSON;
import com.example.competition.pojo.Contest;
import com.example.competition.service.impl.ConServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("contest")
public class ConController {

	@Resource
	ConServiceImpl conServiceImpl;

	@RequestMapping("/queryContestList")
	public String queryAll(){
		List<Contest> list=conServiceImpl.queryAll();
		return list==null?null:JSON.toJSONString(list);
	}
	@RequestMapping("/queryContestName")
	public String queryName(String conName){
		List<Contest> list=conServiceImpl.queryByName(conName);
		return list==null?null:JSON.toJSONString(list);
	}

	@RequestMapping("/queryContestInfo")
	public Contest queryInfo(String conId){
		Contest contest=conServiceImpl.queryInfo(conId);
		return contest==null?null:contest;
	}



}
