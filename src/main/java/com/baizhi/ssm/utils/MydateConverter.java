package com.baizhi.ssm.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class MydateConverter implements Converter<String, Date> {

	private String[] pattern={"yyyy-MM-dd HH:mm:ss","yyyy/MM/dd HH:mm:ss","yyyy年MM月dd HH时:mm分:ss秒"};
	public void setPattern(String[] pattern) {

		this.pattern = pattern;
	}


	@Override
	public Date convert(String arg0) {
		// TODO Auto-generated method stub
		System.out.println(pattern+"******************");
		for (String pa : pattern) {
			SimpleDateFormat sdf=new SimpleDateFormat(pa);
			try {
				Date date=sdf.parse(arg0);
				return date;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
			}
		}
		return null;
	}

}
