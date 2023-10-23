package assignment_7;
import java.util.ArrayList;

public class merge {

}
public static void mergeSort(ArrayList<Integer> arr) {
    if (arr.size() <= 1) {
        return;
    }
    
    int mid = arr.size() / 2;
    ArrayList<Integer> left = new ArrayList<>(arr.subList(0, mid));
    ArrayList<Integer> right = new ArrayList<>(arr.subList(mid, arr.size()));

    mergeSort(left);
    mergeSort(right);

    merge(arr, left, right);
}

private static void merge(ArrayList<Integer> arr, ArrayList<Integer> left, ArrayList<Integer> right) {
	// TODO Auto-generated method stub
	
}

private merge(ArrayList<Integer> result, ArrayList<Integer> left, ArrayList<Integer> right) {
    int i = 0, j = 0, k = 0;

    while (i < left.size() && j < right.size()) {
        if (left.get(i) < right.get(j)) {
            result.set(k++, left.get(i++));
        } else {
            result.set(k++, right.get(j++));
        }
    }

    while (i < left.size()) {
        result.set(k++, left.get(i++));
    }

    while (j < right.size()) {
        result.set(k++, right.get(j++));
    }
}
}

