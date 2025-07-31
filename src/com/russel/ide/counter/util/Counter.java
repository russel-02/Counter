package com.russel.ide.counter.util;

public class Counter {
	  public int count (int x){
		  int sum = 0;
		  if (x <= 0 || x > 255) {
			    throw new RuntimeException("x should be between 1 and 255");
	  }
		  for (int i = 1; i <= x; i++) {
			    sum += i;
			}
			
		    return sum; //This will return sum value
		  }
}
