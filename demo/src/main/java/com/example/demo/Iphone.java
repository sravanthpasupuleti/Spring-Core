package com.example.demo;

public class Iphone implements Mobiles{

    Color color;

    public Iphone(Color colorobj){
        this.color = colorobj;
    }

    @Override
    public void getModalAndColor(){
        System.out.println("iphone");

        color.getIphonecolor();
    }
}
