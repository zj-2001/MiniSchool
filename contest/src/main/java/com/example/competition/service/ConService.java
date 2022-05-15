package com.example.competition.service;

import com.example.competition.pojo.Contest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ConService {

	default List<Contest> queryAll(){
		return null;
	}
	default List<Contest> queryByName(String name){
		return null;
	}
	default Contest queryInfo(String id){
		return null;
	}
}
