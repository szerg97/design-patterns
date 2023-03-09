package com.szalai.designpatterns.behavioral.mediator;

public class App {

    public static void main(String[] args) {
        Mediator messageMediator = new MessageMediator();
        CommandTower commandTower = new CommandTower(messageMediator);
        GroundTroops groundTroops = new GroundTroops(messageMediator);

        messageMediator.registerCommandTower(commandTower);
        messageMediator.registerGroundTroops(groundTroops);

        // ground troops can only act when command happened before!
        commandTower.command();
        groundTroops.act();

        commandTower.command();
        groundTroops.act();
        groundTroops.act();

        commandTower.command();
        groundTroops.act();

        commandTower.command();
        groundTroops.act();

        commandTower.command();
        groundTroops.act();

        commandTower.command();
        groundTroops.act();
    }
}
