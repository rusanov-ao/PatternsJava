package org.example.behavioral.strategy;

public class DownloadWindowsStrategy implements Strategy {

    @Override
    public void download(String file) {
        System.out.println("Windows download " + file);
    }
}
