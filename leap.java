import java.util.*;
import java.io.*;
public class Leap{
  
  public static void main(String args[])
  {
    
    Scanner sc=new Scanner(System.in);
    int year;
    year=sc.nextInt();
    if(year%400==0 || year%4==0)
    System.out.println(year+"is leap year");
    else
    System.out.println(year+"is not leap year");
    }
    }
