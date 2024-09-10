package org.example;
import static java.lang.Math.PI;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23 || !isBarking) return false;
        return clock < 8 || clock >= 20;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       if( firstAge <=19 && firstAge >=13)return true;
       if( secondAge <=19 && secondAge >=13)return true;
       if( thirdAge <=19 && thirdAge >=13)return true;
       return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int limit = isSummer ? 45:35;
        return  temp >= 25 && temp <= limit;
    }

    public static double area(double width, double height) {
       if (width < 0 || height <0 ){
           System.out.println("width or height cannot be less than zero!");
           return -1;
       }
       return width*height;
    }

    public static double area(double radius) {
        if (radius < 0 ){
            System.out.println("radius cannot be less than zero!");
            return -1;
        }
        return radius*radius*Math.PI;
    }
}
