package cn.ty.arithmetic.sort;

import cn.ty.arithmetic.util.SortUtil;

import java.util.Arrays;

/**
 * 冒泡排序
 * 从第一个开始，把相邻的数，如果前面比后面大，就交换，把最大的一直换到最后
 * 重复上面的步骤，直到没有数字需要比较
 * 通过一路交换，找到最大的,放到最后
 */
public class BubblingSort  extends AbstractSort{

    public static void main(String[] args) {
        System.out.println("begin vArray:"+ Arrays.toString(vArray));
        new BubblingSort().comparator(vArray);
        System.out.println("end vArray:"+ Arrays.toString(vArray));
    }

    /**
     * 自测冒泡
     * @param arr
     */
    public static void doBubbTest(int[] arr){
        if(arr==null || arr.length<2)
            return;
        int length = arr.length;
        //外层循环
        for (int i = 0; i <length ; i++) {
            boolean flag = true;
            //用交换的方式，把最大的数，换到最后
            for(int j=0; j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    SortUtil.swap(arr,j,j+1);
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
    }

    
    /**
     * 冒泡
     * 把最大的数冒泡到最后面然后下一轮
     * 最后面是递减的
     */
    public static void doBubbling(int[] arr) {
        //非空并且大于2个
        if (arr != null && arr.length > 1) {
            //第一层for循环,用来控制冒泡的次数
            for (int i = 0; i < arr.length - 1; i++) {
                // 加入一个布尔变量,如果内循环没有交换值,说明已经排序完成,提前终止
                boolean flag = true;
                //第二层for循环,用来把大的数往后放
                for (int j = 0; j < arr.length - i; j++) {
//                    System.out.println("i:"+i+",j:"+j+":"+arr[j]+","+arr[j+1]);
                    if (arr[j] > arr[j + 1]) {
                        // 调换
                        int temp;
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        // 改变flag
                        flag = false;
                    }
                }
                if (flag) {
                    break;
                }
            }
        }

    }

    @Override
    public void comparator(int[] arr) {
        if(arr==null || arr.length<2)
            return;
        //外层循环
        for (int end = arr.length-1; end>0 ; end--) {
            boolean flag = true;
            //用交换的方式，把最大的数，换到最后
            for(int i=0; i<end;i++){
                if(arr[i]>arr[i+1]){
                    SortUtil.swap(arr,i,i+1);
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
    }
}
