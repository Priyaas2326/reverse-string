import java.util.*;
public class Main{  
public static void main(String[] args){  
Scanner sc=new Scanner(System.in); 
String str = sc.nextLine();  // for taking input of string 

// reverse a String
// Declaring a StringBuilder and converting string to StringBuilder

       StringBuilder reverseString = new StringBuilder(str);


       reverseString.reverse();  // Reversing the StringBuilder
       // Converting StringBuilder to String

       String result = reverseString.toString();
       System.out.println(result); // Printing the reversed String

}
}






