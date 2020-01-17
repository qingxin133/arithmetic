package cn.ty.arithmetic.sort;

/**
 * 冒泡排序
 */
public class Bubbling {

    private static int[] vArray = new int[]{1, 5, 4, 2};

    public static void main(String[] args) {
        Bubbling.doBubbling(vArray);
//        for(int a:vArray){
//            System.out.println(a);
//        }
    }
    
    /**
     * 冒泡
     * 把最大的数冒泡到最后面然后下一轮
     */
    public static void doBubbling(int[] arr) {
        //非空并且大于2个
        if (arr != null && arr.length > 1) {
            //第一层for循环,用来控制冒泡的次数
            for (int i = 0; i < arr.length - 1; i++) {
                // 加入一个布尔变量,如果内循环没有交换值,说明已经排序完成,提前终止
                boolean flag = true;
                //第二层for循环,用来把大的数往后放
                for (int j = 0; j < arr.length - i - 1; j++) {
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
                for (int a : vArray) {
                    System.out.print(a);
                }
                if (flag) {
                    break;
                }
                System.out.println();
            }
        }

    }

}
