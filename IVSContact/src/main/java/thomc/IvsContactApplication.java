package thomc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("thomc.repository")
public class IvsContactApplication {

	public static void main(String[] args) {
		SpringApplication.run(IvsContactApplication.class, args);
	}

}
