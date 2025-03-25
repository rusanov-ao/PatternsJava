package org.example.behavioral.observer;

import java.util.List;

// Интерфейс наблюдателя
interface Observer {
    // Не реализованный метод оповещения
    void event(List<String> list);
}
