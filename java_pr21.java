/* for the pyramid pattern */


public class pyramid {
    public static void main(String args[]){
        int i,j,k;

        for( i=1;i<=5;i++){
            for(j=5;j>i;j--){   //5>1 so will manage 4 space around till j=1
                System.out.print(" ");//will manage space like in 1st row only one star in center
            }
            for(k=1;k<=i;k++){
                System.out.print("* ");//1=1 so one star in first row
            }
             System.out.println(" ");
        }
    }
}
