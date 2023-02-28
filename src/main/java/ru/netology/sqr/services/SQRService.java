package ru.netology.sqr.services;

public class SQRService {
    public int calcSQR(int low, int high) {
        int k = 0;
        for (int i = 10; i <= 99; i++) {

            if (Math.pow(i, 2) <= high & Math.pow(i, 2) >= low) {
                k++;
            } else {
                continue;
            }
        }
        return k;
    }
}
