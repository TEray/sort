package com.sort;

@SuppressWarnings({"rawtypes","unchecked"})
public abstract class Example {

	public static void sort(Comparable[] a) {}
	
	/**
	 * 比较两个元素的大小
	 * @param v 
	 * @param w
	 * @return -1小于 0等于 1大于
	 */
	
	
	protected static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	/**
	 * 交换数组中指定位置的两个元素
	 * @param a 数组
	 * @param i 位置1
	 * @param j 位置2
	 */
	protected static void exch(Comparable<?>[] a, int i, int j) {
		Comparable<?> t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	protected static void show(Comparable<?>[] a) {
		for (int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
	}

	protected static boolean isSorted(Comparable<?>[] a) {
		for (int i = 1; i < a.length; i++)
			if (less(a[i], a[i - 1]))
				return false;
		return true;
	}
}
