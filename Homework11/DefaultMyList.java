package Homework11;

import java.util.Arrays;

public class DefaultMyList implements MyList { 
	private Object[] list;
	private int size;
	private static final int capacity = 15;

	public DefaultMyList() {
		list = new Object[capacity];
		size = 0;
	}

	@Override
	public void add(Object e) {
		if (size == list.length) {
			int newSize = list.length + 15;
			list = Arrays.copyOf(list, newSize);
		}
		list[size++] = e;
	}

	@Override
	public void clear() {
		for (int i = 0; i < list.length; i++) {
			list[i] = null;
		}
		size = 0;
	}

	@Override
	public boolean remove(Object o) {
		int delete = IndexOf(list, o);

		if (delete == -1)
			return false;
		for (int i = delete; i < list.length - 1; i++) {
			list[i] = list[i + 1];

		}
		size--;
		return false;
	}

	private int IndexOf(Object[] arr, Object find) {
		int result = -1;

		for (int i = 0; i < size; i++) {
			if (arr[i].equals(find)) {
				result = i;
			}
		}
		return result;
	}

	@Override
	public Object[] toArray() {
		return Arrays.copyOf(list, size);
	}

	@Override
	public int size() {
		return size;
	}
	@Override
	public boolean contains(Object o) {
		boolean isObjekt = false;
		for (int i = 0; i < list.length; i++) {
			if (list[i] == o) {
				isObjekt = true;
			} else {
				isObjekt = false;
			}
		}
		return isObjekt;
	}

	@Override
	public boolean containsAll(MyList c) {
		boolean All = false;

		for (int i = 0; i < list.length; i++) {
			if (c != null) {
				if (c.contains(list[i])) {
					All = true;
				} else {
					All = false;
					break;
				}
			}
		}
		return All;
	}

}
