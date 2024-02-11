package Pj;

import java.util.Scanner;

public class Item {
	private static String name[] = new String[10];
	private static String type[] = new String[10];
	private static int price[] = new int[10];
	private static int quantity[] = new int[10];
	private static String detail[] = new String[10];
	
	public static void setName(String n, int i) {
        name[i] = n;
    }
    public static void setType(String t, int i) {
    	type[i] = t;
    }
    public static void setPrice(int p, int i) {
        price[i] = p;
    }
    public static void setQuantity(int q, int i) {
        quantity[i] = q;
    }
    public static void setDetail(String d, int i) {
        detail[i] = d;
    }
    
    
    public static String getName(int i) {
        return name[i];
    }
    public static String getType(int i) {
        return type[i];
    }
    public static int getPrice(int i) {
        return price[i];
    }
    public static int getQuantity(int i) {
        return quantity[i];
    }
    public static String getDetail(int i) {
        return detail[i];
    }

}
