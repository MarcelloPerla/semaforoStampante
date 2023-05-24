/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semaforostampante;

/**
 *
 * @author asunc
 */
public class Stampante {
    private String nome;

    public Stampante(String nome) {
        this.nome = nome;
    }
    
    public void Stampa(Dipendente d, int n){
        for(int i = 0; i < n; i++){
            System.out.println("PRINTED BY "+ d.getNome());
            System.out.println("foglio " + i+1);
        }
    }
}
