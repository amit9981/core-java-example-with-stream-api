package com.example.corejavaexamplewithstreamapi.enums;

public class MyEnum {

    private PizzaStatus status;

    public PizzaStatus getStatus ( ) {
        return status;
    }

    public enum PizzaStatus {
        ORDERED,
        READY,
        DELIVERED;
    }

    public enum Status {
        ORDERED("sdg"),
        READY(""),
        DELIVERED("name");

        private String url;

        Status (String url) {
            this.url = url;
        }

        public String url ( ) {
            return url;
        }

    }

    public static void main (String[] args) {
        PizzaStatus[] values = PizzaStatus.values();
        for (PizzaStatus statuss : values) {
            System.out.println(statuss);
        }

        Status[] values1 = Status.values();
        System.out.println("----------------------------------------------");
        for (Status s : values1) {
            System.out.println(s.url());
        }

    }
}
