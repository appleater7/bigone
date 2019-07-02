package com.big.one.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

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
	
/*
	@Pattern(regexp="/[0-9]", message="[ppNum error] : only num")
	
	@Pattern(regexp = "/[a-z]|[A-Z]", message="[ppName error] : only eng")
	@NotNull(message="[ppName error] : not null")
	
	@NotNull(message="[ppAge error] : not null")
	@Max(value=200, message="[ppAge error] : under 200")
	
	@NotNull(message="[ppGender error] : not null")
	@Digits(integer=1, fraction=0 , message="[ppGender error] : size is only One")
	@Max(value=1, message="[ppGender error] : only 0 or 1")
	
	@Pattern(regexp="/[0-7]", message="[ppAuth error] : each level only 0 to 7")
	@Size(min=3,max=3, message="[ppAuth error] : length only 3")
	@NotNull(message="[ppAuth error] : not null")
	
	TestData
	{
	"ppNum":"5",
  	"ppName":"YJ33",
    "ppAge":"30",
	"ppGender":"1",
  	"ppAuth":"778"
	}
 */
	@PostMapping("/people")
	public @ResponseBody int insertPeople(@RequestBody @Valid PeopleVO people, BindingResult bindingResult){
		
		log.info("people=>{}",people);
		log.info("bindingResult=>{}",bindingResult);
		int result = ps.insertPeople(people);
		return result;
	}
	
}
