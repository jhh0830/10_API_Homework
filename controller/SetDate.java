package com.hw3.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SetDate {

	public SetDate(){};
	
	public void todayPrint(){
		Date today = new Date();
		String t = today.toString();
		System.out.println(t);
		
	}
	public void  setDay() {
		Date date2= new Date(); // 현재 날짜 및 시간
		date2.setYear(2011);
		date2.setMonth(3);
		date2.setDate(21);
		
		System.out.println(date2);

	}
}
