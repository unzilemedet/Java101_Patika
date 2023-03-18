package patika.dev;

import java.util.ArrayList;
import java.util.List;

public class DuplicateEvenNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 10, 10};

        List<Integer> duplicates = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j] && arr[i] % 2 == 0 && !duplicates.contains(arr[i])) {
                        duplicates.add(arr[i]);
                        break;
                    }
                }
            }
        }

        System.out.println("Tekrar eden çift sayılar: " + duplicates);
    }

}
