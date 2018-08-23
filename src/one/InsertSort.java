package one;

import util.ArrayOutput;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,4,0,6,1,3,5,7,9,777,4,2,24,524,52,4};
		iSort(arr);
		ArrayOutput.arraySort(arr);
	}
	
	/**
	 * 插入排序算法实现
	 * 实现思想：
	 * 从第一个元素开始，该元素可以认为已经被排序
     * 取出下一个元素，在已经排序的元素序列中从后向前扫描 
     * 如果该元素（已排序）大于新元素，将该元素移到下一位置  
     * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置  
     * 将新元素插入到该位置中  
     * 重复步骤2  
	 */
	public static void iSort(int[] arr) {
		int temp;
		//共要比较的循环数
		for(int i = 1; i < arr.length; i++) {
			//每次比较的次数，j > 0 是确保指向有校的数组地址
			for(int j = i; j > 0 && arr[j-1] > arr[j]; j--) {
				temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;		
			}
		}
	}
}
