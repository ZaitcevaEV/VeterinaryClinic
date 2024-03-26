package Clients.impl;

import java.time.LocalDate;

import Clients.Animal;
import Clients.Owner;
import Clients.action.Goable;

public class Cat extends Animal implements Goable{
    public Cat(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Cat() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест!");
    }

    @Override
    public double run() {
        return 15;
    }

}
