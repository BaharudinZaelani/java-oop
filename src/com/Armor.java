package com;

public class Armor{
    private String name;
    private double defense;

    Armor(String name, int defense){
        this.name = name;
        this.defense = defense;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setDefense(double defense){
        this.defense = defense;
    }

    public double getDefense(){
        return this.defense;
    }

    void display(){
        System.out.println("Armor \t: " + this.name + "("+ this.defense +")");

    }
}
