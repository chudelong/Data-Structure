package one;

import util.ArrayOutput;

/**
 * 核心思想就是：每次递归排序是：找到基准位的位置
 * 
 * 1.选定基准位，一般选择左边或者右边，本实现选择左边
 * 2.从右向左比较，找到比基准位小的元素，然后再从左向右找到比基准位大的元素。
 * 3.交换两个元素的位置。
 * 4.接下来继续比较重复2步骤，直至左=右，相遇元素和基准位交换。
 * 5.这时已经分好两部分元素。继续递归调用排序。
 * @author cdl
 *
 */
public class QuickSort {
	public static void main(String[] args) {
		int arr[] = {2,1,9,8,6,0,7,3,5,4};
		quickSort(arr, 0, arr.length - 1);
		ArrayOutput.arraySort(arr);
	}
	
	/**
	 * 快速排序完成排序的算法实现
	 * @param arr
	 * @param low
	 * @param high
	 */
	public static void quickSort(int[] arr, int low, int high) {
		int temp; //基准位
		int t; //作为交换的临时变量
		int i;
		int j;
		
		if(low > high) {
			return;
		}
		
		i = low;
		j = high;
		temp = arr[low];//选择数组第一个为基准位
		
		// 循环完成第一轮依照基数大小的排序
		while(i < j) {
			//先看右边，依次向左递减，找到小于temp的元素
			while(i < j && temp <= arr[j]) {
				j--;
			}
			
			//再看左边，依次向右递增，找到大于temp的元素
			while(i < j && temp >= arr[i]) {
				i++;
			}
			
			//如果满足条件，交换符合条件的元素
			if(i < j) {
				t = arr[j];
				arr[j] = arr[i];
				arr[i] = t;
			}
		}
		//最后将基准位i和j相等位置的数字交换
		arr[low] = arr[i];
		arr[i] = temp;
		
		//递归调用左半数组
		quickSort(arr, low, j - 1);
		//递归调用右办数组
		quickSort(arr, j + 1, high);
	}
	

}
