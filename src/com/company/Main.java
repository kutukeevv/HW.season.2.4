package com.company;

public class Main {

    public static void main(String[] args) {

        Runner runner = new Runner("Runner 1", new Runner("Runner 2", new Runner("Runner 3",
                new Runner("Runner 4", new Runner("Runner 5")))));
        runner.start();
    }
}

