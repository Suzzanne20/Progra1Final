/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thefinalsz;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * @author Suzzanne Acevedo Morales 
 * 0909-21-10857
 */
public class TheFinalSz {

    public static void main(String[] args) {
        LiSz li1=new LiSz();
        GuateSz vec=new GuateSz();
        SecTxt mns=new SecTxt();
        Scanner num=new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "          Iniciando Proceso....");
        mns.m1();
        int opc=num.nextInt();
        switch(opc){
        case 1:
            li1.inDat();
        break;
        case 2:
            mns.m2();
            int opc2=num.nextInt();
            switch(opc2){
                case 1:
                mns.mL();
                break;
                case 2:
                mns.mV();
                break;
                default:
                JOptionPane.showMessageDialog(null, "       Opcion invalida");
                break;}
        case 3:
        JOptionPane.showMessageDialog(null, ">>>   ⊝ Proceso Finalizado ⊝   <<<");
        break;
        default:
        JOptionPane.showMessageDialog(null, "       Opcion invalida");
        break;
        }
        JOptionPane.showMessageDialog(null, "          Profe Pongame 100!!\n                     ♥( ͡❛ ͜ʖ͡❛)✌");
}}
