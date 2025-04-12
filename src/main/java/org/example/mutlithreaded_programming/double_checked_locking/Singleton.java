package org.example.mutlithreaded_programming.double_checked_locking;

public class Singleton {
    // Используем volatile для предотвращения проблем с кэшированием переменной в разных потоках
    private static volatile Singleton instance;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        // Первая проверка без синхронизации
        if (instance == null) {
            // Синхронизированный блок для безопасной инициализации
            synchronized (Singleton.class) {
                // Вторая проверка внутри синхронизированного блока
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}