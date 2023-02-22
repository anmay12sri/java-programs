/*Jhon visited fun zone area in Elante mall. He decided to play a game which consist with some green and red color balls. He got a task to add green and red balls,then after on screen he needs to enter final sum of total number of green and red balls.

Input Format

In First line, enter total number of green color balls. In Second line, enter total number of red color balls.

Constraints

Enter only interger value.

Output Format

Display the sum of green and red color balls.

Sample Input 0

10
10
Sample Output 0

20*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      
      Scanner input= new Scanner(System.in);
      int red = input.nextInt();
      
      int green = input.nextInt();
      
      System.out.println( red+green);
    }
}
