package DivideAndConquer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println(mergeSort(new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9, 11, 13, 11))));
        System.out.println(mergeSort(new ArrayList<>(Arrays.asList(28, 13, 9, 30, 1, 48, 5, 7, 15))));
        System.out.println(mergeSort(new ArrayList<>(Arrays.asList(2, 5, 6, 7, 1, 2, 4, 7, 10, 11, 4, 15, 13, 1, 6, 4))));
    }

    public static List<Integer> mergeSort (List<Integer> myList) {
        if (myList.size() <= 1) {
            return myList;
        }

        List<Integer> leftList;
        List<Integer> rightList;


        leftList = myList.subList(0, myList.size() / 2);
        rightList = myList.subList(myList.size() / 2, myList.size());

        leftList = mergeSort(leftList);
        rightList = mergeSort(rightList);

        return merge(leftList, rightList);

    }

    public static List<Integer> merge (List<Integer> list1, List<Integer> list2) {
        ArrayList<Integer> mergedList = new ArrayList<>();

        if (list1.isEmpty()) {
            return list2;
        }
        if (list2.isEmpty()) {
            return list1;
        }

        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }
        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
}
