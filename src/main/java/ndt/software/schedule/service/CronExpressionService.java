package ndt.software.schedule.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ndt.software.schedule.entity.CronExpression;
import ndt.software.schedule.repository.CronExpressionRepository;

@Service
public class CronExpressionService {
	
	@Autowired
	CronExpressionRepository repository;
	
	
	public List<CronExpression> getCron() {
		List<CronExpression> list = null;
		try {
			list = repository.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<CronExpression> select() {
		List<CronExpression> list = new ArrayList<>();
		try {
			list = repository.selectFrom();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
