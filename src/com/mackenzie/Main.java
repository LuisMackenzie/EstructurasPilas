package com.mackenzie;

import com.mackenzie.Model.URL;

public class Main {

    public static void main(String[] args) {

        URL google = new URL("https://www.google.es/");
        URL firebase = new URL("https://firebase.google.com/");
        URL mackenzie = new URL("https://luisbaez.tk/");

        Pila pila = new MiPila();
        imprimirEstado(pila);
        pila.apilar(google);
        imprimirEstado(pila);
        pila.apilar(firebase);
        imprimirEstado(pila);
        pila.apilar(mackenzie);
        imprimirEstado(pila);
        while (!pila.vacia()) {
            pila.desapilar();
            imprimirEstado(pila);
        }

    }

    private static void imprimirEstado(Pila pila) {
        if (pila.vacia()) {
            System.out.println("L = 0. No hay nada en la pila");
        } else {
            System.out.println("L = " + pila.longitud() + " " + pila.obtener().getUrl());
        }
    }

}
