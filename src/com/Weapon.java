package com;

class Weapon{
    private String name;
    double attackPower;

    Weapon(String name, double attack){
        this.name = name;
        this.attackPower = attack;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAttackPower(double power){
        this.attackPower = power;
    }

    public double getAttackPower(){
        return this.attackPower;
    }

    void display(){
        System.out.println("Weapon \t: " + this.name + "("+ this.attackPower +")");
    }
}

