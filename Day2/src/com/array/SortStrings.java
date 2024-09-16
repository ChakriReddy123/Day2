package com.array;

public class SortStrings {
	
	void sortStrings(String ss[]) {
		for(int i=0;i<ss.length;i++) {
			for(int j=i+1;j<ss.length;j++) {
				if(ss[i].compareTo(ss[j])>0) {
					String t=ss[i];
					ss[i]=ss[j];
					ss[j]=t;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss[]= {"Chakri","Hemanth","Pavan","Prathik","Parthik"};
		SortStrings s=new SortStrings();
		s.sortStrings(ss);
		int n=0;
		int k=(	ss.length/2)+1;
		for(String name:ss) {
			n++;
			if(n<=k) {
			System.out.println(name.toUpperCase());
			}
			else {
			System.out.println(name);
			}
		}
		
	}

}
