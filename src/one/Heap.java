package one;

import java.util.ArrayList;

/**
 * Heap ʵ�ֶ�����һ���ڵ��ɾ�����ڵ�
 * 
 * @author cdl
 *
 */
public class Heap<E extends Comparable<E>> {
	private ArrayList<E> list = new ArrayList<>();

	public Heap() {

	}

	/**
	 * ��objects�����д���һ����
	 * 
	 * @param objects
	 */
	public Heap(E[] objects) {
		for (int i = 0; i < objects.length; i++) {
			add(objects[i]);
		}
	}

	/**
	 * ����Ԫ�ص�����
	 * 
	 * @param newObject
	 */
	public void add(E newObject) {
		list.add(newObject); // ����Ԫ�ص�����
		int currentIndex = list.size() - 1; // ���һ���ڵ�

		while (currentIndex > 0) {// currentIndex > 0 ���Ƹ��ӽڵ�ѭ��
			int parentIndex = (currentIndex - 1) / 2;

			// ���currentIndex����Ԫ�� > parentIndex����Ԫ�أ����ཻ��
			if (list.get(currentIndex).compareTo(list.get(parentIndex)) > 0) {
				E temp = list.get(currentIndex);
				list.set(currentIndex, list.get(parentIndex));
				list.set(parentIndex, temp);
			} else
				break; // ���ѳɶ�

			currentIndex = parentIndex;
		}
	}

	/**
	 * ע����ͣ��
	 * 
	 * ɾ���Ѹ��ڵ�
	 * ʵ��˼�룺
	 * 1.ɾ�����ڵ�
	 * 2.�����һ���ڵ��滻���ڵ�
	 * 3.���¹�����������ֶѵ�����
	 * @return
	 */
	public E remove() {
		if(list.size() == 0) {
			return null;
		}
		
		E removedObject = list.get(0);
		
		list.set(0, list.get(list.size() - 1)); //�����һ���ڵ��滻���ڵ�
		list.remove(list.size() - 1); //ɾ�����һ���ڵ�
		
		int currentIndex = 0;
		while(currentIndex < list.size()) {
			int leftChildIndex = 2 * currentIndex + 1;
			int rightChildIndex = 2* currentIndex + 2;
			
			// �������ӽڵ��ҵ����Ľڵ�
			if(leftChildIndex >= list.size()) {
				break; 
			}
			int maxIndex = leftChildIndex;
		}
		return removedObject;
	}
}
























