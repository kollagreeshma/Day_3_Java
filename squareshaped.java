import java.util.*;
public class squareshaped{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int k=x%10;
        int n=x/10;
        System.out.println("The maximum of square are \n"+(n/k)*(n/k)); 
    }
}