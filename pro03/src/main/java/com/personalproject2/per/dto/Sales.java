package com.personalproject2.per.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sales {
	private int sno;
	private int pno;
	private int amount;
	private int tot;
	private String id;
	private String paymethod;
	private String paynum;
	private int dno;
	private String addr;
	private String tel;
	private String delcom;
	private String deltel;
	private String delno;
	private String delstatus;
	/*
	 CREATE TABLE member(id varchar(20) primary key, pw varchar(500) not null, name varchar(100) not null, email varchar(200) not null, tel varchar(100) not null, addr1 varchar(200), addr2 varchar(100), postcode varchar(20), birth date, point int , regdate timestamp default current_timestamp);
CREATE TABLE free(no int auto_increment primary key, title varchar(200), content varchar(1000), hits int default 0, resdate timestamp default current_timestamp, id varchar(20), name varchar(100));
CREATE TABLE qna(no int auto_increment primary key, title varchar(200), content varchar(1000), lev int default 1, parno int, hits int default 0, resdate timestamp default current_timestamp, id varchar(20), name varchar(100));
CREATE TABLE fileboard(no int auto_increment primary key, title varchar(200), content varchar(100), url varchar(300), hits int default 0, resdate timestamp default current_timestamp, author varchar(20));
CREATE TABLE product(pno int auto_increment primary key, cate char(20) not null, pname varchar(100) not null, price int default 100, com varchar(100), img varchar(300));
CREATE TABLE inventory(ino int auto_increment primary key, pno int, iprice int default 1000, oprice int default 1000, amount int default 1, remark varchar(200), foreign key(pno) references product(pno));
CREATE TABLE sales(sno int auto_increment primary key, 
pno int,
amount int default 1, 
tot int, 
id varchar(20), 
paymethod varchar(20), 
paynum varchar(30), 
dno int,
addr varchar(300), 
tel varchar(100), 
delcom varchar(100), 
deltel varchar(50), 
delno varchar(50), 
delstatus varchar(20));

	 */
}
