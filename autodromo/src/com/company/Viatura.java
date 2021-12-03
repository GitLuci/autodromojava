package com.company;

import java.util.Random;

public class Viatura {
    private String _modelo;
    private int _Velocidade;

    public Viatura(String modelo){
    this._modelo=modelo;
}

    public String get_modelo() {
        return _modelo;
    }

    public int get_Velocidade() {
        return _Velocidade;
    }

    public void set_Velocidade(int velocidade) {
        if(velocidade >=0)this._Velocidade = velocidade;
        this._Velocidade = velocidade;
    }

    public void ver(){
        System.out.println("---------------("+ this._modelo + ")-----------------");
        System.out.println("                  Velocidade: " + this._Velocidade);
        System.out.println("---------------------------------------------------");
    }

    public void acelera(){
        Random r = new Random();
        set_Velocidade(r.nextInt(200));
    }
}

