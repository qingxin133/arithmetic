package cn.ty.arithmetic.util;

import java.util.Arrays;

/**
 * 排序工具类
 */
public class SortUtil {

    private static int[] arr = new int[]{1, 9, 6, 7, 2, 10};

    public static void main(String[] args) {
        System.out.println(SortUtil.avg(100,500));
        System.out.println("args = " + Arrays.toString(arr));
        SortUtil.swap(arr, 1, 2);
        System.out.println("args = " + Arrays.toString(arr));
        System.out.println("with = " + SortUtil.with());
        System.out.println("or = " + SortUtil.or());
        SortUtil.xor();
    }

    /**
     * 数组元素交换-异或运算符
     * 数组为空或小于2个不交换
     * i和j的位置一样不交换
     * 根据异或运算符的特性，一个数与另一个数异或两次等于它自己,不要去算它的值，记它的关系就行
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int[] arr, int i, int j) {
        if(arr==null || arr.length<2 || Integer.compare(i,j)==0){
            return;
        }
        //9=> 00001001
        //6=> 00000110
        arr[i] ^= arr[j]; //arr[i] = arr[i]^arr[j]
        arr[j] ^= arr[i]; //arr[j] = arr[j] ^ (arr[i]^arr[j]) = arr[i]异或了两次arr[j] = arr[i]它自己
        arr[i] ^= arr[j]; //arr[i] = arr[i] ^ arr[j] => (arr[i]^arr[j]) ^ arr[i] = arr[j]
        System.out.print("1"+",");
    }

    /**
     * 与运算符
     * 两个操作数中位都为1，结果才为1，否则结果为0
     *
     * @return
     */
    public static int with() {
        int i = 129;
        int j = 11;
        return i & j;
    }

    /**
     * 或运算符
     *
     * @return
     */
    public static int or() {
        int i = 129;
        int j = 11;
        return i | j;
    }

    /**
     * 异或找唯一不同数
     */
    public static void xor() {
        int[] A = {1, 2, 5, 4, 4, 1, 2};
        int n = A[0];
        for (int i = 1; i < A.length; i++) {
            n = n ^ A[i];
        }
        System.out.println(n);
    }

    /**
     * 求平均值
     * 不会有类型边界问题
     * @param x
     * @param y
     * @return
     */
    public static int avg(int x,int y){
        return (x&y)+((x^y)>>1);
    }



}
