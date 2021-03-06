package com.worklog.cloudconfigserver

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer
@EnableConfigServer
@SpringBootApplication
class CloudConfigServerApplication {

	static void main(String[] args) {
		SpringApplication.run(CloudConfigServerApplication, args)
	}

}
