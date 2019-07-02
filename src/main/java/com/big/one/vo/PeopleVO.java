package com.big.one.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("people")
@Data
public class PeopleVO {
	
	private Integer ppNum;
	private String ppName;
	private Integer ppAge;
	private Integer ppGender;
	private String ppAuth;
}
