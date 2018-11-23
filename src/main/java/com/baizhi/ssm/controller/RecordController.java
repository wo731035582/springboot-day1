package com.baizhi.ssm.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baizhi.ssm.entity.Record;
import com.baizhi.ssm.service.AuctionService;
import com.baizhi.ssm.service.RecordService;

@Controller
@RequestMapping("/record")
public class RecordController {
	@Autowired
	private RecordService recordService;
	@Autowired
	private AuctionService auctionService;
	
	@RequestMapping("/getAll")
	public String getAll(Map map,int id){
		map.put("auction",auctionService.getOne(id));
		map.put("recordList", recordService.getAll(id));
		return "jingpai";
	}
	
	@RequestMapping("/add")
	public String add(Record record){
		System.out.println(record);
		recordService.add(record);
		return "redirect:/record/getAll.do?id="+record.getAid();
	}
}
