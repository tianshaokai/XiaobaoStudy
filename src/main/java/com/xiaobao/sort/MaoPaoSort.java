package com.xiaobao.sort;

public class MaoPaoSort implements IArraySort {

    @Override
    public int[] sort(int[] sourceArray) {
        for (int i = 0; i < sourceArray.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < sourceArray.length - 1 - i; j++) {
                int temp = 0;
                if (sourceArray[j] > sourceArray[j + 1]) {
                    temp = sourceArray[j];
                    sourceArray[j] = sourceArray[j + 1];
                    sourceArray[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        return sourceArray;
    }
}
