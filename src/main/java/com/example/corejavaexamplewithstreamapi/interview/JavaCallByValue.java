package com.example.corejavaexamplewithstreamapi.interview;

public class JavaCallByValue {

    public static void main(String[] args){
         Data f = new Data("f");
         changeReference(f); // It won't change the reference!
         modifyReference(f); // It will change the object that the reference variable "f" refers to!
    }
    public static void changeReference(Data a) {
         Data b = new Data("b");
         a = b;
         System.out.println(a.getValue());
    }
    public static void modifyReference(Data c) {
         c.setValue("c");
         
         System.out.println(c.getValue());
    }
    
    public static void changeReferenc(Data a) {
        System.out.println("Before Reference of a "+a);
        Data b = new Data("b");
        a = b;
        System.out.println("Reference of a "+a);
        System.out.println("Reference of b "+b);
    }

}


class Data{
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Data(String value) {
		super();
		this.value = value;
	}
	
}
