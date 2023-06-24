package com.example.servermanager.servermanager.model;


import com.example.servermanager.servermanager.enumeration.Status;

public class Server {
	private Long id;
	private String ipAddress;
	private String name;
	private String memory;
	private String type;
	private String imgUrl;

	private Status status;
}