package com.example.competition.service.impl;

import com.example.competition.dao.InMapper;
import com.example.competition.pojo.Intern;
import com.example.competition.service.InternService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class InternServiceImpl implements InternService {

	@Resource
	InMapper inMapper;

	@Override
	public List<Intern> queryAll() {
		return inMapper.queryList();
	}

	@Override
	public List<Intern> queryByName(String inName) {
		return inMapper.queryLikeName(inName);
	}

	@Override
	public Intern queryInfo(String inId) {
		return inMapper.queryById(inId);
	}
}
