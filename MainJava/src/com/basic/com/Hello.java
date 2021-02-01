package com.basic.com;

public class Hello {
	
	public static void main(String[] args) {
		
		
		
		int a[]= {1,2,3,4,5};
		for (int i = 0; i < a.length; i++) {
			if(a[i]==5)
			{
				System.out.println(a[i]);
				if(a[i]<=a[4]) {
					for (int k : a) {
						if(k==5)
							break;
						System.out.println(k);
					}
				}
			
			}
			
			
		}
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}}