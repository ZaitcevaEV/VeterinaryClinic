package Clients.impl;

import java.time.LocalDate;

import Clients.Animal;
import Clients.Owner;
import Clients.action.Goable;

public class Lion extends Animal implements Goable{

    public Lion(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Lion() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Лев раздирает добычу!");
    }

    @Override
    public double run() {
        return 35;
    }

}
