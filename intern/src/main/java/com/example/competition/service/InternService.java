package com.example.competition.service;

import com.example.competition.pojo.Intern;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InternService {

	default List<Intern> queryAll(){
		return null;
	}
	default List<Intern> queryByName(String name){
		return null;
	}
	default Intern queryInfo(String id){
		return null;
	}
}
