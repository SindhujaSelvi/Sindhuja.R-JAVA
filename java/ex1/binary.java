import java.util.*;
class binary
{
public static void main(String args[])
{   int remainder[]= new int[10];
    int remain;
    System.out.println("enter the decimal number");
    Scanner sc= new Scanner(System.in);
    int decimalnumber= sc.nextInt();
    for(int i=0; decimalnumber!=0; i++)
    {
    int a = decimalnumber % 2;
    remainder[i]= a;
    decimalnumber = decimalnumber / 2;
    /*if(remain==0)
    remain = remain + 0;
    else
    remain = remain + 1;*/
    //decimalnumber = remain; 
    
    //for (int j=i; j>=0; j--)
    System.out.println(remainder[i]);
    }
}
}