package org.hcl.controller;


import org.hcl.bean.App;
import org.hcl.service.AppService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonFormat;



@RestController
public class AppController {
	
	AppService  appService = new AppService();
	
	@RequestMapping(value ="/myname", method = RequestMethod.POST,headers = "Accept=application/json")
	public @ResponseBody App postName(@RequestBody App app) {
		return appService.postName(app);
	}

}
