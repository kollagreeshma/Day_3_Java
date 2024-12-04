import java.util.*;
public class power4{
public static void main(String args[])
{
int n=64;
if((n&(n-2))==0){
    System.out.println("Yes it is power of 4");
}
else{
    System.out.println("No it is not a power of 4");
}
}
}