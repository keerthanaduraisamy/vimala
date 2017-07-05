import java.util.*;
import java.io.*;
public class Largest{
  
  public static void main(String args[])
  {
    
    Scanner sc=new Scanner(System.in);
    int a,b,c;
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    if((a>b)&&(a>c))
    System.out.println("is largest number is :"+a);
    else if(b>c )
    System.out.println("is largest number is :"+b);
    else
    System.out.println("is largest number is :"+c);
  } 
  }
  
