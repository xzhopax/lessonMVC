package ru.lessonMVC;

public enum Sign {
    MULTIPLICATION("*"),ADDITION("+"),SUBTRACTION("-"),DIVISION("/");

    public String sign;

    Sign(String sign){
        this.sign = sign;
    }
}
