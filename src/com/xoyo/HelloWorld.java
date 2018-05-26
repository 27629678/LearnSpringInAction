package com.xoyo;

import com.xoyo.knights.DamselRescuingKnight;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("hello, world.");

        DamselRescuingKnight rescue = new DamselRescuingKnight();
        rescue.embarkOnQuest();
    }

    public String sayHello() {
        return "Hello, Bean.";
    }
}
