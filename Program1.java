import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the count of numbers: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        Numbers numberUtil = new Numbers();
        int evenSum = numberUtil.sumEvenElements(numbers);
        System.out.println("Summation of even elements: " + evenSum);

        int oddSum = numberUtil.sumOddElements(numbers);
        System.out.println("Summation of odd elements: " + oddSum);

        int difference = evenSum - oddSum;
        System.out.println("Difference between the summation of even and odd elements: " + difference);
    }
}

class Numbers {
    public int sumEvenElements(int[] numbers) {
        int sum = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        return sum;
    }

    public int sumOddElements(int[] numbers) {
        int sum = 0;

        for (int num : numbers) {
            if (num % 2 != 0) {
                sum += num;
            }
        }

        return sum;
    }
}
