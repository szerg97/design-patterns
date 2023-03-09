package com.szalai.designpatterns.behavioral.mediator;

public class GroundTroops {
    private final Mediator messageMediator;
    private Integer limit = 50;

    public GroundTroops(Mediator messageMediator) {
        this.messageMediator = messageMediator;
    }

    public void act() {
        messageMediator.onAct();
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
        return "GroundTroops{" +
                "limit=" + limit +
                '}';
    }
}
