package com.rawtechworld.learn.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements  GameConsole{
    public void Up() {
        System.out.println("Mario Up");
    }

    public void Down() {
        System.out.println("Mario Down");
    }

    public void Left() {
        System.out.println("Mario Left");
    }

    public void Right() {
        System.out.println("Mario Right");
    }

}
