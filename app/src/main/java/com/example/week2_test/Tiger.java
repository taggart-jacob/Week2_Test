package com.example.week2_test;

public class Tiger extends Animal {

    String name;
    int energy = 10;

    public void makeSound(){
        this.getEnergy();
        System.out.print("ROARRR!\n" + "Tiger has " + energy + " left.");
    }

    public void eatFood(String type){
        if (type=="grain"){
            System.out.println("Tiger can't eat grain, refuses to eat");

        } else {

        }
    }

}
