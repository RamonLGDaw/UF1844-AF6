package com.ejercicio_marines;

public class WeaponFactory {

    public static IWeapon crearArma(TipoArma arma) {
        if (arma == TipoArma.Gun) {
            return new Gun();
        } else if (arma == TipoArma.GunMachine) {
            return new GunMachine();
        } else if (arma == TipoArma.Rifle) {
            return new Rifle();
        }
        return null;
    }
}