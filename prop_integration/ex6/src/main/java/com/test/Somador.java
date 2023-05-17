package com.test;

public class Somador {
    private int soma;

    public Somador(){
        this.soma = 0;
    }

    public int getSoma() {
        return soma;
    }

    public int calcula(int op1,int op2){
        int aux = op2;
        soma = op1;
        while(aux>0){
            soma++;
            aux--;
        }
        return soma;
    }
}
