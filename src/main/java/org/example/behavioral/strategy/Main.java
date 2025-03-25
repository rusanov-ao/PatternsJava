package org.example.behavioral.strategy;

public class Main {
    public static void main(String[] args) {

        Content content = new Content(new DownloadLinuxStrategy());

        content.download("file.txt");
    }
}
