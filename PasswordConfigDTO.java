package com.example.mipatito;

public class PasswordConfigDTO {
    private boolean restriccionMinDigitos;
    private int minDigitos;
    private boolean restriccionMinLetrasMayusculas;
    private int minLetrasMayusculas;
    private boolean restriccionMinLetrasMinusculas;
    private int minLetrasMinusculas;
    private boolean restriccionMinCaracteresEspeciales;
    private int minCaracteresEspeciales;
    private int longitudMinima;

    // Metodos Getters y Setters
    public boolean isRestriccionMinDigitos() {
        return restriccionMinDigitos;
    }

    public void setRestriccionMinDigitos(boolean restriccionMinDigitos) {
        this.restriccionMinDigitos = restriccionMinDigitos;
    }

    public int getMinDigitos() {
        return minDigitos;
    }

    public void setMinDigitos(int minDigitos) {
        this.minDigitos = minDigitos;
    }

    public boolean isRestriccionMinLetrasMayusculas() {
        return restriccionMinLetrasMayusculas;
    }

    public void setRestriccionMinLetrasMayusculas(boolean restriccionMinLetrasMayusculas) {
        this.restriccionMinLetrasMayusculas = restriccionMinLetrasMayusculas;
    }

    public int getMinLetrasMayusculas() {
        return minLetrasMayusculas;
    }

    public void setMinLetrasMayusculas(int minLetrasMayusculas) {
        this.minLetrasMayusculas = minLetrasMayusculas;
    }

    public boolean isRestriccionMinLetrasMinusculas() {
        return restriccionMinLetrasMinusculas;
    }

    public void setRestriccionMinLetrasMinusculas(boolean restriccionMinLetrasMinusculas) {
        this.restriccionMinLetrasMinusculas = restriccionMinLetrasMinusculas;
    }

    public int getMinLetrasMinusculas() {
        return minLetrasMinusculas;
    }

    public void setMinLetrasMinusculas(int minLetrasMinusculas) {
        this.minLetrasMinusculas = minLetrasMinusculas;
    }

    public boolean isRestriccionMinCaracteresEspeciales() {
        return restriccionMinCaracteresEspeciales;
    }

    public void setRestriccionMinCaracteresEspeciales(boolean restriccionMinCaracteresEspeciales) {
        this.restriccionMinCaracteresEspeciales = restriccionMinCaracteresEspeciales;
    }

    public int getMinCaracteresEspeciales() {
        return minCaracteresEspeciales;
    }

    public void setMinCaracteresEspeciales(int minCaracteresEspeciales) {
        this.minCaracteresEspeciales = minCaracteresEspeciales;
    }

    public int getLongitudMinima() {
        return longitudMinima;
    }

    public void setLongitudMinima(int longitudMinima) {
        this.longitudMinima = longitudMinima;
    }
}
