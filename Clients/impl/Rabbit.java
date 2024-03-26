package Clients.impl;

import java.time.LocalDate;

import Clients.Animal;
import Clients.Owner;
import Clients.action.Goable;

public class Rabbit extends Animal implements Goable{
        public Rabbit(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Rabbit() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Кролик грызет!");
    }

    @Override
    public double run() {
        return 15;
    }
}
