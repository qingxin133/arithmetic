package cn.ty.arithmetic.sort;

import cn.ty.arithmetic.util.SortUtil;

import java.util.Arrays;

/**
 * 选择排序
 * 首先在未排序序列中找到最小元素，存放到排序序列的起始位置
 * 然后再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的后面
 * 通过遍历选中最大的，标记上,与未排过的最前面一个数交换
 */
public class SelectionSort extends AbstractSort {

    public static void main(String[] args) {
        System.out.println("begin vArray:" + Arrays.toString(vArray));
        new SelectionSort().comparator(vArray);
        System.out.println("end vArray:" + Arrays.toString(vArray));
    }

    /**
     * 自测
     * 把每个数都循环一次找到最小的数，和队首的数交换
     * 队首是++的
     */
    public static void doSelectionSortTest(int[] arr) {
        if (arr == null || arr.length < 2)
            return;
        //队首
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            //从i+1开始,到最后一个数结束
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
             SortUtil.swap(arr, i, min_index);
        }
    }

    /**
     * 选择排序
     * @param arr
     */
    public void comparator(int[] arr) {
        if (arr == null || arr.length < 2)
            return;
        //队首
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            //从i+1开始,到最后一个数结束
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            //如果最小值索引不是自己，交换
            SortUtil.swap(arr, i, minIndex);
        }
    }


}
