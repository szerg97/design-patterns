package com.szalai.designpatterns.creational.factory;

public interface Factory <T>{

    T create(String type);
}
