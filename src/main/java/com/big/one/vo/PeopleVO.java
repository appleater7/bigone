package com.big.one.vo;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.apache.ibatis.type.Alias;

import lombok.Data;
/*
 * 객체에 직접 밸리데이션 조건을 부여하는것은 
 * Spring 에 있는 기능이 아니라, Hibernate Validator 라는 라이브러리에 의존성을 띔
 * 이하 Hibernate Validator 어노테이션 설명
 * 
 * @AssertFalse : false 값만 통과 가능
 * @AssertTrue : true 값만 통과 가능
 * @DecimalMax(value=) : 지정된 값 이하의 실수만 통과 가능
 * @DecimalMin(value=) : 지정된 값 이상의 실수만 통과 가능
 * @Digits(integer=,fraction=) : 대상 수가 지정된 정수와 소수 자리수보다 적을 경우 통과 가능
 * @Future : 대상 날짜가 현재보다 미래일 경우만 통과 가능
 * @Past : 대상 날짜가 현재보다 과거일 경우만 통과 가능
 * @Max(value) : 지정된 값보다 아래일 경우만 통과 가능
 * @Min(value) : 지정된 값보다 이상일 경우만 통과 가능
 * @NotNull : null 값이 아닐 경우만 통과 가능
 * @Null : null일 겨우만 통과 가능
 * @Pattern(regex=, flag=) : 해당 정규식을 만족할 경우만 통과 가능
 * @Size(min=, max=) : 문자열 또는 배열이 지정된 값 사이일 경우 통과 가능
 * @Valid : 대상 객체의 확인 조건을 만족할 경우 통과 가능
 * 
 * 참조1 : https://hibernate.org/validator/
 * 
 * -. 정규표현식
 * 참조1 : https://regexr.com/
 * 참조2 
 * 참조2 : https://docs.spring.io/spring/docs/4.3.24.RELEASE/spring-framework-reference/htmlsingle/ 
 *         22.16.4 Validation
 * 
 */
@Alias("people")
@Data
public class PeopleVO {
//	@Pattern(regexp="/[0-9]", message="[ppNum error] : only num")
	private Integer ppNum;
	@Pattern(regexp = "/[a-z]|[A-Z]", message="[ppName error] : only eng")
	@NotNull(message="[ppName error] : not null")
	private String ppName;
	@NotNull(message="[ppAge error] : not null")
	@Max(value=200, message="[ppAge error] : under 200") 
	private Integer ppAge;
	@NotNull(message="[ppGender error] : not null")
	@Digits(integer=1, fraction=0 , message="[ppGender error] : size is only One")
	@Max(value=1, message="[ppGender error] : only 0 or 1")
	private Integer ppGender;
	@Pattern(regexp="/[0-7]", message="[ppAuth error] : each level only 0 to 7")
	@Size(min=3,max=3, message="[ppAuth error] : length only 3")
	@NotNull(message="[ppAuth error] : not null")
	private String ppAuth;
}
