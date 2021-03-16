package com.thoughtworks.capability.demospringioccontainer;

public class GreetingService {

    public GreetingService() {
        System.out.println("GreetingService is created");
    }
    String sayHi() {
        return "hello world";
    }
}
