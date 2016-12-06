package com.sort;

public class Selection extends Example {

	public static void sort(Comparable[] a) {
		int N = a.length; // 数组长度
		for (int i = 0; i < N; i++){ // 将a[i]和a[i+1..N]中最小的元素交换
			int min = i; // 最小元素的索引
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
