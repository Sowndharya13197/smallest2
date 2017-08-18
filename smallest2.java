import java.io.*;
import java.util.*;
public class smallest2 {
    public static void main(String args[])
    {
        int n;
        Scanner s=new Scanner(System.in);
       n=s.nextInt();
        ArrayList ts=new ArrayList();
       int a[]=new int[n];
      int b[]=new int[n];
      int min;
      min=a[0];
       for(int i=0;i<n;i++)
       {
           a[i]=s.nextInt();
           ts.add(a[i]);   
     }
      Collections.sort(ts);
  
    System.out.println(ts.get(1));
    
}}
