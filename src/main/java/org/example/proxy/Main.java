package org.example.proxy;

public class Main {

    public static void main(String[] args) {

        Image image = new ProxyImage("test.png");
        image.display();
        image.display();
    }
}
