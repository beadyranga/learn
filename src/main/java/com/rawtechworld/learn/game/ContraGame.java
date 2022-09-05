package com.rawtechworld.learn.game;

import org.springframework.stereotype.Component;

//@Component
public class ContraGame implements GameConsole {
    public void Up() {
        System.out.println("Contra Up");
    }

    public void Down() {
        System.out.println("Contra Down");
    }

    public void Left() {
        System.out.println("Contra Left");
    }

    public void Right() {
        System.out.println("Contra Right");
    }

}
