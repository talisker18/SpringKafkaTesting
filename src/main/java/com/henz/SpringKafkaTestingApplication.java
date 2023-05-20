package com.henz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;
import org.springframework.kafka.annotation.EnableKafka;

//@SpringBootApplication
//@SpringBootApplication(exclude={KafkaAutoConfiguration.class})
//@EnableKafka
public class SpringKafkaTestingApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringKafkaTestingApplication.class, args);
	}

}
