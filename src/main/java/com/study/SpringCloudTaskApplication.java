package com.study;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class SpringCloudTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTaskApplication.class, args);
	}
	
	//bean declaration for our MyCustomTask
	@Bean
	public MyCustomTask myCustomTask() {
		return new MyCustomTask();
	}
	
	//this is our custom task
	public class MyCustomTask implements CommandLineRunner{

		@Override
		public void run(String... args) throws Exception {
			if (null != args) {
				System.out.println(args);
			}
		}
	}

}
