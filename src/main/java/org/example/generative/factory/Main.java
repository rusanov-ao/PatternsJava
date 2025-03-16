package org.example.generative.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        Factory factory = new Factory();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        /**
         * Забираем у пользователя значение
         */
        String getOS = bufferedReader.readLine();

        /**
         * Подставляем значение в Фабрику и она нам возвращает объект.
         * Например, если в терминале мы напишем linux, то переменная os
         * будет содержать экземпляр класса LinuxOS
         */
        OS os = factory.getCurrentOS(getOS);
        os.getOS();
    }
}