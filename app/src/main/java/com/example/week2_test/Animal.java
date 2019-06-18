package com.example.week2_test;

public abstract class Animal {

    public int getEnergy() {
        return energy;
    }

    private int energy = 10;
    private String name;


    void makeSound(){
        energy -= 3;
    }

    void eatFood(String type){
        energy += 5;
    }

    void sleep(){
        energy += 10;
    }

    void play(){
        energy -= 8;
    }

    void soundOff(){
        this.makeSound();
        System.out.println(this.energy);
    }
}
