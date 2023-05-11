package com.InversionOfControl.InversionOfControl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class InversionOfControlApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(InversionOfControlApplication.class, args);

		ArcadeService arcadeService = context.getBean(ArcadeService.class);
		arcadeService.startGame();
		arcadeService.stopGame();

	}

}
