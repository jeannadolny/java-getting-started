package com.example;


public class Quadrado {
  public Quadrado(){
    
  }
	public static boolean quadrado(double i) {
		Double resultado = Math.sqrt(i);
		if (resultado != null) {
			return (resultado.intValue() == resultado.doubleValue());
		} else {
			return false;
		}
	}
}