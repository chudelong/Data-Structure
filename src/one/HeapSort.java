package one;

/**
 * 实现堆的实现代码，然后稍加修改输出。得到想要的排序结果
 * @author cdl
 *
 */
public class HeapSort {

	/**
	 * 对排序方法
	 * @param list
	 */
	public static <E extends Comparable<E>> void heapSort(E[] list){
		Heap<E> heap = new Heap<>();
		
		for(int i = 0; i < list.length; i++) {
			heap.add(list[i]);
		}
		
		for(int i = list.length - 1; i >= 0; i--) {
			list[i] = heap.remove();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] list = {3,4,1,0,-1,7};
		heapSort(list);
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}

}
