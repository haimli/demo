package com.example.demo.service;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

import org.apache.tomcat.jni.Thread;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

	public String executeSQL() throws InterruptedException, ExecutionException {
		String sql = "select * from A";
		
		MyCallable call = new MyCallable();
		FutureTask<String> future = new FutureTask<String>(call);
		
		ExecutorService es = Executors.newFixedThreadPool(1);
		es.execute(future);
		
		return future.get();
	}
	
}
