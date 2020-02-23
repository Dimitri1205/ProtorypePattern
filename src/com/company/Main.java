package com.company;

public class Main {

    public static void main(String[] args) {

        Rabbit rabbit = new Rabbit();
        rabbit.setAgeInMonts(8);
        rabbit.setOwner("Sally");
        Rabbit rabbitCopy = rabbit.clone();

        System.out.println("Rabbit one age: " + rabbit.getAgeInMonts() + " Rabbit owner: " + rabbit.getOwner().getName());
        System.out.println("Cloned Rabbit age: " + rabbitCopy.getAgeInMonts() + " Rabbit owner: " + rabbitCopy.getOwner().getName());
        rabbitCopy.setAgeInMonts(10);
        rabbitCopy.getOwner().setName("Steve");
        System.out.println("---------------");
        System.out.println("Rabbit one age: " + rabbit.getAgeInMonts() + " Rabbit owner: " + rabbit.getOwner().getName());
        System.out.println("Cloned Rabbit age: " + rabbitCopy.getAgeInMonts() + " Rabbit owner: " + rabbitCopy.getOwner().getName());



    }
}
