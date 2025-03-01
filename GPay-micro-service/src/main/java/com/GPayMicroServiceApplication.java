package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages="com")
@EntityScan(basePackages="com.entity")
@EnableJpaRepositories(basePackages="com.repository")
@EnableDiscoveryClient

public class GPayMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GPayMicroServiceApplication.class, args);
		System.out.println("Gpay micro service running on 8484");
	}
	@Bean					// object we are creating but maintain by container. 
	@LoadBalanced			// then gpay micro service can communicate with 
	public RestTemplate restTemplate() {		// account micro service using service name rather than 
		return new RestTemplate();			// ip address or localhost and port number 
	}

}
