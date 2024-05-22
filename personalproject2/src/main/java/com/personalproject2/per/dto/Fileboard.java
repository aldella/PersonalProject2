package com.personalproject2.per.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fileboard {
	int no;
	String title;
	String content;
	String url;
	int hits;
	String resdate;
	String author;
	
	/*
	 CREATE TABLE member(id varchar(20) primary key, pw varchar(500) not null, name varchar(100) not null, email varchar(200) not null, tel varchar(100) not null, addr1 varchar(200), addr2 varchar(100), postcode varchar(20), birth date, point int , regdate timestamp default current_timestamp);
CREATE TABLE free(no int auto_increment primary key, title varchar(200), content varchar(1000), hits int default 0, resdate timestamp default current_timestamp, id varchar(20), name varchar(100));
CREATE TABLE qna(no int auto_increment primary key, title varchar(200), content varchar(1000), lev int default 1, parno int, hits int default 0, resdate timestamp default current_timestamp, id varchar(20), name varchar(100));
	 */
}
