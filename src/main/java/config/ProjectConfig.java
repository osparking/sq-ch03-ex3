package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import entity.Parrot;
import entity.Person;

@Configuration
public class ProjectConfig {

	@Bean
	Parrot parrot() {
		var p = new Parrot();
		p.setName("루키");
		return p;
	}
	
	@Bean
	Person person(Parrot parrot) {
		var pe = new Person();
		pe.setName("찰수");
		pe.setParrot(parrot);
		
		return pe;
	}

}
