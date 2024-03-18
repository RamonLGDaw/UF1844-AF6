package com.ejercicio_marines;

public class MiraTelescopica extends WeaponDecorator {

    public MiraTelescopica(IWeapon arma) {
        super(arma);
    }

    public void shoot(){
        super.shoot();
        System.out.println("Se ha incorporado la mira telescópica");
    }
    
}
