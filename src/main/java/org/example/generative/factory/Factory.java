package org.example.generative.factory;

public class Factory {

    /**
     * Создаем метод getCurrentOS, который в зависимости от входящего параметра
     * будет возвращать определенные объект.
     * При запуске программы мы еще не знаем, какой объект у нас будет создан.
     *
     * @param inputOS
     */
    public OS getCurrentOS(String inputOS) {
        OS os = null;
        if (inputOS.equals("linux")) {
            os = new LinuxOS();
        } else if (inputOS.equals("windows")) {
            os = new WindowsOS();
        } else if (inputOS.equals("mac")) {
            os = new MacOS();
        }

        return os;
    }
}