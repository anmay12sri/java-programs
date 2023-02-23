/*linear search in array*/



import java.util.Scanner;
public class linearsearch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();//input
        }
        int x=sc.nextInt();
        for(int i=0;i<n;i++){
            if(x==arr[i]){
                System.out.print("so we got the element at index: "+i );
            }
        }
    }
}
