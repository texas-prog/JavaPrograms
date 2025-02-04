class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("This bird can fly.");
    }
}

class Parrot extends Bird {
    void speak() {
        System.out.println("This parrot can speak.");
    }
}

class AnimalHierarchy {
    public static void main(String[] args) {
        Parrot p = new Parrot();
        p.eat();
        p.fly();
        p.speak();
    }
}