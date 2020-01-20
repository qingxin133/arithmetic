package cn.ty.arithmetic.sort;

import java.util.Arrays;

/**
 * 归并排序
 * 左侧和右侧分别排序
 * 用外排序的方式，把两个数组a,b当中循环比较，a[i]小的先填，下标移动a[i+1],最后填B
 * 时间复杂度左侧+右侧+外排，T(n) = 2T(n/2) + O(N) => O(N*logN)
 */
public class MergeSort extends AbstractSort {

    public static void main(String[] args) {
        System.out.println("begin vArray:"+ Arrays.toString(vArray));
        new MergeSort().comparator(vArray);
        System.out.println("end vArray:"+ Arrays.toString(vArray));
    }

    /**
     * 主方法
     *
     * @param arr 传入的数组
     */
    @Override
    public void comparator(int[] arr) {
        sortPrcess(arr, 0, arr.length - 1);
    }

    /**
     * 对数组的左边和右边分别进行递归过程
     * 把两个数组a,b当中循环比较，a[i]小的先填，下标移动a[i+1],最后填B
     *
     * @param L 左边界
     * @param R 右边界
     */
    public void sortPrcess(int[] arr, int L, int R) {
        if (L == R) {
            return;
        }
        //int mid = left + (right-left)/2;
        int mid = L + ((R - L) >> 1);
        sortPrcess(arr, 0, mid);
        sortPrcess(arr, mid + 1, R);
        merge(arr, L, mid, R);
    }

    /**
     * 外排
     * 1.声明一个临时数组temp,长度为R-L+1
     * 2.被拆分的左右边两个数组A,B,
     * 3.下标指针P1(范围0-mid),P2(范围(mid+1)-R)
     * 4.P1位置上的数小于P2上的数,P1位置上的数先放到临时数组当中P1++,temp i++
     * 5.如果P1循环完，把P2依次放入
     * 6.把临时数组temp，放回到arr当中,被分割的部分重排结束
     *
     * @param arr 被拆分的子数组
     * @param L   左边界
     * @param mid 中间
     * @param R   右边界
     */
    public static void merge(int[] arr, int L, int mid, int R) {
        int[] temp = new int[R - L + 1];
        int i = 0;
        int p1 = L; //起始位置
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= R) {
            temp[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        //判断左右两边还没有越界的数组，让它循环完,放入到temp当中
        while (p1 <= mid) {
            temp[i++] = arr[p1++];
        }
        while (p2 <= R) {
            temp[i++] = arr[p2++];
        }
        //把临时数组temp，放回到arr当中,被分割的部分重排结束
        for (i = 0; i < temp.length; i++) {
            arr[L + i] = temp[i];
        }
    }


}
