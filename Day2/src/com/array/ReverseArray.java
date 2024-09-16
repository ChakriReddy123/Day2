package com.array;
import java.util.*;
public class ReverseArray {

	void getSorted(int arr[]) {
		
		for(int k=0;k<arr.length;k++) {
			String s=String.valueOf(arr[k]);
			String reversedStr = new StringBuilder(s).reverse().toString();
			arr[k]=Integer.parseInt(reversedStr);
		}
		Arrays.sort(arr);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {35,4,57,1,81,9};
		ReverseArray ra=new ReverseArray();
		ra.getSorted(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
