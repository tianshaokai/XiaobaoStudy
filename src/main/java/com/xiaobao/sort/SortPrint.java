package com.xiaobao.sort;

public class SortPrint {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 2, 6, 7, 9, 4, 8};
        IArraySort iArraySort = new MaoPaoSort();
        int[] sortArray = iArraySort.sort(array);
        for (int i = 0; i < sortArray.length; i++) {
            if (i > 0) {
                System.out.print("\t");
            }
            System.out.print(sortArray[i]);
        }
    }
}
