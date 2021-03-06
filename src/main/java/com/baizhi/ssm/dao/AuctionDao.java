package com.baizhi.ssm.dao;

import java.util.List;

import com.baizhi.ssm.entity.Auction;
import com.baizhi.ssm.entity.User;

public interface AuctionDao {
	List<Auction> getAll(Auction a);
	void add(Auction a);
	void delete(int id);
	void update(Auction a);
	Auction getOne(int id);
}	
