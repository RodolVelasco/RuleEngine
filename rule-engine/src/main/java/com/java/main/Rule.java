package com.java.main;
import com.java.main.Result;

public interface Rule {

    boolean evaluate(Expression expression);

    Result getResult();
}