package com.big.one.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.big.one.mapper.PeopleMapper;
import com.big.one.service.PeopleService;
import com.big.one.vo.PeopleVO;

@Service
public class PeopleServiceImpl implements PeopleService {
	
	@Resource
	private PeopleMapper pm;

	@Override
	public List<PeopleVO> selectPeopleList(PeopleVO people) {
		return pm.selectPeopleList(people);
	}

}
