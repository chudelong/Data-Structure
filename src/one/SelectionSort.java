package one;

import util.ArrayOutput;

/**
 * ��ѡ������
 * ԭ��ÿһ�˴Ӵ�����ļ�¼��ѡ����С��Ԫ�أ����ҵ�����СԪ�����ź����һλԪ�ؾ�λ�ý�����˳��������ź�����������ֱ��ȫ����¼�������
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
	 * ����ʵ��
	 * @param arr
	 */
	public static void selectSort(int[] arr) {

		// ѭ������
		for (int i = 0; i < arr.length - 1; i++) {

			int k = i;// ��СԪ�ص�λ������
			for (int j = k + 1; j < arr.length; j++) {
				//�ҵ���СԪ�ص�λ��
				if(arr[j] < arr[k]) {
					k = j;
				}
			}
			
			//��ÿһ��ѭ���ҵ���СԪ�ؽ��и�ֵ
			if(i != k) {
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
			}
		}
	}
}





















