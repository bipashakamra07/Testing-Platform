package com.ListMethods.Libtest;
import java.util.List;
public class ListMethods{
	
	public boolean ArrayListTest(List<String> l1) {
		boolean l3=l1.contains("pune");
		return l3;
	}


public Object[] ConvertListToArray(List <Integer> ListTestData) {
	Object arr[] = ListTestData.toArray();
	return arr;
}
}