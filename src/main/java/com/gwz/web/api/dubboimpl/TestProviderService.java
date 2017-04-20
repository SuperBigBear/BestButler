package com.gwz.web.api.dubboimpl;

import org.springframework.stereotype.Service;

import com.gwz.web.api.dubbo.ITestProviderService;

/*
 * bean name testProviderService
 * */
@Service("testProviderService")
public class TestProviderService implements ITestProviderService {

	@Override
	public void Test() {
		// TODO Auto-generated method stub
		
	}
	 
	public TestProviderService() {
		// TODO Auto-generated constructor stub
	}

}
