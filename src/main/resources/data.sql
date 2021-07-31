/*
create table Person(
	id integer not null,
	name varchar(255) not null,
	location varchar(255) not null,
	birth_date timestamp,
	primary key(id)
);
*/
INSERT into person(ID,NAME,LOCATION,BIRTH_DATE)
values(10001,'Aniket','Latur',sysdate());

INSERT into person(ID,NAME,LOCATION,BIRTH_DATE)
values(10002,'Ram','Pune',sysdate());

INSERT into person(ID,NAME,LOCATION,BIRTH_DATE)
values(10003,'Ramu','Nagpur',sysdate());
