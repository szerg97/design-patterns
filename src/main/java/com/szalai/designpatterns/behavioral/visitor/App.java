package com.szalai.designpatterns.behavioral.visitor;

import java.util.UUID;

public class App {
    public static void main(String[] args) {
        Visitor visitor = new ElementVisitor();

        Element e1 = new JsonElement(UUID.randomUUID());
        Element e2 = new XmlElement(UUID.randomUUID());

        e1.accept(visitor);
        e2.accept(visitor);
    }
}
