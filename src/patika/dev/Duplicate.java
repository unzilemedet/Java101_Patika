package patika.dev;

import java.util.Arrays;

public class Duplicate {

    static  boolean isFound (int[] arr, int value){
        for (int i : arr){
            if (i == value){
                return true;
            }
        }
        return  false;
    }
    public static void main(String[] args) {

        // tekrar eden sayıları bulan program
        int[] list ={3,4,2,3,5,1,7,1,9,0,9,8};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i<list.length ; i++){
            for(int j = 0 ; j < list.length ; j++){
                if (  (i != j)  &&  (list[i] == list[j]) ) {
                    if( !isFound(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for ( int value : duplicate) {
            if( value != 0){
                System.out.println(value);
            }

        }

    }
}
