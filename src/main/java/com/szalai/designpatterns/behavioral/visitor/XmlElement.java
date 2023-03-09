package com.szalai.designpatterns.behavioral.visitor;

import java.util.UUID;

public class XmlElement extends Element{

    public XmlElement(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
