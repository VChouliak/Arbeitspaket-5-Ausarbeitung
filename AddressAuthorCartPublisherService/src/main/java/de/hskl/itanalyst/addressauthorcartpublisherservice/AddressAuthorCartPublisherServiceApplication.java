package de.hskl.itanalyst.addressauthorcartpublisherservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableEurekaClient
@EnableFeignClients
public class AddressAuthorCartPublisherServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(AddressAuthorCartPublisherServiceApplication.class, args);
	}
}
