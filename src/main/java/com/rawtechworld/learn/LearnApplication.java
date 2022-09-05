package com.rawtechworld.learn;

import com.rawtechworld.learn.game.GameRunner;
import com.rawtechworld.learn.game.MarioGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnApplication.class, args);

		GameRunner gameRunner = context.getBean(GameRunner.class);
//		MarioGame game = new MarioGame();

//		GameRunner gameRunner = new GameRunner(game);
		gameRunner.runGame();

	}

}
