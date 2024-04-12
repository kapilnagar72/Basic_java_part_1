package DSA;
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[]args){
        Scanner sc = new Scanner( System.in);
        // size of elemnt from user 
        System.out.println("enter the number of element from the user presennt in an array");
        int n = sc.nextInt();
        //array element entered from element
        System.out.println("enter the array element");
        int []arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
            // target element from the user
            System.out.println("enter the target element");
            int x = sc.nextInt();

            //implementation of linear search
             int index =-1;
             for(int i=0;i<n;i++)
             {
                if (arr[i]==x){
                    index = i;
                    break;
                }
             }
             if(index== -1){
                System.out.println("Search element are not found the in array");

             }
             else{
                System.out.println("Search element are found the array");
             }
        }

    }

