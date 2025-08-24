package com.example.demo;

public class Oneplus implements Mobiles{

    Color color;

    

    public Oneplus(Color colorobj) {
        this.color = colorobj;
    }

    @Override
    public void getModalAndColor(){
        System.out.println("Oneplus");

        color.getOnepluscolor();
    }
}
