/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semaforostampante;

/**
 *
 * @author asunc
 */
public class Dipendente extends Thread{
    private String nome;
    private Stampante stampante;
    private Semaforo semaforo;

    public Dipendente(String nome, Stampante stampante, Semaforo semaforo) {
        this.nome = nome;
        this.stampante = stampante;
        this.semaforo = semaforo;
    }

    public String getNome() {
        return nome;
    }

    public Stampante getStampante() {
        return stampante;
    }

    public Semaforo getSemaforo() {
        return semaforo;
    }
    
    @Override
    public void run(){
        int nfogli = (int)((Math.random() * 3) + 1);
        System.out.println(nome + " ha iniziato a lavorare.");
        try{
            Thread.sleep(1000 * ((int)((Math.random() * 3) + 1)));
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        semaforo.P();
        System.out.println(nome + " deve stampare " + nfogli + " fogli");
        stampante.Stampa(this, nfogli);
        System.out.println(nome + " ha finito");
        semaforo.V();
    }
}
