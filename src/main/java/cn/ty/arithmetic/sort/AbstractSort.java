package cn.ty.arithmetic.sort;

public abstract class AbstractSort {

    /**
     * 默认的数组
     */
    static int[] vArray = new int[]{2, 9, 6, 7, 1, 10, 8};

    /**
     * 排序的抽象方法
     * @param arr
     * @return
     */
    public abstract void doSort(int[] arr);


}
