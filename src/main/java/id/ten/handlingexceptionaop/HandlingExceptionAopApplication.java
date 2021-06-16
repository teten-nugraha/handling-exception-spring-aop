package id.ten.handlingexceptionaop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.io.IOException;

@SpringBootApplication
@EnableAspectJAutoProxy
public class HandlingExceptionAopApplication implements CommandLineRunner {

	@Autowired
	private ExceptionalService exceptionalService;


	@Override
	public void run(String... args) throws Exception {
		try {
			Thread.sleep(6000); // hold 6 sec
			exceptionalService.throwsIOExceptionCase();
		} catch (IOException ex) {

		}
	}

	public static void main(String[] args) {
		SpringApplication.run(HandlingExceptionAopApplication.class, args);
	}



}
