package com.sapient.wellington.investmentstrategy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * A starter class used by spring boot for investment module
 *
 */
@Configuration
@SpringBootApplication
@EnableJpaRepositories
public class InvestmentStrategyStarter {

	public static void main(String[] args) {
		SpringApplication.run(InvestmentStrategyStarter.class, args);
	}

}