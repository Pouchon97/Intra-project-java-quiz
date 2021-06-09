package com.quiz;

public class CategoriesOfquestion {
	
	public  String[][] getConnaissanceGenerale(){
		String[][] data= {
				{"France","Paris"},{"République dominicaine","Santiago"},
				{"Allemagne","Berlin"},{"Espagne","Madrid"},
//				{"Alemagne","Berlin"},{"Italie","Rome"},
//				{"Canada","Otawa"},{"Argentine","Argentina"},
//				{"Brazil","Brazilia"},{"Bolivie","Bolivia"}
		};
		return data;
  }
	
	public static String[][] getCatMath(){
		String[][] data= {
				{"4*5","20"},{"200+100","300"},
				{"30-10","20"},{"200/10","20"},
//				{"2-2","0"},{"3-2","1"},
//				{"4/2","2"},{"16/8","8"},
//				{"8*2","16"},{"2*3","6"}
		};
		return data;
  }
}
