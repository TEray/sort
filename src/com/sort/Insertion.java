package com.sort;

public class Insertion extends Example {

	public static void sort(Comparable[] a) { // ��a[]����������
		int N = a.length;
		for (int i = 1; i < N; i++) { // �� a[i] ���뵽 a[i-1]��a[i-2]��a[i-3]...֮��
			for (int j = i; j > 0 && less(a[j], a[j - 1]); j--)
				exch(a, j, j - 1);
		}
	}
	
	public static void main(String[] args) {
		String a[] = {"d","s","f","f","r","h","l","b","k","e","q","v","c"};
		sort(a);
		assert isSorted(a);
		show(a);
	}
}
