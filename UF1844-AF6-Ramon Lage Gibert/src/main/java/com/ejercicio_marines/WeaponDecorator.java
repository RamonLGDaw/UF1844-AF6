package com.ejercicio_marines;

public abstract class WeaponDecorator implements IWeapon {

    protected IWeapon arma;

    public WeaponDecorator(IWeapon arma) {
        this.arma = arma;
    }

    @Override
    public void shoot() {
        arma.shoot();
    }
    
}
