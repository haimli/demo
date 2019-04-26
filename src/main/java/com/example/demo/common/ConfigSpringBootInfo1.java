/**
 * 
 */
package com.example.demo.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author haiming
 *
 */
@Component
public class ConfigSpringBootInfo1 {
	
	@Value("${springboot.username}")
	private String username;

	@Value("${springboot.age}")
	private String age;
	
	@Value("${springboot.address}")
	private String address;
	
	@Value("${springboot.info}")
	private String info;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	
}
