package org.zerock.service;

import org.springframework.stereotype.Service;
import org.zerock.controller.HomeController.SampleService;

@Service
// advice
public class SampleServiceImpl implements SampleService {
	
	@Override
	public Integer doAdd(String str1, String str2) throws Exception {
				// join point
		
		System.out.println(str1);
		
		return Integer.parseInt(str1) + Integer.parseInt(str2);
	}
	
}
