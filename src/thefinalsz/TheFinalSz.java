/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thefinalsz;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * @author Suzzanne Acevedo Morales 
 * 0909-21-10857
 */
public class TheFinalSz {

    public static void main(String[] args) {
        GuateSz gtLis=new GuateSz();
        VecSz vec=new VecSz();
        SecTxt mns=new SecTxt();

        Scanner num=new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "          Iniciando Proceso...."); mns.m1();
        int opc=num.nextInt(); boolean salir = false;
        //START.........
        switch(opc){
        case 1:
            gtLis.regList();
            do{
            mns.mL();
            opc=num.nextInt();
                switch(opc){
                case 1:
                  gtLis.lisVi(); break;
                case 2:
                  gtLis.listSe(); break;
                case 3:
                  gtLis.listCl(); break;
                case 4:
                salir=true;
                break; }}while(!salir);

        break;
        case 2:
            vec.inDat();
            do{
            mns.mV();
            opc=num.nextInt();
                switch(opc){
                case 1:
                    vec.mostrarHistorial(); break;
                case 2:
                break;
                case 3:
                break;
                case 4:
                salir=true;
                break; }}while(!salir);

        break;

        default:
        JOptionPane.showMessageDialog(null, "       Opcion invalida");
        break;
        }
        JOptionPane.showMessageDialog(null, ">>>   ⊝ Proceso Finalizado ⊝   <<<");
        JOptionPane.showMessageDialog(null, "          Profe Pongame 100!!\n                     ♥( ͡❛ ͜ʖ͡❛)✌");
}}
