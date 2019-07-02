
/* Drop Triggers */

DROP TRIGGER TRI_people_p_num;



/* Drop Tables */

DROP TABLE people CASCADE CONSTRAINTS;



/* Drop Sequences */

DROP SEQUENCE SEQ_people_p_num;




/* Create Sequences */

CREATE SEQUENCE SEQ_people_p_num INCREMENT BY 1 START WITH 1;



/* Create Tables */

CREATE TABLE people
(
	p_num number(8) NOT NULL,
	p_name varchar2(300) NOT NULL,
	p_age number(3,0) NOT NULL,
	p_gender char(1) NOT NULL,
	p_auth char(3) DEFAULT '000',
	PRIMARY KEY (p_num)
);