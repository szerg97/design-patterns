package com.szalai.designpatterns.behavioral.visitor;

import java.util.UUID;

public class JsonElement extends Element{



    public JsonElement(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
