package com.big.one.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.big.one.service.PeopleService;
import com.big.one.vo.PeopleVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@CrossOrigin("*")
@Controller
public class PeopleController {
	
	@Resource
	private PeopleService ps;

	@GetMapping("/peoples")
	public @ResponseBody List<PeopleVO> findPeopleList(){
		return ps.selectPeopleList(null);
	}

	@PostMapping("/people")
	public @ResponseBody int insertPeople(@RequestBody @Valid PeopleVO people, BindingResult bindingResult){
		
		log.info("people=>{}",people);
		log.info("bindingResult=>{}",bindingResult);
		int result = ps.insertPeople(people);
		return result;
	}
	
}
