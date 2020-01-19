package cn.ty.arithmetic.sort;

import cn.ty.arithmetic.util.SortUtil;

import java.util.Arrays;

/**
 * 插入排序
 * 如果左边的数比你大，就让左边位移一个，如果左边的数比你小，插入到它后面
 */
public class InsertSort extends AbstractSort {

    public static void main(String[] args) {
        int[] vArray = new int[]{2, 9, 6, 7, 1, 10, 8};
        System.out.println("begin vArray:" + Arrays.toString(vArray));
//      InsertSort.doInsertSortTest(vArray);
        new InsertSort().comparator(vArray);
        System.out.println();
        System.out.println("end vArray:" + Arrays.toString(vArray));
    }

    /**
     * 自测方法
     * 基准数与它前面一个数小，才进循环.
     *
     * @param arr
     */
    public static void doInsertSortTest(int[] arr) {
        if (arr == null || arr.length < 2)
            return;
        //基准数
        for (int i = 1; i < arr.length; i++) {
            int benchmark = arr[i];
            //基准数前面的数,基准数比它小才进
            while (i >= 1 && arr[i - 1] > benchmark) {
                arr[i] = arr[i - 1];
                i--;
            }
            arr[i] = benchmark;
        }
    }

    @Override
    public void comparator(int[] arr) {
        if (arr == null || arr.length < 2)
            return;
        //i位置上是基准数
        for (int i = 1; i < arr.length; i++) {
            //基准数前面的数，如果前面的数比后面的数大，交换,然后往前看能不能再交换
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                SortUtil.swap(arr, j, j + 1);
            }
        }
    }
}
