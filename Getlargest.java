import java.util.*;
public class Getlargest {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // -infinty
        for (int i =0; i<=numbers.length;i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int numbers[]={1,2,6,5 ,3};
        System.out.println("largest number is "+ getLargest(numbers));

    }
}

