package com.big.one.mapper;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.big.one.vo.PeopleVO;

@MapperScan
public interface PeopleMapper {

	public List<PeopleVO> selectPeopleList();
}
