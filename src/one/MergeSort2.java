package one;

/**
 * 排序数组在理解
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
	 * 合并数组
	 * 
	 * @param list1
	 * @param list2
	 * @param temp
	 */
	private static void merge(int[] list1, int[] list2, int[] temp) {
		// 设置变量
		int current1 = 0;
		int current2 = 0;
		int current3 = 0;

		// 数组比大小，将小的依次放入temp
		while (current1 < list1.length && current2 < list2.length) {

			if (list1[current1] < list2[current2]) {
				temp[current3++] = list1[current1++];
			} else {
				temp[current3++] = list2[current2++];
			}

			// 判断数组是否有剩余，然后将剩余部分依次存储在temp
			while (current1 < list1.length) {
				temp[current3++] = list1[current1++];
			}

			while (current2 < list2.length) {
				temp[current3] = list2[current2++];
			}
		}
	}
}
