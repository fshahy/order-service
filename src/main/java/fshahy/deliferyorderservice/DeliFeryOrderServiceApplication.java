package fshahy.deliferyorderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DeliFeryOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliFeryOrderServiceApplication.class, args);
	}

}
