package cn.ty.arithmetic.sort;

import java.util.Arrays;

/**
 * 希尔排序
 * 希尔排序是把记录按下表的一定增量分组，
 * 对每组使用直接插入排序算法排序；
 * 随着增量逐渐减少，
 * 每组包含的关键词越来越多，
 * 当增量减至1时，整个文件恰被分成一组，算法便终止。
 */
public class ShellSort extends AbstractSort {

    public static void main(String[] args) {
        System.out.println("begin vArray:"+ Arrays.toString(vArray));
        new ShellSort().doShellSortTest(vArray);
        System.out.println("end vArray:"+ Arrays.toString(vArray));
    }
    /**
     * 自测方法
     * 基准数与它前面一个数小，才进循环.
     * @param arr
     */
    public static void doShellSortTest(int[] arr) {
        if (arr == null || arr.length < 2)
            return;
        int len = arr.length;
        int temp, gap = len / 2;
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                temp = arr[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && arr[preIndex] > temp) {
                    arr[preIndex + gap] = arr[preIndex];
                    preIndex -= gap;
                }
                arr[preIndex + gap] = temp;
            }
            gap /= 2;
        }
    }


    @Override
    public void doSort(int[] arr) {

    }
}
