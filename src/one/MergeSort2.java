package one;

/**
 * �������������
 * 
 * @author cmri
 *
 */
public class MergeSort2 {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1 };
		mergeSort(arr);

	}

	public static void mergeSort(int[] list) {
		if (list.length > 0) {

			int[] firstHalf = new int[list.length / 2];
			System.arraycopy(list, 0, firstHalf, 0, list.length / 2);

			mergeSort(firstHalf);

			int secondHalfLength = list.length - list.length / 2;
			int[] secondHalf = new int[secondHalfLength];
			System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);

			merge(firstHalf, secondHalf, list);
		}
	}

	/**
	 * �ϲ�����
	 * 
	 * @param list1
	 * @param list2
	 * @param temp
	 */
	private static void merge(int[] list1, int[] list2, int[] temp) {
		// ���ñ���
		int current1 = 0;
		int current2 = 0;
		int current3 = 0;

		// ����ȴ�С����С�����η���temp
		while (current1 < list1.length && current2 < list2.length) {

			if (list1[current1] < list2[current2]) {
				temp[current3++] = list1[current1++];
			} else {
				temp[current3++] = list2[current2++];
			}

			// �ж������Ƿ���ʣ�࣬Ȼ��ʣ�ಿ�����δ洢��temp
			while (current1 < list1.length) {
				temp[current3++] = list1[current1++];
			}

			while (current2 < list2.length) {
				temp[current3] = list2[current2++];
			}
		}
	}
}
