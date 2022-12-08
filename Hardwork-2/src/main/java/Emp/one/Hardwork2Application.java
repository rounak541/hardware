package Emp.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ="Emp.controll, Emp.one" )


public class Hardwork2Application {

	public static void main(String[] args) {
		SpringApplication.run(Hardwork2Application.class, args);
	}

}
