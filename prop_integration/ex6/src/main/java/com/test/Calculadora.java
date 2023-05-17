package com.test;

public class Calculadora {
    private static final String regEx = "(?<=\\+)|(?=\\+)|(?<=\\-)|(?=\\-)";
    private Somador somador;
    private Subtrator subtrator;
    private int resultado;

    
    public Calculadora(Somador som, Subtrator sub) {
        somador = som;
        subtrator = sub;
        resultado = 0;
    }
    
    public int getResultado() {
        return resultado;
    }

    // Por simplicidade as expressoes começam sempre por um numero positivo
    // e todos os operadores são binarios
    public int calcula(String expressao) {
        resultado = 0;

        String tokens[] = expressao.split(regEx);

        // Soma o primeiro valor
        int op1 = resultado;
        int op2 = Integer.parseInt(tokens[0]);
        resultado = somador.calcula(op1,op2);
        System.out.println(op1+"+"+op2+"="+resultado);

        // Pega os operadores seguintes e vai calculando
        int pos = 1;
        while(pos < tokens.length){
            String operando = tokens[pos];
            pos++;
            op1 = resultado;
            op2 = Integer.parseInt(tokens[pos]);
            System.out.println(op2);
            pos++;
            switch(operando){
                case "+":
                    resultado = somador.calcula(op1,op2);
                    break;
                case "-":
                    resultado = subtrator.calcula(op1,op2);
                    break;
                default:
                    throw new IllegalArgumentException("Operador invalido");
            }
        }
        return resultado;
    }
}