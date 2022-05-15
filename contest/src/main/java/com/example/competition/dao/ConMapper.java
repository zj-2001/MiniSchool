package com.example.competition.dao;

import com.example.competition.pojo.Contest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ConMapper {


	@Select("select conId,conName,type,startTime,endTime from contest where now()<startTime ORDER BY startTime ASC")
	List<Contest> queryList();

	@Select("select conId,conName,type,startTime,endTime from contest where now()<startTime and conName like '%${conName}%' ORDER BY startTime ASC")
	List<Contest> queryLikeName(String conName);

	@Select("select * from contest where conId=#{conId}")
	Contest queryById(String conId);


}
