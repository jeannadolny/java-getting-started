package com.example;


public class Quadrado {
  public Quadrado(){
    
  }
	public static boolean compara(double i) {
		double resultado = Math.sqrt(i);
		if (resultado != null) {
			return (resultado.intValue() == resultado.doubleValue());
		} else {
			return false;
		}
	}
}
