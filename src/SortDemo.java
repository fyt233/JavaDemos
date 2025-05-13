import java.util.Calendar;

public class SortDemo {
    public static void main(String[] args) {//这应该是选择排序
        int len = 80000;
//        int[] arr = {56, 12, 89, 90, 123, 43, 18, 52};
//        int temp;
        int[] arr = new int[len];
//        for (int i = 0; i < arr.length; i++) {
//            int p = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[p] > arr[j]) {
//                    p = j;
//                }
//                if (p != i) {
//                    temp = arr[i];
//                    arr[i] = arr[p];
//                    arr[p] = temp;
//                }
//            }
//        }
//        selectSort(arr);

        //排序前获取系统时间，但Calender类不能实例化
//        Calendar cal = Calendar.getInstance();
//        System.out.println(cal.getTime());
        long starttime=System.currentTimeMillis();
        Select.selectSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        long endtime=System.currentTimeMillis();
        System.out.println((endtime-starttime)+"ms");
//        System.out.println();
//        cal = Calendar.getInstance();
//        System.out.println(cal.getTime());
    }

    //封装到方法中
    static void selectSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            int p = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[p] > arr[j]) {
                    p = j;
                }
                if (p != i) {
                    temp = arr[i];
                    arr[i] = arr[p];
                    arr[p] = temp;
                }
            }
        }
    }
}

//封装到类
class Select {
    static void selectSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            int p = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[p] > arr[j]) {
                    p = j;
                }
                if (p != i) {
                    temp = arr[i];
                    arr[i] = arr[p];
                    arr[p] = temp;
                }
            }
        }
    }

}

