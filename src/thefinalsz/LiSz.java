/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thefinalsz;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author susan
 */
public class LiSz extends GuateSz{
    protected int cnt;
    protected int lisgt[];
    Scanner num=new Scanner(System.in);
    GuateSz gtSz[]=new GuateSz[24];
public void inDat (){
    System.out.println("Cuantos registros desea realizar?");
    cnt=num.nextInt();
    num.nextLine();//buffer
    for (int b = 0; b < 50; ++b){System.out.println();} 
    System.out.println("___________________________________________________________");
    System.out.println("           ☑ REGISTRO DE DATOS ☑          ");
    System.out.println("___________________________________________________________");
    for(int i=0;i<cnt;i++){
        System.out.print("\nREGISTRO #"+(i+1)+"\n"+"\n>> Nombre de Departamento: "); depa = num.nextLine();
        System.out.print(">> Cantidad de Municipios: "); muni = num.nextInt(); num.nextLine();
        System.out.print(">> Cabecera Departamental: "); cab = num.nextLine();
    System.out.println("___________________________________________________________");
        //this.historial(depa,muni,cab);}

}}

public void chapilist (){


}




}
