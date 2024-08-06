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
//"Madam, I'm Adam" is a palindrome because it is spelled the
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