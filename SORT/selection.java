package SORT;

import java.util.*;
import java.io.*;
public class selection {

  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);

    System.out.println("Define your array Size");
    int n = in.nextInt();

    int[] array = new int[n];
    System.out.println("Enter the elements of the array: ");
    for (int i = 0; i < n; i++)
     {
      array[i] = in.nextInt();
    }
    long start = System.currentTimeMillis();

    ss(array);
        System.out.println("SORTED ARRAY: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
            
    
        }
        System.out.println();
        long end=System.currentTimeMillis();
        System.out.println("Total time taken: "+ (end-start)+"ms");

    }

  public static void ss(int array[]){
    for(int i=0;i<array.length-1;i++)
    {
        int min = i;
        for(int j=i+1;j<array.length;j++)
        {   
            if(array[j] < array[min]){
                min=j;
            }
        }
        int temp=array[i];
        array[i]=array[min];
        array[min]=temp;

    }



  }
}
