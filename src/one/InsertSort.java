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
	 * ���������㷨ʵ��
	 * ʵ��˼�룺
	 * �ӵ�һ��Ԫ�ؿ�ʼ����Ԫ�ؿ�����Ϊ�Ѿ�������
     * ȡ����һ��Ԫ�أ����Ѿ������Ԫ�������дӺ���ǰɨ�� 
     * �����Ԫ�أ������򣩴�����Ԫ�أ�����Ԫ���Ƶ���һλ��  
     * �ظ�����3��ֱ���ҵ��������Ԫ��С�ڻ��ߵ�����Ԫ�ص�λ��  
     * ����Ԫ�ز��뵽��λ����  
     * �ظ�����2  
	 */
	public static void iSort(int[] arr) {
		int temp;
		//��Ҫ�Ƚϵ�ѭ����
		for(int i = 1; i < arr.length; i++) {
			//ÿ�αȽϵĴ�����j > 0 ��ȷ��ָ����У�������ַ
			for(int j = i; j > 0 && arr[j-1] > arr[j]; j--) {
				temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;		
			}
		}
	}
}
