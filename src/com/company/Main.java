package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 2: Работяга");

        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = x -> (x == 33);

        Worker worker = new Worker(listener, errorListener);
        worker.start();
    }
}
