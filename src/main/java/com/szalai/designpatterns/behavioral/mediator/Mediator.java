package com.szalai.designpatterns.behavioral.mediator;

public interface Mediator {
    void registerCommandTower(CommandTower commandTower);
    void registerGroundTroops(GroundTroops groundTroops);
    void onCommand();
    void onAct();
}
