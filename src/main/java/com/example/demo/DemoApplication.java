package com.example.demo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
@Slf4j
public class DemoApplication implements CommandLineRunner{

	@Autowired
	KafkaSender kafkaSender;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		for (int i = 0; i < 3; i++) {
			//调用消息发送类中的消息发送方法
			kafkaSender.send();

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
