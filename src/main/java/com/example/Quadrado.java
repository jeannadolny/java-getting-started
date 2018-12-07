package com.example;


public class Quadrado {
  public Quadrado(){
    
  }
	public static boolean compara(double i) {
		Double resultado = Math.sqrt(i);
		if (resultado != null) {
			return (resultado.intValue() == resultado.doubleValue());
		} else {
			return false;
		}
	}
}
