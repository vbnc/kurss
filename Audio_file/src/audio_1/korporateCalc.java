﻿/**
* указываем на то, что класс принадлежит пакету 
*/
package Calc;

/**
* описываем класс дл¤ расчЄта объЄма видеопам¤ти 
*/
public class korporateCalc {
/**
* —оздаем метод дл¤ расчЄта пам¤ти дл¤ корпоративных клиентов 
*/
	public String getP(int t, int k, int d, double f){ 
		/**
*переменна¤, котора¤ будет возвращена в методе 
*/
		double V = 0; 
		/**
* »ницилизаци¤ перемнной строкового типа дл¤ вывода результата 
*/
		String str;
		
		/**
* формула дл¤ расчЄта объЄма видеопам¤ти 
*/
		V = (f*t*d*k)/1024 ;
		
		/**
*ќкругление до сотых 
*/
		V = V * 100; 
		
		/**
* ќкругление до сотых 
*/
		int i = (int) Math.round(V); 
	 
		/**
*ќкругление до сотых 
*/
		V = (double)i / 100; 
		 /**
*  онвертирование ежемес¤черно платежа из типа double в String (дл¤ вывода) 
*/
			str = Double.toString(V); 
		/**
* возвращаем методу результат 
*/
		return str; 
	}
}
