package com.example.android.taller2;

import android.view.View;

/**
 * Created by Redes on 10/10/2017.
 */

public class Metodos {
    public static double calcular(int sexo, int tipoZapato, int marca, int cant) {
        double  precio=0;
        

        if (   (sexo == 0) && (tipoZapato == 0) && (marca == 0)) {
            precio = 120000;
        } else if ((sexo == 0) && (tipoZapato == 0) && (marca == 1)) {
            precio = 140000;
        } else if ((sexo == 0) && (tipoZapato == 0) && (marca == 2)) {
            precio = 130000;
        } else if ((sexo == 0) && (tipoZapato == 1) && (marca == 0)) {
            precio = 50000;
        } else if ((sexo == 0) && (tipoZapato == 1) && (marca == 1)) {
            precio = 80000;
        } else if ((sexo== 0) && (tipoZapato == 1) && (marca == 2)) {
            precio = 100000;
        } else if ((sexo == 1) && (tipoZapato == 0) && (marca == 0)) {
            precio = 100000;
        } else if ((sexo == 1 && (tipoZapato == 0) && (marca == 1))) {
            precio = 130000;
        } else if ((sexo == 1 && (tipoZapato == 0) && (marca == 2))) {
            precio = 110000;
        } else if ((sexo == 1 && (tipoZapato == 1) && (marca == 0))) {
            precio = 60000;
        }else if ((sexo == 1 && (tipoZapato == 1) && (marca == 1))) {
            precio = 70000;
        }else if ((sexo == 1 && (tipoZapato == 1) && (marca == 2))) {
            precio = 120000;
        }
        return precio;

    }
}
