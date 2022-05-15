package com.example.competition.dao;

import com.example.competition.pojo.Intern;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface InMapper {


	@Select("select internId,inName,type,startTime,endTime from intern where now()<startTime ORDER BY startTime ASC")
	List<Intern> queryList();

	@Select("select internId,inName,type,startTime,endTime from intern where now()<startTime and inName like '%${inName}%' ORDER BY startTime ASC")
	List<Intern> queryLikeName(String inName);

	@Select("select * from intern where internId=#{internId}")
	Intern queryById(String internId);


}
