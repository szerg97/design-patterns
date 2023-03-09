package com.szalai.designpatterns.behavioral.visitor;

import java.util.UUID;

public abstract class Element {

    protected UUID uuid;
    protected String content;

    public abstract void accept(Visitor visitor);

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
