package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

@Component
public class Foo {

    private Bar bar;

    @Autowired
    public Foo(@Lazy Bar bar) {
        this.bar = bar;
    }

    public void hi() {
        System.out.println("Hi, " + bar.name());
    }

    public String name() {
        return "Foo";
    }
}
