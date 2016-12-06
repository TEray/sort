package com.sort;

public class Selection extends Example {

	public static void sort(Comparable[] a) {
		int N = a.length; // ���鳤��
		for (int i = 0; i < N; i++){ // ��a[i]��a[i+1..N]����С��Ԫ�ؽ���
			int min = i; // ��СԪ�ص�����
			for (int j = i+1; j < N; j++){
				if (less(a[j], a[min])){ 
					min = j;
				}
			}
			exch(a, i, min);
		}
	}
	
	public static void main(String[] args) {
		
		String a[] = {"d","s","f","f","r","h","l","b","k","e","q","v","c"};
		sort(a);
		assert isSorted(a);
		show(a);
	}
}
