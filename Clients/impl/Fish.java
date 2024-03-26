package Clients.impl;

import java.time.LocalDate;

import Clients.Animal;
import Clients.Owner;
import Clients.action.Swimable;

public class Fish extends Animal implements Swimable{
        public Fish(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Fish() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Рыба засасывает еду!");
    }

    @Override
    public double swim() {
        return 4;
    }
}
