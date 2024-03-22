/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2labp2_linsyposso;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author 29164
 */
public class HiloCrono extends Thread{
    private JLabel cronometro;

    public HiloCrono(JLabel hora) {
        //this.cronometro = cronometro;
    }


    public void run() {
    while (true) {
            Date h = new Date();
            DateFormat f = new SimpleDateFormat("mm:ss");
//            cronometro.setText(f.format(h));
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {

            }
        }
    }
}



