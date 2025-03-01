package com.example.mipatito;

public class Main {
    public static void main(String[] args) {
        // Gemerador de contraseña versión 1
        String contrasenaVers1= PasswordGenerator.generatePassword(9);
        System.out.println("Contaseña Version 1: " + contrasenaVers1);

        // Generador de contraseña versión 2
        PasswordConfigDTO config = new PasswordConfigDTO();
        config.setRestriccionMinDigitos(true);   // Activa la restricción de dígitos
        config.setMinDigitos(4); // Establecer el mínimo
        config.setRestriccionMinLetrasMayusculas(true);
        config.setMinLetrasMayusculas(3);
        config.setRestriccionMinLetrasMinusculas(true);
        config.setMinLetrasMinusculas(1);
        config.setRestriccionMinCaracteresEspeciales(true);
        config.setMinCaracteresEspeciales(5);
        config.setLongitudMinima(15);  // longitud de la contraseña

        String contrasenaVers2 = PasswordGenerator.generatePassword(config);
        System.out.println("Contraseña Version 2: " + contrasenaVers2);
    }
}
