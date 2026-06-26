package com.gatewayFH.GatewayFechaHora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GatewayFechaHoraApplication {
	//http://localhost:8081/api/v1/fecha-hora-actual

	public static void main(String[] args) {
		SpringApplication.run(GatewayFechaHoraApplication.class, args);
	}

}
