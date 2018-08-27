package one;

import util.ArrayOutput;

/**
 * ð�������㷨ʵ��
 * ʵ��˼�룺
 * 1.ÿ�α��������������ڵ�����Ԫ�ؽ��бȽϣ����Ԫ��������ң���Ԫ�ػ��������򲻱䡣ֱ��������������һ��
 * Ԫ�س�Ϊ����Ԫ�ء�
 * 2.�����������μ��٣�ÿ�α���������������Ԫ�ء�
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
	 * �㷨ʵ��
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
