package com.test;

public class Subtrator {
    private int diferenca;

    public Subtrator(){
        this.diferenca = 0;
    }

    public int getDiferenca() {
        return diferenca;
    }

    public int calcula(int op1,int op2){
        int aux = op2;
        diferenca = op1;
        while(aux>0){
            diferenca--;
            aux--;
        }
        return diferenca;
    }
}
