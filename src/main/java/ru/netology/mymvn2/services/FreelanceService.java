package ru.netology.mymvn2.services;

public class FreelanceService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0;   // количество месяцев отдыха
        int money = 0;   // деньги на счету

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money -= expenses;
                money /= 3;
            } else {
                money += income;
                money -= expenses;
            }
        }

        return count;
    }
}