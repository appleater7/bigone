
/* Drop Tables */

DROP TABLE people CASCADE CONSTRAINTS;



/* Drop Sequences */

DROP SEQUENCE SEQ_people_pp_num;




/* Create Sequences */

CREATE SEQUENCE SEQ_people_pp_num INCREMENT BY 1 START WITH 1;



/* Create Tables */

CREATE TABLE people
(
	pp_num number(8) NOT NULL,
	pp_name varchar2(300) NOT NULL,
	pp_age number(3,0) NOT NULL,
	pp_gender char(1) NOT NULL,
	pp_auth char(3),
	PRIMARY KEY (pp_num)
);



