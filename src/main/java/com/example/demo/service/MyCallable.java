package com.example.demo.service;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

	public MyCallable() {
		
	}
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		long id = Thread.currentThread().getId();
		System.out.println(Thread.currentThread());
		System.out.println("id:"+id);
		return ""+id;
	}

}
