package one;

import util.ArrayOutput;
/**
 * �鲢�����㷨ʵ��
 * ʵ��˼�룺
 * 
 * @author cdl
 *
 */
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6};
		int[] firstHalf = new int[arr.length / 2];
		System.arraycopy(arr, 2, arr, 2, 2);
		
		ArrayOutput.arraySort(arr);
	}

}
 