package com.test.driven.development.calculator.step2;

public class Orders {

    private int[] orders;

    public Orders(String[] expressions) {
        boolean[] priorities = new boolean[expressions.length];
        for(int i = 1; i < expressions.length ; i+=2){
            priorities[i] = OperandEnum.find(expressions[i]).isPriority();
        }
    }


}
