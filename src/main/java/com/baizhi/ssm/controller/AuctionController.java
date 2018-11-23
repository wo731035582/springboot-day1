package com.baizhi.ssm.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.baizhi.ssm.entity.Auction;
import com.baizhi.ssm.service.AuctionService;

@Controller
@RequestMapping("/auction")
public class AuctionController {
	@Autowired
	private AuctionService auctionService;
	
	@RequestMapping("/getAll")
	public String getAll(Auction a,Map map){
		System.out.println(a.getStartPrice());
		System.out.println(a+"+++++++++++++++++++++");
		map.put("alist", auctionService.getAll(a));
		return "/show";
	}
	
	@RequestMapping("/add")
	public String add(Auction a,MultipartFile myPhoto,HttpServletRequest request) throws IllegalStateException, IOException{
		String fileName=new Date().getTime()+"_"+myPhoto.getOriginalFilename();
		String realPath=request.getSession().getServletContext().getRealPath("/loadup");
		File filePath = new File(realPath+"\\"+fileName);
/*		// 如果保存文件的地址不存在，就先创建目录
		if (!filePath.exists()) {
			filePath.mkdirs();
		}*/

		myPhoto.transferTo(filePath);
		a.setOic(fileName);
		auctionService.add(a);
		return "redirect:/auction/getAll.do";
	}
	
	@RequestMapping("/delete")
	public String delete(int id){
		auctionService.delete(id);
		return "redirect:/auction/getAll.do";
	}
	
	@RequestMapping("/getOne")
	public String getOne(int id,Map map){
		map.put("acu",auctionService.getOne(id));
		return "update";
	}
	
	@RequestMapping("/update")
	public String update(Auction a,MultipartFile myPhoto,HttpServletRequest request) throws IllegalStateException, IOException{
		if(!"".equals(myPhoto.getOriginalFilename())){
			String fileName=new Date().getTime()+"_"+myPhoto.getOriginalFilename();
			String realPath=request.getSession().getServletContext().getRealPath("/loadup/");
			File filePath = new File(realPath+"\\"+fileName);
			// 如果保存文件的地址不存在，就先创建目录
			if (!filePath.exists()) {
				filePath.mkdirs();
			}

			myPhoto.transferTo(filePath);
			a.setOic(fileName);
		}
		auctionService.update(a);
		return "redirect:/auction/getAll.do";
	}
}
