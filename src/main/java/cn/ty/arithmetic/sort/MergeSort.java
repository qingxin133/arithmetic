package cn.ty.arithmetic.sort;

/**
 * 归并排序
 * 左侧和右侧分别排序
 * 用外排序的方式，把两个数组a,b当中循环比较，a[i]小的先填，下标移动a[i+1],最后填B
 * 时间复杂度左侧+右侧+外排，T(n) = 2T(n/2) + O(N) => O(N*logN)
 */
public class MergeSort extends AbstractSort {

    public static void main(String[] args) {

    }

    @Override
    public void comparator(int[] arr) {

    }

    /**
     * 递归过程
     * @param L
     * @param R
     */
    public void sortPrcess(int[]arr,int L,int R){

    }

    /**
     * 外排
     * @param arr
     * @param L
     * @param mid
     * @param R
     */
    public static void merge(int[] arr,int L,int mid,int R){

    }




}
