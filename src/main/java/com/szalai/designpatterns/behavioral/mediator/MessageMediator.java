package com.szalai.designpatterns.behavioral.mediator;

public class MessageMediator implements Mediator {

    private CommandTower commandTower;
    private GroundTroops groundTroops;
    private boolean hasCommanded = false;
    private int commandCounter = 0;
    private int actionCounter = 0;

    @Override
    public void registerCommandTower(CommandTower commandTower) {
        this.commandTower = commandTower;
        System.out.println(this.commandTower);
    }

    @Override
    public void registerGroundTroops(GroundTroops groundTroops) {
        this.groundTroops = groundTroops;
        System.out.println(this.groundTroops);
    }

    @Override
    public void onCommand() {
        boolean decreased = this.commandTower.decreaseLimit(10);
        if (decreased){
            this.hasCommanded = true;
            this.commandCounter++;
            System.out.printf("%nCommand arrived! (%s) Current limit: %s%n", this.commandCounter, this.commandTower.getLimit());
        }
        else{
            System.out.println("Limit reached! -> cannot command anymore!");
        }
    }

    @Override
    public void onAct() {
        if (!this.hasCommanded){
            System.out.println("Ground troops tried to take action but command has not arrived yet!");
        }
        else{
            boolean decreased = this.groundTroops.decreaseLimit(10);
            if (decreased){
                this.actionCounter++;
                System.out.printf("Action happened! (%s) Current limit: %s%n", this.actionCounter, this.groundTroops.getLimit());
                this.hasCommanded = false;
            }
            else{
                System.out.println("Limit reached! -> cannot act anymore!");
            }
        }
    }
}
