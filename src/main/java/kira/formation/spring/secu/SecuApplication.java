package kira.formation.spring.secu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

@SpringBootApplication
public class SecuApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecuApplication.class, args);
		SimpleGrantedAuthority sga = new SimpleGrantedAuthority("ROLE_ADMIN");
	}

}
