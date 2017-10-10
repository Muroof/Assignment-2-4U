/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranam3235
 */
public class Recursion {

    // QUESTION ONE
    public int digitalSum(int n) {
        // BASE CASE - if n is less than 10 return n
        if (n < 10) {
            return n;
        } else {
            // seperate the right number from the left
            // and add them together
            int right = n % 10;
            int left = n / 10;
            // keep doing this until you have a single digit number
            return digitalSum(left) + digitalSum(right);
        }
    }

    // QUESTION TWO
    public int digitalRoot(int n) {
        // base case
        // if n is less than 10 return n
        if (n < 10) {
            return n;
        } else {
            // int oldSum equals the digitalSum of n 
            int oldSum = digitalSum(n);
            // then return oldSum in digitalRoot to divide it
            // repeat this process until you have a single digit number
            return digitalRoot(oldSum);
        }

    }

    // QUESTION THREE 
    public int digitalTriangle(int n) {
        // base case
        if (n <= 1) {
            return n;
        } else {
            // previous row entered subtract one
            int previousRow = n - 1;
            // blocks = row + previous row
            int blocks = n + digitalTriangle(previousRow);
            // return blocks
            return blocks;
        }
    }

    // QUESTION FOUR
    public int hailstone(int n) {
        // print every n value 
        System.out.println(n);
        // base case
        // n = 1 return n
        if (n == 1) {
            return n;
        }

        // if the number is even divide by 2, print and return in hailstone
        if (n % 2 == 0) {
            n = n / 2;
            return hailstone(n);

            // otherwise (if the number is odd) multiply the number by 3 and add 1, print and return  
        } else {
            n = 3 * n + 1;
            return hailstone(n);
        }

    }

    // QUESTION FIVE
    public void binaryConvert(int n) {
        // BASE CASE
        if (n == 0) {
        } else {
            // divide the decimal by 2
            binaryConvert(n / 2);
            // if the remainder is zero
            if (n % 2 == 0) {
                // print zero
                System.out.print("0");
            } else {
                // otherwise print one, assuming the remainder is one
                System.out.print("1");
            }

        }

    }

    // QUESTION SIX
    public void convert(int n, int b) {
        // BASE CASE
        if (n == 0) {
        } else {
            // remainder is n mod b 
            int remainder = n % b;
            // n = n divide by b
            n = n / b;
            // run through method
            convert(n, b);
            // if remainder is single digit output the number
            if (remainder < 10) {
                System.out.print(remainder);
                // otherwise convert digit greater than 10 into a letter
            } else {
                // 10 = A
                if (remainder == 10) {
                    System.out.print("A");
                }
                // 11 = B
                if (remainder == 11) {
                    System.out.print("B");
                }
                // 12 = C
                if (remainder == 12) {
                    System.out.print("C");
                }
                // 13 = D
                if (remainder == 13) {
                    System.out.print("D");
                }
                // 14 = E
                if (remainder == 14) {
                    System.out.print("E");
                }
                // 15 = F
                if (remainder == 15) {
                    System.out.print("F");
                }
                // 16 = G
                if (remainder == 16) {
                    System.out.print("G");
                }

            }
        }
    }

    // QUESTION 7
    public boolean isPalindrome(String s, int length) {
        // if word entered isn't greater than one character, it is automatically a palindrome, therfore return true
        if (length == 0 || length == 1) {
            return true;
        } else {
            // if the first letter and the last letter of String s are equal
            if (s.charAt(0) == s.charAt(length - 1)) {
                // make a new substring removing those letters (first and last)
                String newWord = s.substring(1, length - 1);
                // subtract 2 from length in order to match the substring
                length = length - 2;
                // return the new substring in the method
                // continue to do this until length = 0 or 1
                return isPalindrome(newWord, length);

            }

        }
        // return false if a letter failed to match with another
        // NOT A PALINDROME
        return false;
    }

    public static void main(String[] args) {
        Recursion test = new Recursion();
        int hailstone = test.hailstone(12);
        System.out.println("");

    }
}
