/*Write a program to take "n" String inputs from user and store them in array (where "n" is no. of String objects specified by user at run-time). Sort the array in ascending order and display the array. If "n" entered by user is less than 2, then display message "Invalid".

Input Format

Your program should take the input of "n" string objects.

Constraints

No. of string objects entered by the user should be greater than 1.

Output Format

Your program should display the array of strings in sorted ascending order.

Sample Input 0

4
India
America
Australia
France
Sample Output 0

America
Australia
France
India
*/



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      String arr[]=new String[n];
      if(n<2){
        System.out.print("Invalid");
      }else{
        for(int i=0;i<n;i++){
          arr[i]=input.next();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
          System.out.println(arr[i]);
        }
      }
      
    }
}
