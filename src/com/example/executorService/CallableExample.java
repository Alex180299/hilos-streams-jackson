package com.example.executorService;

import java.util.concurrent.Callable;

public class CallableExample implements Callable<Integer> {

    private Integer num;

    public CallableExample(Integer num){
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        Integer result = num * num;
        Thread.sleep(1000);
        return result;
    }
}
