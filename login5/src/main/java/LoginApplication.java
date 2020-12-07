

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.login.model.login;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
public class LoginApplication {

	public static HashMap<Long, login> loginhm;
	public static void main(String[] args) {
		SpringApplication.run(LoginApplication.class, args);
	}

}
