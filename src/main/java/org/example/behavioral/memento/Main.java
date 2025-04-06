package org.example.behavioral.memento;

public class Main {
    public static void main(String[] args) {

        User user = new User("Alice", 30);

        Caretaker caretaker = new Caretaker();

        // Сохраняем состояние пользователя
        caretaker.addMemento(user.save());

        // Изменяем состояние пользователя
        user.restore(new Memento("Bob", 25));

        // Восстанавливаем предыдущее состояние пользователя
        user.restore(caretaker.getMemento(0));


        // Выводим текущее состояние пользователя
        System.out.println("Current state: Name = " + user.getName() + ", Age = " + user.getAge());


    }
}
