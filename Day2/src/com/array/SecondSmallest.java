package com.array;

public class SecondSmallest {

	int getSecondSmallest(int arr[]) {
		int a=arr[0],ssmal=Integer.MAX_VALUE;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<a) 
			{
				ssmal=a;
				a=arr[i];
			}
			else if(arr[i]!=a && arr[i]<ssmal) {
				 ssmal=arr[i];
			}
		}
		return ssmal;
	}
	public static void main(String[] args) {
		
			int arr[]= {15,1,3,7,9,10,43};
			SecondSmallest ss=new SecondSmallest();
			int res=ss.getSecondSmallest(arr);
			System.out.println(res);
	}

}
