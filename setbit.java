import java.util.*;
public class setbit{
public static void main(String args[])
{
int a=12;
int pos=1;
if((a&(1<<pos))!=0){
    System.out.println("Set Bit");
}
else{
    System.out.println("Not a set Bit");
}
}
}