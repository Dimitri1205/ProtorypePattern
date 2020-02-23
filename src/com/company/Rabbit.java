package com.company;

public class Rabbit implements Cloneable {

    public enum Breed {
        WHITE, BROWN, MINI, DUCH, MAGIC
    }

    private int ageInMonts;
    private Breed breed;
    private Person owner;

    public Rabbit() {}

    public Person getOwner() {
        return owner;
    }

    public void setOwner(String name) {
        this.owner = new Person(name);
    }

    public void setAgeInMonts (int age) {
        this.ageInMonts = age;
    }

    public int getAgeInMonts() {
        return ageInMonts;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public Breed getBreed() {
        return breed;
    }

//    @Override
//    protected Rabbit clone()  {
//
//        try {
//            Rabbit rabbit = (Rabbit) super.clone();
//            return rabbit;
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }
//    }

    @Override
    protected Rabbit clone()  {

        try {
            Rabbit rabbit = (Rabbit) super.clone();
            rabbit.owner = owner.clone();
            return rabbit;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
