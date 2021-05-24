package com.linedistance;

 class DistanceOfLine {

    public int x1, x2 , y1 , y2;

    public DistanceOfLine(int x1, int x2, int y1, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;

    }
    public double calculateDistanceOfLine(){
        double distanceLine =Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        return distanceLine;
    }
}
