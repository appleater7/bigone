package com.big.one.service;

import java.util.List;

import com.big.one.vo.PeopleVO;

public interface PeopleService {

	public List<PeopleVO> selectPeopleList(PeopleVO people);
}
