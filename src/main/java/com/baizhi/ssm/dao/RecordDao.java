package com.baizhi.ssm.dao;

import java.util.List;

import com.baizhi.ssm.entity.Record;
import com.baizhi.ssm.entity.RecordDto;

public interface RecordDao {
	List<RecordDto> getAll(int aid);
	void add(Record record);
}
