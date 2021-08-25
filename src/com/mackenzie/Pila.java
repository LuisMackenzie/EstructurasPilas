package com.mackenzie;

import com.mackenzie.Model.URL;

public interface Pila {

    public abstract void apilar(URL url);

    public abstract void desapilar();

    public abstract URL obtener();

    public abstract int longitud();

    public abstract boolean vacia();

}
