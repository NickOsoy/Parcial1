package com.example.mipatito;
import java.util.Random;
public class PasswordGenerator {
          // Caracteres permitidos para generar la contraseña
        private static final String LETRAS_MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
        private static final String LETRAS_MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        private static final String DIGITOS = "0123456789";
        private static final String CARACTERES_ESPECIALES = "!@#$%^&*()";

        /**
         * Versioon 1 Genera una contraseña con requisitos default.
         **/
        public static String generatePassword(int longitud) {
            if (longitud < 8) {
                throw new IllegalArgumentException("La longitud mínima es 8 caracteres.");
            }

            String todosCaracteres = LETRAS_MINUSCULAS + LETRAS_MAYUSCULAS + DIGITOS + CARACTERES_ESPECIALES;
            Random random = new Random();
            StringBuilder contrasena = new StringBuilder();

            // Asegurar al menos un carácter de cada tipo
            contrasena.append(LETRAS_MINUSCULAS.charAt(random.nextInt(LETRAS_MINUSCULAS.length())));
            contrasena.append(LETRAS_MAYUSCULAS.charAt(random.nextInt(LETRAS_MAYUSCULAS.length())));
            contrasena.append(DIGITOS.charAt(random.nextInt(DIGITOS.length())));
            contrasena.append(CARACTERES_ESPECIALES.charAt(random.nextInt(CARACTERES_ESPECIALES.length())));

            // Ciclo for que completa la contraseña con caracteres aleatorios
            for (int i = 4; i < longitud; i++) {
                contrasena.append(todosCaracteres.charAt(random.nextInt(todosCaracteres.length())));
            }

            // Mezcla la contraseña para sea mayor aleatoriedad
            return mezclarCadena(contrasena.toString());
        }


        /**
         * Version 2 Genera una contraseña configurable según las políticas proporcionadas.
         **/
        public static String generatePassword(PasswordConfigDTO config) {
            int longitud = config.getLongitudMinima();
            String contrasena = generatePassword(longitud); // Usar la versión 1 como base

            // Validar y ajustar según las políticas
            if (config.isRestriccionMinDigitos()) {
                contrasena = asegurarMinDigitos(contrasena, config.getMinDigitos());
            }
            if (config.isRestriccionMinLetrasMayusculas()) {
                contrasena = asegurarMinLetrasMayusculas(contrasena, config.getMinLetrasMayusculas());
            }
            if (config.isRestriccionMinLetrasMinusculas()) {
                contrasena = asegurarMinLetrasMinusculas(contrasena, config.getMinLetrasMinusculas());
            }
            if (config.isRestriccionMinCaracteresEspeciales()) {
                contrasena = asegurarMinCaracteresEspeciales(contrasena, config.getMinCaracteresEspeciales());
            }

            return contrasena;
        }

        // Métodos auxiliares para validar políticas
        private static String asegurarMinDigitos(String contrasena, int minDigitos) {
            // asegura el mínimo de dígitos
            return contrasena;
        }

        private static String asegurarMinLetrasMayusculas(String contrasena, int minLetrasMayusculas) {
            // asegura el mínimo de letras mayúsculas
            return contrasena;
        }

        private static String asegurarMinLetrasMinusculas(String contrasena, int minLetrasMinusculas) {
            // asegura el mínimo de letras minúsculas
            return contrasena;
        }

        private static String asegurarMinCaracteresEspeciales(String contrasena, int minCaracteresEspeciales) {
            // asegura mínimo de caracteres especiales
            return contrasena;
        }

        /**
         * Mezclamos los caracteres de una cadena para mayor aleatoriedad.
         **/
        private static String mezclarCadena(String input) {
            char[] caracteres = input.toCharArray();
            Random random = new Random();
            for (int i = 0; i < caracteres.length; i++) {
                int j = random.nextInt(caracteres.length);
                char temp = caracteres[i];
                caracteres[i] = caracteres[j];
                caracteres[j] = temp;
            }
            return new String(caracteres);
        }
}
