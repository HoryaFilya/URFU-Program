package lr2;

public class Task8 {

    public static void main(String[] args) {
        Dog dog = new Dog("Vanessa", 3, "mops", "milk");
        dog.sound();
        System.out.println("The dog is name %s".formatted(dog.getName()));

        Cat cat = new Cat("Barsik", 2, "siam", "fish");
        cat.sound();
        System.out.println("The cat is age %s".formatted(cat.getAge()));

        Bird bird = new Bird("Kesha", 5, "aist", "water");
        bird.sound();
        System.out.println("The bird is breed %s".formatted(bird.getBreed()));
    }
}

abstract class Animal {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sound() {
        System.out.println("Animal издает звук");
    }
}

class Dog extends Animal {
    private String breed;
    private String typeFeed;

    public Dog(String name, int age, String breed, String typeFeed) {
        this.setName(name);
        this.setAge(2);
        this.breed = breed;
        this.typeFeed = typeFeed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getTypeFeed() {
        return typeFeed;
    }

    public void setTypeFeed(String typeFeed) {
        this.typeFeed = typeFeed;
    }

    @Override
    public void sound() {
        System.out.println("Dog издает звук");
    }
}

class Cat extends Animal {
    private String breed;
    private String typeFeed;

    public Cat(String name, int age, String breed, String typeFeed) {
        this.setName(name);
        this.setAge(2);
        this.breed = breed;
        this.typeFeed = typeFeed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getTypeFeed() {
        return typeFeed;
    }

    public void setTypeFeed(String typeFeed) {
        this.typeFeed = typeFeed;
    }

    @Override
    public void sound() {
        System.out.println("Cat издает звук");
    }
}

class Bird extends Animal {
    private String breed;
    private String typeFeed;

    public Bird(String name, int age, String breed, String typeFeed) {
        this.setName(name);
        this.setAge(2);
        this.breed = breed;
        this.typeFeed = typeFeed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getTypeFeed() {
        return typeFeed;
    }

    public void setTypeFeed(String typeFeed) {
        this.typeFeed = typeFeed;
    }

    @Override
    public void sound() {
        System.out.println("Bird издает звук");
    }
}