package com.hpe.cache.dymaniccache;

import org.junit.Test;

public class test{

	@Test
	public void testDynamic() 
	{
		DynamicCache DC = new DynamicCache(3);
		System.out.println("AddKey Testing : Added");
		DC.addCache(1, "piyush");
		DC.addCache(2, "sam");
		DC.addCache(3, "minu");
		asserEquals(1,"piyush", 0);
		asserEquals(2,"sam",0);
		asserEquals(3,"minu",0);
		System.out.println("GetKey Testing");
		System.out.println("added Key:" + DC.getCache(1));  
		System.out.println("added Key:" + DC.getCache(2));
		System.out.println("added Key:" + DC.getCache(3));
		DC.update(2, "diya");
		asserEquals(2,"diya", 0);
		System.out.println("updated key is:" +DC.getCache(2));
			
	}

	private void asserEquals(int i, String value, int j) {
		// TODO Auto-generated method stub
		
	}

}

	
