package com.gwz.entity;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

public class OrderInfo extends BaseEntity {

	public OrderInfo() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	private String orderName;
	
	@Autowired
	private String orderComment;
	
	@Autowired
	private String trackingNumber;
	
	@Autowired
	private UUID userId;

}
