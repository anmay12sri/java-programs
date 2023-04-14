/*Cube and cuboid have a difference that in cube all the six faces are square while in cuboid all faces are rectangular. Write a program in which user will enter length, breath, and height and identify that wheather it is a cuboid or not. If user input is same for length, breath, and height then it will be cube and program should through InvalidCuboidException. Do the exception handling and print Invalid Cuboid.

Input Format

Three space seperated integers representing length, breath, and height.

Constraints

Maximum value can be 10.

Output Format

Valid Cuboid/ Invalid Cuboid/ Invalid Input

Sample Input 0

5 10 5
Sample Output 0

Valid Cuboid
Sample Input 1

5 7 12
Sample Output 1

Invalid Input
Sample Input 2

4 4 4
Sample Output 2

Invalid Cuboid*/







import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      if(a>10||a<0||b>10||b<0||c>10||c<0){
        System.out.print("Invalid Input");
      }
      else{
        if(a==b && b==c){
          System.out.print("Invalid Cuboid");
        }
        else {
          System.out.print("Valid Cuboid");
        }
      }
    }
}
