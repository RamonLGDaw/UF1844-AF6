package com.ejercicio_marines;

public class War {
    public static void main(String[] args) {
       Marine marine1 = new Marine();
       marine1.motivate();
       marine1.setWp(new Gun());
       marine1.useWp();

       System.out.println("\n******Segunda parte ejercicio, implementar el patrón factory********\n");
       marine1.setWp(WeaponFactory.crearArma(TipoArma.GunMachine));
       marine1.useWp();

       System.out.println("\n******Segunda parte ejercicio, implementar el patrón Decorator********\n");
       System.out.println("\nPrueba marine2 con gunMachine y mira telescópica.");
       Marine marine2 = new Marine();
       marine2.setWp(new Silencer(WeaponFactory.crearArma(TipoArma.GunMachine)));
       marine2.useWp();
       System.out.println("\nPrueba marine1 con Rifle, mira telescópica y silenciador.");
       marine1.setWp(new MiraTelescopica(new Silencer(WeaponFactory.crearArma(TipoArma.Rifle))));
       marine1.useWp();
    }
}