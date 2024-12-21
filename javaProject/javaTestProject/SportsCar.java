package javaTestProject;

public class SportsCar extends Car{
    public SportsCar(){}
    public void speedUp(){
        speed +=2;
    }
    public void speedDown(){
        speed -=1;
        if(speed<0) speed=0;
    }
}