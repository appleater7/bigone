delete table people;

insert into people(
	p_num,
	p_name,
	p_age,
	p_gender,
	p_auth
)
values(
	SEQ_people_p_num.nextval,
	'사람1',
	30,
	1,
	''
);
insert into people(
	p_num,
	p_name,
	p_age,
	p_gender,
	p_auth
)
values(
	SEQ_people_p_num.nextval,
	'사람2',
	30,
	1,
	''
);
insert into people(
	p_num,
	p_name,
	p_age,
	p_gender,
	p_auth
)
values(
	SEQ_people_p_num.nextval,
	'사람3',
	30,
	1,
	''
);

commit;

select * from people;