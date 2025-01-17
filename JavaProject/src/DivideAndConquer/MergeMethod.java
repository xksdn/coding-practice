package DivideAndConquer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeMethod {
    public static void main(String[] args) {
        System.out.println(merge(new ArrayList<>(Arrays.asList(1)), new ArrayList<>()));
        System.out.println(merge(new ArrayList<>(), new ArrayList<>(Arrays.asList(1))));
        System.out.println(merge(new ArrayList<>(Arrays.asList(2)), new ArrayList<>(Arrays.asList(1))));
        System.out.println(merge(new ArrayList<>(Arrays.asList(1,2,3,4)), new ArrayList<>(Arrays.asList(5,6,7,8))));
        System.out.println(merge(new ArrayList<>(Arrays.asList(5,6,7,8)), new ArrayList<>(Arrays.asList(1,2,3,4))));
        System.out.println(merge(new ArrayList<>(Arrays.asList(4,7,8,9)), new ArrayList<>(Arrays.asList(1,3,6,10))));
    }

    public static List<Integer> merge (List<Integer> list1, List<Integer> list2) {
        ArrayList<Integer> mergedList = new ArrayList<>();

        if (list1.isEmpty() || list2.isEmpty()) {
            list1.addAll(list2);
            return list1;
        }

//        int i = 0;
//        int j = 0;
//
//        while (i < list1.size() && j < list2.size()) {
//            if (list1.get(i) > list2.get(j)) {
//                mergedList.add(list2.get(j));
//                j++;
//            } else {
//                mergedList.add(list1.get(i));
//                i++;
//            }
//        }

        if (list1.get(0) < list2.get(0)) {
            mergedList.add(list1.get(0));
            mergedList.addAll(merge(list1.subList(1, list1.size()), list2));
        } else {
            mergedList.add(list2.get(0));
            mergedList.addAll(merge(list1, list2.subList(1, list2.size())));
        }

        return mergedList;
    }
}
