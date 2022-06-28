package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExLog {
	
	static Logger log=LoggerFactory.getLogger("hai");
	public static void main(String[] args) {
		log.info("hello");
	}

}
