package com.company;

public class Main {

    public static void main(String[] args) {
	Car car = new Car();
        car.model = "Porsche";
        car.color = "white";
        car.value = 5.5;
        car.speed = 115;
        System.out.println("Mashinanyn modeli: "+car.model+"\n"+"Mashinanyn tusu: "+car.color+"\n"+"Mashinanyn kolomu: "+car.value+"\n"+"Mashinanyn yldamdygy: "+car.speed);
car.uslovia();
    }
}
