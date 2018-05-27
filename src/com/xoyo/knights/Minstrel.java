package com.xoyo.knights;

import java.io.PrintStream;

public class Minstrel {

    private PrintStream stream;

    public Minstrel() {
        this.stream = System.out;
    }

    public Minstrel(PrintStream str通知eam) {
        this.stream = stream;
    }

    public void singBeforeQuest() {
        stream.println("Fa la la, the knight is so brave!");
    }

    public void singAfterQuest() {
        stream.println("Tee hee hee, the brave knight " +
            "did embark on a quest!");
    }
}
