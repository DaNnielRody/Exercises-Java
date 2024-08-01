package Operators;

/*
FizzBuzz is a fun game played generally by school children.

If number is divisible by 3 -> Fizz
If number is divisible by 5 -> Buzz
If number is divisible by 3 and 5 both -> FizzBuzz
Else, you just need to append the number itself
 */

public class FizBuzz {

    public String fizz(int[] numbers){

        StringBuilder result = new StringBuilder();

        for (int num : numbers) {
            if (num % 5 == 0 && num % 3 == 0) {
                result.append("FizzBuzz");
            } else if (num % 3 == 0) {
                result.append("Fizz");
            } else if (num % 5 == 0) {
                result.append("Buzz");
            } else {
                result.append(num);
            }
            result.append(" ");
        }
        return result.toString().toLowerCase();
    }
}
