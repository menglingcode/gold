package com.sxt;

import java.awt.*;

public class Rock extends Object {
    Rock(){
        this.x=(int)(Math.random()*700);
        this.y=(int)(Math.random()*550+300);
        this.width=71;
        this.height=71;
        this.flag=false;
        this.m=50;
        this.count=1;
        this.type=2;
        this.img = Toolkit.getDefaultToolkit().getImage("Imgs/rock1.png");
    }
}
