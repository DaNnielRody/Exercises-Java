package Operators;

/*
In this exercise, you'll be implementing rules for calculating the total salary of an employee in a month.
The International Siderurgy Company (ISC) requires assistance in calculating employee salaries, considering various factors
that can impact the final wage.

You have three tasks, and you should use the ternary operator instead of if/else statements to implement them.
 */

public class SalaryCalculator {

    private final double MIN_SALARY = 1000;
    private final double MAX_SALARY = 2000;

    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5 ? 0.85 : 1;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = bonusForProductsSold(productsSold) + (MIN_SALARY * salaryMultiplier(daysSkipped));

        /*
        Isto:
        return salary >= MAX_SALARY ? MAX_SALARY : salary;
        */

        // É a mesma coisa disso. Ele vefifica se o valor corresponde ao máximo valor (max_salary), se não, é o valor do salário.
        return Math.min(salary, MAX_SALARY);

    }
}
