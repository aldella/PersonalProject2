package com.personalproject2.per.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Free {
	int no;
	String title;
	String content;
	int hits;
	String resdate;
	String id;
	String name;
	
	/*
	 CREATE TABLE member(id varchar(20) primary key, pw varchar(500) not null, name varchar(100) not null, email varchar(200) not null, tel varchar(100) not null, addr1 varchar(200), addr2 varchar(100), postcode varchar(20), birth date, point int , regdate timestamp default current_timestamp);

	 */
}