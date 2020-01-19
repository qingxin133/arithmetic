package cn.ty.arithmetic.sort;

/**
 * 插入排序
 */
public class InsertSort {

    private static int[] vArray = new int[]{1, 5, 4, 3,9};

    public static void main(String[] args) {
        InsertSort.doInsertSort(vArray);
        for(int a:vArray){
            System.out.println(a);
        }
    }

    /**
     * 从第一个元素开始，该元素认为已经被排序
     * 在已经排序的元素序列中从后向前扫描
     * 如果该元素（已排序）大于新元素，该元素移到下一个位置
     * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
     * 将该元素插入到新位置中
     * 重复步骤2
     * @param arr 数组
     */
    public static void doInsertSort(int[] arr){
        //为空或者只有一个没必要排序
        if(arr==null || arr.length<2)
            return;
        int size=arr.length,temp,j;
            //如果该元素（已排序）大于新元素，该元素移到下一个位置,重复步骤3
            //arr[j-1]当前位置，arr[j]前一个数
            //J控制循环的次数，大于0，最大当前位置次，把前面那个数，交换
        for (int i = 0; i < size ; i++) {
            temp = arr[i];
            for(j=i;j>0 && temp < arr[j-1];j--){
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }

    }

}
