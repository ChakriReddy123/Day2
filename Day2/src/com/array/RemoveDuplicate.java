package com.array;
import java.util.*;
public class RemoveDuplicate {

	static void removeDuplicates(int arr[]) {
		TreeSet<Integer> ss= new TreeSet<Integer>();
		for(int a:arr) {
			ss.add(a);
		}
		int count=0;
		for(Integer i:ss) {
			arr[count++]=i;
			
		}
		for(int i=0;i<count;i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	public static void main(String[] args) {
		int arr[]= {2,32,12,45,64,23,3,4,5,1,4};
		removeDuplicates(arr);
		
	}

}
