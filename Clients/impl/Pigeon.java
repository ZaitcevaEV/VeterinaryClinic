package Clients.impl;

import java.time.LocalDate;

import Clients.Animal;
import Clients.Owner;
import Clients.action.Flyable;
import Clients.action.Goable;
import Clients.action.Swimable;

public class Pigeon extends Animal implements Flyable, Swimable, Goable{
        public Pigeon(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Pigeon() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Пингвин ест рыбу!");
    }

    @Override
    public double fly() {
        return 1;
    }

    @Override
    public double swim() {
        return 1;
    }

    @Override
    public double run() {
        return 4;
    }
}
