//Question # 1

// Factorial of a number

// Write a function that takes a number as its parameter.
// The function is to return the factorial of that number given
// by user?

//public class Main {
//
//    public static int fact (int num){
//        if (num == 0 || num ==1)
//            return num;
//        int prevfact = fact(num-1);
//        return num*prevfact;
//    }
//    public static void main(String[] args) {
//        System.out.println("The factorial of 5 is : ");
//        System.out.println(fact(5));
//    }
//}

// Question 2

//A palindrome is a sequence of characters or numbers that
//looks the same forwards and backwards. For example,
//"Madam, I'nonZeroProd Adam" is a palindrome because it is spelled the
//same reading it from front to back as from back to front.
//The number 12321 is a numerical palindrome. Write a function
//that takes a string and its length as arguments and
//recursively determines whether the string is a palindrome:
//int ispalindrome(string s, int len).?



//public class Main {
//
//    public static int checkPalin (String s , int lenght){
//        if (lenght <= 1){
//            return 1;
//        }
//        if (s.charAt(0) == s.charAt(lenght-1)){
//            return checkPalin(s.substring(1, lenght - 1), lenght -2);
//        } else {
//            return 0;
//        }
//
//    }
//    public static void main(String[] args) {
//
//        String s = "MADAM";
//        int result = checkPalin(s , s.length());
//        if (result==1){
//            System.out.println("It is palindrome.");
//        } else {
//            System.out.println("Not a palindrome.");
//        }
//
//    }
//}

// Question 3

//Write a recursive function int count_digit(int n, int digit); to count the number
//of digits in a number n (n > 0) that are equal to a specified digit. For example,
//if the digit we're searching for were 2 and the number we're searching were 220,
//the answer would be 2?

//public class Main {
//
//    public static int countDigit (int n , int digit){
//        if (n==0)
//            return 0;
//
//        int lastdigit = n%10;
//        if (lastdigit==digit){
//            return 1+countDigit(n/10 , digit);
//        } else {
//            return countDigit(n/10 , digit);
//        }
//
//    }
//
//    public static void main(String[] args) {
//        int number = 550;
//        int digit = 5;
//        int count = countDigit(number,digit);
//        System.out.println("The number is : " + number);
//        System.out.println("The digit to find : " + digit);
//        System.out.println("The number of digits in that number : " + count);
//
//    }
//}

// Question 4

//We have n people in a room, where n is an integer greater than or equal to 1.
//Each person shakes hands once with every other person. What is the total number, h(n) ,
//of handshakes? Write a recursive function to solve this problem.
//
//To get you started, if there are only one or two people in the room,
//then handshake(1) = 0
//
//handshake(2) = 1
//
//If a third person enters the room, he or she must shake hands with each of
//the two people already there. This is two handshakes in addition to the number
//of handshakes that would be made in a room of two people, or a total of three
//handshakes. If a fourth person enters the room, this is three handshakes in
//addition to the number of handshakes that would be made in a room of three
//people handshakes. If you can generalize this to n handshakes, you should be able
//to write the recursive solution.

//public class Main {
//    public static int handshake (int n){
//        if (n==1){
//            return 0;
//        } else {
//            return 1 + handshake(n-1);
//        }
//    }
//    public static void main(String[] args) {
//
//        int n = 4;
//        int hand = handshake(n);
//        System.out.println("The number of persons : " + n + " persons.");
//        System.out.println("The number of handshakes : " + hand + " handshakes.");
//
//    }
//}

//Question # 5

//The greatest common divisor of integers x and y is the largest integer that evenly
//divides both x and y.Write a recursive function GCD that returns the greatest common
//divisor of x and y?

//public class Main {
//    public static int GCD (int x , int y){
//        if (y==0){
//            return x;
//        }
//        return GCD(y ,x%y);
//    }
//    public static void main(String[] args) {
//        int x = 5;
//        int y = 15;
//        int gcd = GCD(x,y);
//        System.out.println("X : " + x);
//        System.out.println("Y : " + y);
//        System.out.println("GCD : " + gcd);
//
//    }
//}

// Question 6

//Write a recursive function power (base, exponent) that when invoked returns
//base exponent. For example,power (3, 4) = 3 * 3 * 3 * 3. Assume that exponent
//is an integer greater than or equal to 1?

//public class Main {
//
//    public static int power (int base , int exp){
//        if (exp == 0){
//            return 1;
//        } else {
//            return base *power(base , exp -1);
//        }
//    }
//    public static void main(String[] args) {
//        int b = 4;
//        int e = 3;
//        int p = power(b,e);
//        System.out.println("Base : " + b);
//        System.out.println("Power : " + e);
//        System.out.println("Result : " + p);
//    }
//}

// Question 7

//Write the reverse() function recursively. This function takes a string and the
//length of the string as arguments and returns the same string with its characters
//in the reverse order?

//public class Main {
//    public static String reverse(String str){
//        if (str.isEmpty()){
//            return str;
//        }
//
//        return reverse(str.substring(1)) + str.charAt(0);
//    }
//    public static void main(String[] args) {
//        String s = "Ahmad";
//        String rev = reverse(s);
//        System.out.println("Normal String : " + s);
//        System.out.println("Reversed String : " + rev);
//
//    }
//}

// Question 8

//You are given a positive integer p. Consider an array nums (1-indexed) that consists
//of the integers in the inclusive  range

//public class Main {
//    private static final long MOD = 1_000_000_007;
//
//    public static int nonZeroProd(int p) {
//        if (p == 1) {
//            return 1;
//        }
//        long maxValue = (1L << p) - 2;
//        long count = (1L << (p - 1)) - 1;
//        long maxProduct = powMod(maxValue, count, MOD);
//
//        long result = (maxProduct * ((maxValue + 1) % MOD)) % MOD;
//        return (int) result;
//    }
//
//    private static long powMod(long base, long exp, long mod) {
//        long result = 1;
//        while (exp > 0) {
//            if ((exp & 1) == 1) {
//                result = (result * base) % mod;
//            }
//            base = (base * base) % mod;
//            exp >>= 1;
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(nonZeroProd(1));
//        System.out.println(nonZeroProd(2));
//        System.out.println(nonZeroProd(3));
//        System.out.println(nonZeroProd(4));
//    }
//}
