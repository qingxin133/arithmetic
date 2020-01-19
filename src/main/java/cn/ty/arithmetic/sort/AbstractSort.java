package cn.ty.arithmetic.sort;

public abstract class AbstractSort {

    /**
     * 默认的数组
     */
    static int[] vArray = new int[]{2, 9, 6, 7, 1, 10, 8};

    /**
     * 比较器
     * @param arr 传入的数组
     * @return
     */
    public abstract void comparator(int[] arr);


}
