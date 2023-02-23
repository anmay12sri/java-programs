/*to find out the maximimum element in array*/



import java.util.Scanner;
public class max_array {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<n;i++){//23 55 66 11
            if(max<arr[i]){
                max=arr[i];
                System.out.print("maximum element in array is: "+ max);
            }
        }
    }
}
