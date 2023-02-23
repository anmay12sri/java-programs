/* taking input in array java program*/


import java.util.Scanner;
public class array {
    public static void main(String args[]){
        Scanner c=new Scanner(System.in);
        int n=c.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=c.nextInt();
            
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
