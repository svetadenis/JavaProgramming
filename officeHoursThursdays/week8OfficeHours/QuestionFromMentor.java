package week8OfficeHours;

public class QuestionFromMentor {
    public static void main(String[] args) {

int startRange1 = 1;
int endRange1 = 10;
int startRange2 = 16;
int maxEvenSum = 20;

int evenSum = 0;
int oddSum = 0;

// Iterate through the first range (1-10)
for (int i = startRange1; i <= endRange1; i++) {
    if (i % 2 == 0) {
        evenSum += i;

        // Check if the sum of even numbers reaches the specified value
        if (evenSum >= maxEvenSum) {
            System.out.println("Sum of even numbers reached " + maxEvenSum + ". Exiting loop.");
            break;
        }
    } else {
        // Skip odd numbers in the first range
        continue;
    }
}

// Iterate through the second range (16-?)
for (int i = startRange2; ; i++) {
    if (i % 2 == 0) {
        evenSum += i;

        // Check if the sum of even numbers reaches the specified value
        if (evenSum >= maxEvenSum) {
            System.out.println("Sum of even numbers reached " + maxEvenSum + ". Exiting loop.");
            break;
        }
    } else {
        oddSum += i;
    }
}

System.out.println("Sum of even numbers: " + evenSum);
System.out.println("Sum of odd numbers: " + oddSum);
    }
}

/*
 Write a Java program that calculates the sum of even and odd numbers separately within a given range (inclusive).
 Use a loop to iterate through the numbers in the range.
 If the number is even, add it to the even sum; if it's odd, add it to the odd sum.
 The range is 1-10 and 16-?(read the next criteria) (hint: you may need to use continue statement here)
 Use the break statement to exit the loop when the sum of even numbers reaches a certain value (e.g., 20).
 */