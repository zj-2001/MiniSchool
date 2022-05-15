package com.example.competition.controller;

import com.alibaba.fastjson.JSON;
import com.example.competition.pojo.Intern;
import com.example.competition.service.impl.InternServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("intern")
public class ConController {

	@Resource
	InternServiceImpl internService;

	@RequestMapping("/queryInternList")
	public String queryAll(){
		List<Intern> list= internService.queryAll();
		return list==null?null:JSON.toJSONString(list);
	}
	@RequestMapping("/queryInternName")
	public String queryName(String inName){
		List<Intern> list= internService.queryByName(inName);
		return list==null?null:JSON.toJSONString(list);
	}

	@RequestMapping("/queryInternInfo")
	public Intern queryInfo(String internId){
		Intern Intern= internService.queryInfo(internId);
		return Intern==null?null:Intern;
	}



}
