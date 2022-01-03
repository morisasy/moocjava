package com.duke;

public class PointDemo {

    private int x;
    private int y;

    public  PointDemo(int startx, int starty){
        x = startx;
        y = starty;
    }

    public int getX(){ return x;}
    public int getY(){return y;}

    public double distance(PointDemo otherPt){
        int dx = x - otherPt.getX();
        int dy = y - otherPt.getY();
        return Math.sqrt(dx * dx + dy*dy);
    }

    public static void main(String[] args) {
        PointDemo p1 = new PointDemo(3, 4);
        PointDemo p2 = new PointDemo(6, 8);
        System.out.println(p1.distance(p2));
    }
}
