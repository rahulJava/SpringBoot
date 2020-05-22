package com.luv2code.springboot.cruddemo;



import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = { 
//	"com.luv2code.springboot.cruddemo"
//}
//)
public class CruddemoApplication extends SpringBootServletInitializer{

	private static final Logger LOGGER = LoggerFactory.getLogger(CruddemoApplication.class);
	public static void main(String[] args) {
		try {
		LOGGER.info("Starting application.....");
		System.out.println("Hello....");
		
		SpringApplication.run(CruddemoApplication.class, args);
		}catch(Exception e) {
			LOGGER.error("Exception while starting the applocaication ...",e);
			e.printStackTrace();
		}
	} 

}
