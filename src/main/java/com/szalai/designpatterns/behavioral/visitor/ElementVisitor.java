package com.szalai.designpatterns.behavioral.visitor;

public class ElementVisitor implements Visitor{

    @Override
    public void visit(XmlElement xmlElement) {
        xmlElement.setContent("<tag>hello world</tag>");
        System.out.printf("Processing XML element with id: %s%nContent: %s%n", xmlElement.uuid, xmlElement.content);
    }

    @Override
    public void visit(JsonElement jsonElement) {
        jsonElement.setContent("{\"name\":\"Some Body\",\"age\":28}");
        System.out.printf("Processing JSON element with id: %s%nContent: %s%n", jsonElement.uuid, jsonElement.content);
    }
}
