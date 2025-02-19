package org.example.singleton;

class Singleton {

    private static Singleton instance = null;

    /**
     * Делаем конструктор приватным, чтобы никто не мог создать объект
     */
    private Singleton() {
    }

    /**
     * Создаем метод, который будет проверять, был ли создан наш объект.
     * Если был, то вернем объект, если не был создан, то создадим.
     * Так мы будем уверены что во время работы программы у нас будет создан только один объект
     * данного класса
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void setUp() {
        System.out.println("setUp");
    }
}