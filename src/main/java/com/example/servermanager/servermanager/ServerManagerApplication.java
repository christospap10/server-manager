package com.example.servermanager.servermanager;

import com.example.servermanager.servermanager.enumeration.Status;
import com.example.servermanager.servermanager.model.Server;
import com.example.servermanager.servermanager.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerManagerApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepo serverRepo) {
		return args -> {
			serverRepo.save(new Server(null,
					"192.168.1.168",
					"Ubuntu Linux",
					"16 GB" ,
					"Personal PC" ,
					"http://localhost:8080/server/image/server1/png",
					Status.SERVER_UP));
			serverRepo.save(new Server(null,
					"192.168.1.178",
					"Fedora Linux",
					"34 GB" ,
					"AWS" ,
					"http://localhost:8080/server/image/server1/png",
					Status.SERVER_UP));
			serverRepo.save(new Server(null,
					"192.168.2.127",
					"Corretto",
					"16 GB" ,
					"Azure" ,
					"http://localhost:8080/server/image/server2/png",
					Status.SERVER_UP));
		};

	};
}
