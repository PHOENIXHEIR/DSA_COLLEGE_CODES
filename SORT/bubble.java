package SORT;
import java.util.*;
public class bubble {
    
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
        System.out.println("sorted array");
        bs(array);
        for(int i=0;i<n;i++){
            System.out.print(array [i]+" ");
        }


    }
    public static void bs(int array[])
    {
        for(int i=0;i<array.length-1;i++){
            for (int j=0;j<array.length-i-1;j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]= array[j+1];
                    array[j+1]=temp;

                }
            }
        }

    }

}
    
    

