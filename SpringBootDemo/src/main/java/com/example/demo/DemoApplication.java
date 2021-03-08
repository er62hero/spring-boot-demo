package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		// String accessKey = System.getenv(ACCESS_KEY_ENV_VAR);
		// if (accessKey == null) {
		// accessKey = System.getenv(ALTERNATE_ACCESS_KEY_ENV_VAR);
		// }
		// String secretKey = System.getenv(SECRET_KEY_ENV_VAR);
		// if (secretKey == null) {
		// secretKey = System.getenv(ALTERNATE_SECRET_KEY_ENV_VAR);
		// }
		// System.out.println("accessKey=" + accessKey);
		// System.out.println("secretKey=" + secretKey);

		// SpringBoot起動
		SpringApplication.run(DemoApplication.class, args);
	}
}
