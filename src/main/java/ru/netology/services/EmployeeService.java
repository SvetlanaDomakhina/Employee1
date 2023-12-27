package ru.netology.services;

public class EmployeeService {
    public int calculate(int income, int expense, int threshold) {
        int count = 0;
        int money = 0;
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                money = (money - expense) / 3;
                count++;
            } else {
                money = money + income - expense;
            }
        }
        return count;
    }
}
