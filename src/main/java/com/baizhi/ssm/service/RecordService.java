package com.baizhi.ssm.service;

import java.util.List;

import com.baizhi.ssm.entity.Record;
import com.baizhi.ssm.entity.RecordDto;

public interface RecordService {
	List<RecordDto> getAll(int aid);
	void add(Record record);
}
