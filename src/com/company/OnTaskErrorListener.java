package com.company;

@FunctionalInterface
public interface OnTaskErrorListener {
    boolean isFailed(int result);
}
