/* to find out whether number is palindrome or not*/



import java.util.Scanner;
public class palindrome {
    public static void main(String args[]){
        int n,s=0,c,r;
        System.out.print("Enter any number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        c=n;//c is for storing n value as  n value will change in loop

        while(n>0){//taking example of 121  121>0 (true)  12>0  1>0
            r=n%10;//121 divides10 gives 1 as r  12%10 2 as r  1as r
            s=s*10+r; //s=1 12  120+1 again 121
            n=n/10;//here n will change to 12 again will check in while loop  12/10  1comes now  so we got a palindrome here as 0>0 false here
        }

        if(c==s){
            System.out.print("its a palindrome number");
        }else{
            System.out.print("not a palindrome number");
        }

    }
}
