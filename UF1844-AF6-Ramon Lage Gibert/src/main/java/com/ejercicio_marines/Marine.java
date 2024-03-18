package com.ejercicio_marines;

public class Marine {

    private IWeapon arma;

    public void motivate(){
        System.out.println("El arma más mortífera del mundo es un Marine y su fusil!");
    }

    public void setWp(IWeapon arma){
        this.arma = arma;

    }

    public void useWp(){
        arma.shoot();
    }
    
}
