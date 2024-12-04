import java.util.*;
public class pow{
public static void main(String args[])
{
int a=64;
if((a&(a-1))==0){
    System.out.println("Yes it is power of 2");
}
else{
    System.out.println("No it is not a power of 2");
}
}
}