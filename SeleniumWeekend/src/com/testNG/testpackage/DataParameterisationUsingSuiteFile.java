package com.testNG.testpackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataParameterisationUsingSuiteFile {
	@Parameters({"city","area"})
	@Test
	public void testParameter(String city,String area){
		System.out.println("City is "+city+"\n Area is:"+area);
		
	}

}
