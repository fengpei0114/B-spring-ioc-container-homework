package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Bar {

    private Foo foo;

    @Autowired
    public void setFoo(Foo foo){
        this.foo = foo;
    }

    public void hi() {
        System.out.println("Hi, " + foo.name());
    }

    public String name() {
        return "Bar";
    }
}
