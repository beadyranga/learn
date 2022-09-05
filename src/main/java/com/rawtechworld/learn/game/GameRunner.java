package com.rawtechworld.learn.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    @Autowired
    private GameConsole game;

    public GameRunner(GameConsole gameObject) {
        this.game = gameObject;
    }

    public void runGame() {
        game.Up();
        game.Down();
        game.Left();
        game.Right();
    }

}
