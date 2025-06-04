package com.javanauta.bffagendador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableFeignClients //Sem essa anotação o FeignClients não funciona
@EnableScheduling //Permite que nosso Scheduling(cron) rode corretamente
public class BffAgendadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(BffAgendadorApplication.class, args);
	}

}
