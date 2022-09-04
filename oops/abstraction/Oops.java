package oops.abstraction;

abstract class Animal {
    abstract void walk();

    public void eat() {
        System.out.println("Animal eats");
    }
}

class Horse extends Animal {
    public void walk() {
        System.out.println("walks on four legs");

    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("walks on two legs");
    }
}

public class Oops {
    public static void main(String args[]) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
    }
}