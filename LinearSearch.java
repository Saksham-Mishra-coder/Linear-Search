import java.util.*;
//Linear Search
public class LinearSearch{
    public static int linearSearch(int numbers[], int key){
        for(int i =0;i<=numbers.length;i++){
            if(numbers[i] == key ){
                return i;
            }
        }
        return -1;

    }
public static void main(String args[]){
    int numbers[]={3,5,6,8,18,19,47,34,25};
    int key = 24;
    int index = linearSearch(numbers, key);
    if (index == -1){
        System.out.print("not found");
    }else{
        System.out.println("Index at"+ index);
    }
}
}