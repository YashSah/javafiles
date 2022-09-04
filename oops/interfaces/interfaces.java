package oops.interfaces;

interface Animal {
    public void walk();
}

class Horse implements Animal {
    public void walk() {
        System.out.println("walks on four legs");
    }
}

public class interfaces {
    public static void main(String args[]) {
        Horse horse = new Horse();
        horse.walk();
    }

}
