package com.corejava.practise.JSON_and_XML;

import org.apache.log4j.Logger;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExampleLog4j {

	/* Get the class name to be printed on */
	static Logger log = Logger.getLogger(ExampleLog4j.class.getName());

	public static void main(String[] args) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(formatter.format(date));
		log.debug("Hello this is a debug message"+date);
		log.info("Hello this is an info message"+date);
		
		System.out.println("hi--> " + log.getName());
	}
}
