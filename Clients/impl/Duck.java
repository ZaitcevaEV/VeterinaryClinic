package Clients.impl;

import java.time.LocalDate;

import Clients.Animal;
import Clients.Owner;
import Clients.action.Flyable;
import Clients.action.Goable;
import Clients.action.Swimable;

public class Duck extends Animal implements Flyable, Swimable, Goable {
        public Duck(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Duck() {
        super();
    }
    @Override
    public void eat() {
        System.out.println("Утка клюет!");
    }

    @Override
    public double fly() {
        return 2;
    }

    @Override
    public double swim() {
        return 2;
    }

    @Override
    public double run() {
        return 2;
    }
}
