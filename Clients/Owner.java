package Clients;

public class Owner {
    public String name;
    public Owner(String name) {
        this.name = name;
    }

    public Owner() {
        this.name = null;
    }

    @Override
    public String toString() {
        return name;
    }
}
