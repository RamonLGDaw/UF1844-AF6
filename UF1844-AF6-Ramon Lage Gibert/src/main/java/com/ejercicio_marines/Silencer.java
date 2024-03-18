package com.ejercicio_marines;

public class Silencer extends WeaponDecorator {

    public Silencer(IWeapon arma) {
        super(arma);
        
    }

    public void shoot(){
        super.shoot();
        System.out.println("Silenciador incorporado");
    }
    
}
