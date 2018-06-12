package th.com.th_data;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@EnableEncryptableProperties
@Configuration
public class ThDataSource {

	@Bean
	public DataSource firstDataSource() {
		return DataSourceBuilder
		        .create()
		        .username("thu")
		        .password("mysqlPassKey")
		        .url("jdbc:mysql://localhost:3306/th_application")
		        .build();
	}
}
