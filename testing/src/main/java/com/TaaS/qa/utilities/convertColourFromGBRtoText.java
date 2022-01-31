package com.TaaS.qa.utilities;
import java.awt.Color;

public class convertColourFromGBRtoText 
{

/**
 * A class to get the Color value from a string color name
 */
	
	/*
public static class MyColor
{
  
  //static Color color;
  */
/*
 * 
 */

  /*
 public MyColor()
   {
    color = Color.white;
   }
   
   */
/**
 * Get the color from a string name
 * 
 * @param col name of the color
 * @return White if no color is given, otherwise the Color object
 */
  /*
public static Color getColor(String col) {
    switch (col.toLowerCase()) {
    case "rgb(0, 0, 0)":
        color = Color.BLACK;
        break;
    case "rgb(0, 0, 255)":
        color = Color.BLUE;
        break;
    case "rgb(0, 255, 255)":
        color = Color.CYAN;
        break;
    case "rgb(169, 169, 169)":
        color = Color.DARK_GRAY;
        break;
    case "rgb(128, 128, 128)":
        color = Color.GRAY;
        break;
    case "rgb(0, 128, 0)":
        color = Color.GREEN;
        break;

    case "rgb(255, 255, 0)":
        color = Color.YELLOW;
        break;
    case "rgb(211, 211, 211)":
        color = Color.LIGHT_GRAY;
        break;
    case "mrgb(255, 0, 255)":
        color = Color.MAGENTA;
        break;
    case "rgb(255, 165, 0)":
        color = Color.ORANGE;
        break;
    case "rgb(255, 192, 203)":
        color = Color.PINK;
        break;
    case "rgb(255, 0, 0)":
        color = Color.RED;
        break;
    case "	rgb(255, 255, 255)":
        color = Color.WHITE;
        break;
        }
	return Color.PINK;

    }*/
	
  
  public static String getColor(String col) 
  {
	   
		switch (col) {
	    case "rgba(0, 0, 0,1)":
	    	col= "BLACK";
	        break;
	    case "rgba(0, 0, 255,1)":
	    	col=  "BLUE";
	        break;
	    case "rgba(0, 255, 255,1)":
	        col = "CYAN";
	        break;
	    case "rgba(169, 169, 169,1)":
	        col = "DARK_GRAY";
	        break;
	    case "rgba(128, 128, 128,1)":
	        col = "GRAY";
	        break;
	    case "rgba(0, 128, 0,1)":
	        col = "GREEN";
	        break;

	    case "rgba(255, 255, 0,1)":
	        col = "YELLOW";
	        break;
	    case "rgba(211, 211, 211,1)":
	        col = "LIGHT_GRAY";
	        break;
	    case "mrgba(255, 0, 255,1)":
	        col = "MAGENTA";
	        break;
	    case "rgba(255, 165, 0,1)":
	        col = "ORANGE";
	        break;
	    case "rgba(255, 192, 203,1)":
	        col = "PINK";
	        break;
	    case "rgba(230, 0, 0, 1)":
	        col = "RED";
	        break;
	    case "rgba(255, 255, 255, 1)":
	    	return "WHITE";
	       
	        }
		return "colour not in the list";

	    }
		
}

