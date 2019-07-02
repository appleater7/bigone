delete from people;

insert into people(
	pp_num,
	pp_name,
	pp_age,
	pp_gender,
	pp_auth
)
values(
	SEQ_people_pp_num.nextval,
	'사람1',
	30,
	1,
	''
);
insert into people(
	pp_num,
	pp_name,
	pp_age,
	pp_gender,
	pp_auth
)
values(
	SEQ_people_pp_num.nextval,
	'사람2',
	30,
	1,
	''
);
insert into people(
	pp_num,
	pp_name,
	pp_age,
	pp_gender,
	pp_auth
)
values(
	SEQ_people_pp_num.nextval,
	'사람3',
	30,
	1,
	''
);

commit;

select * from people;