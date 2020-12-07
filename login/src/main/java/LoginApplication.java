

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
		
		loginhm = new HashMap<Long, login> ();
		
		login login_one = new login("yeji","1234");
		loginhm.put(new Long(login_one.getId()), login_one);

        SpringApplication.run(RestApplication.class, args);
        
        login log_two = new login("minjii","12345");
        loginhm.put(new Long(log_two.getId()), login_one);
		
		
	}

}
