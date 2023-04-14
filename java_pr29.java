
/*Jashu, Preeti, and Rita where playing a game, where they call each other randomly and they need to tell their middle character of their names. First Preeti called Jashu then Jashu called Rita then Rita called Jashu

Input Format

Jashu

Constraints

Declare name in the form of String
If the string name has odd no of character then print the middle character, if the string name has even no of character then print the middle two characters
Output Format

s

Sample Input 0

Jashu
Sample Output 0

s

*/




import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner sc=new Scanner(System.in);
      String name=sc.nextLine();
      int len=name.length();
       String midchar;
       int mid=len/2;
      if(len%2==0){
         // int mid=len/2;
        midchar=name.substring(mid-1,mid+1)   ;   
      }else{
         // int mid=len/2;
        midchar=name.substring(mid,mid+1);
      }
      System.out.print(midchar);
    }
}
