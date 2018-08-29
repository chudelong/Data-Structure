package one;

import util.ArrayOutput;

/**
 * 简单选择排序
 * 原理：每一趟从待排序的记录中选出最小的元素，将找到的最小元素与排好序后一位元素就位置交换，顺序放在已排好序的序列最后，直到全部记录排序完毕
 * 
 * @author cdl
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {5,2,1,0,4};
		selectSort(arr);
		ArrayOutput.arraySort(arr);
	}
	
	/**
	 * 排序实现
	 * @param arr
	 */
	public static void selectSort(int[] arr) {

		// 循环层数
		for (int i = 0; i < arr.length - 1; i++) {

			int k = i;// 最小元素的位置坐标
			for (int j = k + 1; j < arr.length; j++) {
				//找到最小元素的位置
				if(arr[j] < arr[k]) {
					k = j;
				}
			}
			
			//把每一次循环找到最小元素进行赋值
			if(i != k) {
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
			}
		}
	}
}





















