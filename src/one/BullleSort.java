package one;

import util.ArrayOutput;

/**
 * 冒泡排序算法实现
 * 实现思想：
 * 1.每次遍历，从左到右相邻的两个元素进行比较，如果元素左大于右，则元素互换，否则不变。直至遍历到最后，最后一个
 * 元素成为最大的元素。
 * 2.遍历次数依次减少，每次遍历都遍历出最大的元素。
 * @author cdl
 *
 */
public class BullleSort {
	public static void main(String[] args){
		int[] arr = {5,2,1,4,3};
		bubbleSort(arr);
		ArrayOutput.arraySort(arr);
	}
	
	/**
	 * 算法实现
	 * @param arr
	 */
	public static void bubbleSort(int[] arr) {
		boolean needNextPass = true;
		
		for(int i = 1; i < arr.length && needNextPass == true; i++) {
			needNextPass = false;
			for(int j = 0; j < arr.length - i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					
					needNextPass = true;
				}
				
			}
		}
	}
}
