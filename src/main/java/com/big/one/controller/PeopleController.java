package com.big.one.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.big.one.service.PeopleService;
import com.big.one.vo.PeopleVO;

@CrossOrigin("*")
@Controller
public class PeopleController {
	
	@Resource
	private PeopleService ps;

	@GetMapping("/peoples")
	public @ResponseBody List<PeopleVO> findPeopleList(){
		return ps.selectPeopleList(null);
	}
}
