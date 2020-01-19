package cn.ty.arithmetic.sort;

import java.util.Arrays;

public class ShellSort extends AbstractSort {

    public static void main(String[] args) {
        System.out.println("begin vArray:"+ Arrays.toString(vArray));
        ShellSort.doInsertSortTest(vArray);
        System.out.println("end vArray:"+ Arrays.toString(vArray));
    }
    /**
     * 自测方法
     * 基准数与它前面一个数小，才进循环.
     * @param arr
     */
    public static void doInsertSortTest(int[] arr) {
        if (arr == null || arr.length < 2)
            return;

    }


    @Override
    public void doSort(int[] arr) {

    }
}
