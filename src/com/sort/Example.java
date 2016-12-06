package com.sort;

@SuppressWarnings({"rawtypes","unchecked"})
public abstract class Example {

	public static void sort(Comparable[] a) {}
	
	/**
	 * �Ƚ�����Ԫ�صĴ�С
	 * @param v 
	 * @param w
	 * @return -1С�� 0���� 1����
	 */
	
	
	protected static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	/**
	 * ����������ָ��λ�õ�����Ԫ��
	 * @param a ����
	 * @param i λ��1
	 * @param j λ��2
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
