package ec.it.springcloud.ms.eurekaserver.eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	/*
	 * servidor de nombre
	 * se registran los servicios
	 * los servicios se comunican con eureka para pedir informacion de otros servicios
	 */
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
