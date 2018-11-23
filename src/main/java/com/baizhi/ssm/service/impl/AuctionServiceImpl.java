package com.baizhi.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baizhi.ssm.dao.AuctionDao;
import com.baizhi.ssm.entity.Auction;
import com.baizhi.ssm.entity.User;
import com.baizhi.ssm.service.AuctionService;

@Service
public class AuctionServiceImpl implements AuctionService {
	
	@Autowired
	private AuctionDao auctionDao;
	
	@Override
	public List<Auction> getAll(Auction a) {
		// TODO Auto-generated method stub
        System.out.println(a+"8888888888888888888");
		return auctionDao.getAll(a);
	}

	@Override
	public void add(Auction a) {
		// TODO Auto-generated method stub
		auctionDao.add(a);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		auctionDao.delete(id);
	}

	@Override
	public void update(Auction a) {
		// TODO Auto-generated method stub
		auctionDao.update(a);
	}

	@Override
	public Auction getOne(int id) {
		// TODO Auto-generated method stub
		return auctionDao.getOne(id);
	}

}
