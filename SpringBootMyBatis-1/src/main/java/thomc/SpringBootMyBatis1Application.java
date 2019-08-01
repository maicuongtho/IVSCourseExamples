package thomc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("thomc.mapper")
public class SpringBootMyBatis1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMyBatis1Application.class, args);
	}

}
