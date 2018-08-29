package one;

/**
 * 堆排序的基本思想是：将待排序序列构造成一个大顶堆，
 * 此时，整个序列的最大值就是堆顶的根节点。
 * 将其与末尾元素进行交换，此时末尾就为最大值。然后将剩余n-1个元素重新构造成一个堆，这样会得到n个元素的次小值。
 * 如此反复执行，便能得到一个有序序列了
 * 
 * @author cdl
 *
 */
public class HeapSort {

	/**
	 * 对排序方法
	 * 
	 * @param list
	 */
	public static <E extends Comparable<E>> void heapSort(E[] list) {
		Heap<E> heap = new Heap<>();

		for (int i = 0; i < list.length; i++) {
			heap.add(list[i]);
		}

		for (int i = list.length - 1; i >= 0; i--) {
			list[i] = heap.remove();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] list = { 3, 4, 1, 0, -1, 7 };
		heapSort(list);
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}

}
