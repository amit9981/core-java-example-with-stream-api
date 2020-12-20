package com.example.corejavaexamplewithstreamapi.designpattern.strategy;

public class ColorMain {
    public static void main (String[] args) {
        final ColorAdaptor adaptor = new ColorAdaptor(new Green());
        final Color color = adaptor.getColor();
        color.props();
    }
}
