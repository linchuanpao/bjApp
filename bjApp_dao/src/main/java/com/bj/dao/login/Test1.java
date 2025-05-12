package com.bj.dao.login;

public class Test1 {
    /**
     * 测试快速排序
     */
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        System.out.println("排序前的数组:");
        printArray(arr);

        quickSort(arr, 0, n - 1);

        System.out.println("排序后的数组:");
        printArray(arr);
    }

    /**
     * 快速排序的主方法
     * @param arr 待排序的数组
     * @param low 当前子数组的起始索引
     * @param high 当前子数组的结束索引
     */
    public static void quickSort(int[] arr, int low, int high) {

        if (low >= high) {
            return;
        }

        int basicNum = arr[low];
        int left = low-1;
        int right = high+1;
        while (true) {
             //从左边找比基准数大的
            do {
                left++;
            }
            while (arr[left] < basicNum);
            do {
                right--;
            } while (arr[right] > basicNum) ;

            //指针碰到停止
            if (left >= right) {
                break;
            }
            //交互位置
            swap(arr,left,right);



        }
        quickSort(arr,low,right);

        quickSort(arr,right + 1,high);
    }
   /* public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        // 选择最左端为基准‌:ml-citation{ref="1,5" data="citationList"}
        int pivot = arr[left];
        int i = left - 1;       // 左扫描指针初始化
        int j = right + 1;      // 右扫描指针初始化

        while (true) {
            // 左边找大于基准的数‌:ml-citation{ref="5,7" data="citationList"}
            do {
                i++;
            } while (arr[i] < pivot);

            // 右边找小于基准的数‌:ml-citation{ref="5,7" data="citationList"}
            do {
                j--;
            } while (arr[j] > pivot);

            if (i >= j) {
                break;  // 指针相遇时终止循环‌:ml-citation{ref="5" data="citationList"}
            }

            // 交换不符合条件的元素‌:ml-citation{ref="1,5" data="citationList"}
            swap(arr, i, j);
        }

        // 递归处理子数组‌:ml-citation{ref="1,5" data="citationList"}
        quickSort(arr, left, j);
        quickSort(arr, j + 1, right);
    }*/


    /**
     * 交换数组中两个元素的位置
     * @param arr 数组
     * @param i 第一个元素的索引
     * @param j 第二个元素的索引
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 打印数组
     * @param arr 数组
     */
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
