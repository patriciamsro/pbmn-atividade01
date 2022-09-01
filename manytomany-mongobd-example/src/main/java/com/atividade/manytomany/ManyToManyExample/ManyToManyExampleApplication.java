package com.atividade.manytomany.ManyToManyExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ManyToManyExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManyToManyExampleApplication.class, args);
	}

}
