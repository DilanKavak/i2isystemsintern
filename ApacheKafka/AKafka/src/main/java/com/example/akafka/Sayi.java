package com.example.akafka;

public class Sayi {
    private int operand;
    private  String operation;

    public Sayi(int operand, String operation) {
        this.operand = operand;
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "Sayi{" +
                "operand=" + operand +
                ", operation='" + operation + '\'' +
                '}';
    }

    public int getOperand() {
        return operand;
    }

    public void setOperand(int operand) {
        this.operand = operand;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Sayi() {
    }
}