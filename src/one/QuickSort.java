package one;

import util.ArrayOutput;

/**
 * ����˼����ǣ�ÿ�εݹ������ǣ��ҵ���׼λ��λ��
 * 
 * 1.ѡ����׼λ��һ��ѡ����߻����ұߣ���ʵ��ѡ�����
 * 2.��������Ƚϣ��ҵ��Ȼ�׼λС��Ԫ�أ�Ȼ���ٴ��������ҵ��Ȼ�׼λ���Ԫ�ء�
 * 3.��������Ԫ�ص�λ�á�
 * 4.�����������Ƚ��ظ�2���裬ֱ����=�ң�����Ԫ�غͻ�׼λ������
 * 5.��ʱ�Ѿ��ֺ�������Ԫ�ء������ݹ��������
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
	 * �����������������㷨ʵ��
	 * @param arr
	 * @param low
	 * @param high
	 */
	public static void quickSort(int[] arr, int low, int high) {
		int temp; //��׼λ
		int t; //��Ϊ��������ʱ����
		int i;
		int j;
		
		if(low > high) {
			return;
		}
		
		i = low;
		j = high;
		temp = arr[low];//ѡ�������һ��Ϊ��׼λ
		
		// ѭ����ɵ�һ�����ջ�����С������
		while(i < j) {
			//�ȿ��ұߣ���������ݼ����ҵ�С��temp��Ԫ��
			while(i < j && temp <= arr[j]) {
				j--;
			}
			
			//�ٿ���ߣ��������ҵ������ҵ�����temp��Ԫ��
			while(i < j && temp >= arr[i]) {
				i++;
			}
			
			//���������������������������Ԫ��
			if(i < j) {
				t = arr[j];
				arr[j] = arr[i];
				arr[i] = t;
			}
		}
		//��󽫻�׼λi��j���λ�õ����ֽ���
		arr[low] = arr[i];
		arr[i] = temp;
		
		//�ݹ�����������
		quickSort(arr, low, j - 1);
		//�ݹ�����Ұ�����
		quickSort(arr, j + 1, high);
	}
	

}
