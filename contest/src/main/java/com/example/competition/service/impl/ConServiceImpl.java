package com.example.competition.service.impl;

import com.example.competition.dao.ConMapper;
import com.example.competition.pojo.Contest;
import com.example.competition.service.ConService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ConServiceImpl implements ConService {

	@Resource
	ConMapper conMapper;

	@Override
	public List<Contest> queryAll() {
		return conMapper.queryList();
	}

	@Override
	public List<Contest> queryByName(String conName) {
		return conMapper.queryLikeName(conName);
	}

	@Override
	public Contest queryInfo(String conId) {
		return conMapper.queryById(conId);
	}
}
