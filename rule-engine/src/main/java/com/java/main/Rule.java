package com.java.main;

public interface Rule {

    boolean evaluate(Expression expression);

    Result getResult();
}