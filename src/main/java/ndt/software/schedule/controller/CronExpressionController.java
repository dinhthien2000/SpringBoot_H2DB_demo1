package ndt.software.schedule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ndt.software.schedule.entity.CronExpression;
import ndt.software.schedule.service.CronExpressionService;



@Controller
@RequestMapping("cron")
public class CronExpressionController {
	
	@Autowired
	CronExpressionService service;
	
	@ResponseBody
	@GetMapping()
	public String getAll(){
		List<CronExpression> list = null;
		list = service.select();
		String string = "Hello world "; 
		if (list!=null) {
			string = "";
			for (CronExpression cronExpression : list) {
				string =string + cronExpression + " ";
			}
		}
		
		return string;
		
	}
	
}
