/*to find out the minimum element in array*/



import java.util.Scanner;
public class min_array {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();//input in array
        }
        int min=arr[0];
        for(int i=0;i<n;i++){//44 23 56
            if(min>arr[i]){
                min=arr[i];
                System.out.println("min element is: "+min);
            }
        }
    }
}
