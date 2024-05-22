package com.personalproject2.per.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	
	String id;
	String pw;
	String name;
	String email;
	String tel;
	String addr1;
	String addr2;
	String postcode;
	String birth;
	int point;
	String regdate;

}
