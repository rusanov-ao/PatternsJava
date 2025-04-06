package org.example.behavioral.memento;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("create: name = " + name + ", age = " + age);
    }

    public Memento save() {
        System.out.println("save: name = " + name + ", age = " + age);
        return new Memento(name, age);
    }

    public void restore(Memento memento) {
        name = memento.getName();
        age = memento.getAge();
        System.out.println("restore: name = " + name + ", age = " + age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
