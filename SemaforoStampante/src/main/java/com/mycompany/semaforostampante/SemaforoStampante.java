/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semaforostampante;

/**
 *
 * @author asunc
 */
public class SemaforoStampante {

    public static void main(String[] args) throws InterruptedException {
        Semaforo semaforo = new Semaforo(1);
        Stampante stampante = new Stampante("Cina");
        
        Dipendente d1 = new Dipendente("Xie",stampante, semaforo);
        Dipendente d2 = new Dipendente("Pan",stampante, semaforo);
        Dipendente d3 = new Dipendente("Lin",stampante, semaforo);
        Dipendente d4 = new Dipendente("Tao",stampante, semaforo);
        Dipendente d5 = new Dipendente("Wang",stampante, semaforo);
        
        d1.start();
        d2.start();
        d3.start();
        d4.start();
        d5.start();
        
        d1.join();
        d2.join();
        d3.join();
        d4.join();
        d5.join();
    }
}
