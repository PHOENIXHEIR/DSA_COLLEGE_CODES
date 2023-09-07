package BASICS;

import java.util.*;

public class array {

     public static void main(String[] args) {
     Scanner in = new Scanner(System.in);


     System.out.println("Define your array Size");
        int n = in.nextInt();

        int [] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            array[i]=in.nextInt();

        }

        for(int i=0;i<n;i++){
            System.out.print(array [i]+" ");
        }


     }
}
