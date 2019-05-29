package com.testNG.testpackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	//create your own databank
	@DataProvider
	public Object[ ][ ] dataBank(){
		Object[] [] data = new Object[2][2];
		data[0][0]="admin1";
		data[0][1]="manager1";
		data[1][0]="admin2";
		data[1][1]="manager2";
		return data;
		
	}
	//utilise the data
	@Test(dataProvider="dataBank")
	public void utiliseData(String un,String pwd){
		System.out.println(un +" : "+ pwd);
	}

}
