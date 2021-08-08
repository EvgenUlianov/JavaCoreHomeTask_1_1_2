package com.company;

import javax.swing.*;

public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorListener;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorListener) {
        this.callback = callback;
        this.errorListener = errorListener;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (errorListener.isFailed(i))
                callback.onDone("Task " + i + " is failed");
            else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}
