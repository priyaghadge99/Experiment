//Q2.	Accept string and check if it is palindrome or not eg(nitin)
public class StringPalindrome {
    public static void main(String[] args) {
        String s = "NITIN";
        String reverseString = "";
        char[] array = s.toString().toCharArray();
        char[] array2= new char[array.length];
        for (int i= array2.length-1;i>-1;i--){  //exception if we write arr.length  it should be arr.length -1
            reverseString+= array2[i];   // Append each character to the reversedstring.
        }
        if(s==reverseString){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }


    }
}
// String for palindrome using arrays in java
/*
Convert the given string into a character array using the toCharArray() method.
        Make a copy of this array.
        Reverse the array.
        Compare the original array and the reversed array.
        in case of match given string is a palindrome.*/
