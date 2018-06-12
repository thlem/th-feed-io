package th.com.th_api_root;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AppApi extends SpringBootServletInitializer {
	
	public static <T> void start(Class<T> clazz, String[] args) {
		SpringApplication.run(clazz, args);
		System.out.println("START FROM ROOT");
	}
	
}
