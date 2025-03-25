package org.example.behavioral.strategy;

public class DownloadLinuxStrategy implements Strategy {

    @Override
    public void download(String file) {
        System.out.println("Linux donwload " + file);
    }
}
