import java.io.*;
import java.util.*;
  public class NumberName{
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number:");
        int a=sc.nextInt();
        if(a==1){
        System.out.println("ONE");
        }
        else if(a==2){
        System.out.println("TWO");
        }
        else if(a==3){
        System.out.println("THREE");
        }
        else if(a==4){
        System.out.println("FOUR");
        }
        else if(a==5){
        System.out.println("FIVE");
        }
        else if(a==6){
        System.out.println("SIX");
        }
        else if(a==7){
        System.out.println("SEVEN");
        }
        else if(a==8){
        System.out.println("EIGHT");
        }
        else if(a==9){
        System.out.println("NINE");
        }
        else if(a==0){
        System.out.println("ZERO");
        }
        else
        {
        System.out.println("INVALID");
        }
       }
} 
