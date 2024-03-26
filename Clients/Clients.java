package Clients;

import java.time.LocalDate;

import Personal.impl.Doctor;
import Personal.impl.Nurse;

public class Clients {
    public int number;
    public LocalDate dateOfReceipt;
    public Animal animal;
    public Doctor doctor;
    public Nurse nurse;
    public String diagnos;
    public String recipe;

    public Clients(int number, LocalDate dateOfReceipt, Animal animal, Doctor doctor, Nurse nurse, String diagnos, String recipe) {
        this.number = number;
        this.dateOfReceipt = dateOfReceipt;
        this.animal = animal;
        this.doctor = doctor;
        this.nurse = nurse;
        this.diagnos = diagnos;
        this.recipe = recipe;
    }

    @Override
    public String toString() {
        return String.format("№ %s, дата поступления: %s, животное: %s, лечащий врач: %s, диагноз: %s, назначено лечение: %s", number, dateOfReceipt, animal, doctor, diagnos, recipe);
    }
}
