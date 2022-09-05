package com.rawtechworld.learn.game;

import org.springframework.stereotype.Component;

//@Component
public class PacManGame implements GameConsole {
    @Override
    public void Up() {
        System.out.println("Packman Up");
    }

    @Override
    public void Down() {
        System.out.println("Packman Down");
    }

    @Override
    public void Left() {
        System.out.println("Packman Left");
    }

    @Override
    public void Right() {
        System.out.println("Packman Right");
    }
}
