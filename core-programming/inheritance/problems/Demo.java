abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Polymorphic method
    public abstract void makeSound();

    // Common utility
    public String info() {
        return name + " (" + age + " yrs)";
    }
}

// Dog.java
class Dog extends Animal {
    public Dog(String name, int age) { super(name, age); }

    @Override
    public void makeSound() {
        System.out.println(info() + ": Woof!");
    }

    public void fetch() {
        System.out.println(name + " fetches the ball.");
    }
}

// Cat.java
class Cat extends Animal {
    public Cat(String name, int age) { super(name, age); }

    @Override
    public void makeSound() {
        System.out.println(info() + ": Meow!");
    }

    public void scratch() {
        System.out.println(name + " scratches the post.");
    }
}

// Bird.java
class Bird extends Animal {
    public Bird(String name, int age) { super(name, age); }

    @Override
    public void makeSound() {
        System.out.println(info() + ": Chirp!");
    }

    public void fly() {
        System.out.println(name + " flies across the yard.");
    }
}

// Demo.java
public class Demo {
    public static void main(String[] args) {
        Animal a1 = new Dog("Bruno", 3);
        Animal a2 = new Cat("Misty", 2);
        Animal a3 = new Bird("Rio", 1);

        // Polymorphism: same method call, different behavior
        Animal[] zoo = { a1, a2, a3 };
        for (Animal a : zoo) a.makeSound();

        // Subclass-specific behavior (downcasting when needed)
        ((Dog) a1).fetch();
        ((Cat) a2).scratch();
        ((Bird) a3).fly();
    }
}
