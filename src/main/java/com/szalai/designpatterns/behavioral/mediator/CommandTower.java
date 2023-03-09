package com.szalai.designpatterns.behavioral.mediator;

public class CommandTower {

    private final Mediator messageMediator;
    private Integer limit = 100;

    public CommandTower(Mediator messageMediator) {
        this.messageMediator = messageMediator;
    }

    public void command() {
        messageMediator.onCommand();
    }

    public boolean decreaseLimit(Integer value){
        if (this.limit - value >= 0){
            this.limit -= value;
            return true;
        }
        return false;
    }

    public Integer getLimit() {
        return limit;
    }

    @Override
    public String toString() {
        return "CommandTower{" +
                "limit=" + limit +
                '}';
    }
}
