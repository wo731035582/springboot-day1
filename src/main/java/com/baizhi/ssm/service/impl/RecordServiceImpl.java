package com.baizhi.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baizhi.ssm.dao.RecordDao;
import com.baizhi.ssm.entity.Record;
import com.baizhi.ssm.entity.RecordDto;
import com.baizhi.ssm.service.RecordService;
@Service
public class RecordServiceImpl implements RecordService {
	@Autowired
	private RecordDao recordDao;
	
	@Override
	public List<RecordDto> getAll(int aid) {
		// TODO Auto-generated method stub
		return recordDao.getAll(aid);
	}

	@Override
	public void add(Record record) {
		// TODO Auto-generated method stub
		recordDao.add(record);
	}

}
