/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thefinalsz;

import java.util.Arrays;
import java.util.Scanner;


/**
 * @author Suzzanne Acevedo Morales 
 * 0909-21-10857
 */
public class VecSz extends GuateSz{
    protected int cnt, cnth;
    protected String[] vecHist;
    protected String[] vecBus;
    //protected char[] vecBusc;
    protected int[] vecBusp; 
    String suss;
    String let;

    public VecSz(){
    vecHist=new String[50];//iniciar vector
    vecBus=new String[6];//Vector Busqueda
    //vecBusc=new char[10];//Vector Letra inicial
    vecBusp=new int[10];//Vector cnt muni
    this.cnth=0;  }  

    Scanner num=new Scanner(System.in);

public void inDat (){
    System.out.println("Cuantos registros desea realizar?");
    cnt=num.nextInt();
    num.nextLine();//buffer
    int j = 0;
    for (int b = 0; b < 50; ++b){System.out.println();} 
    System.out.println("___________________________________________________________");
    System.out.println("           ☑ REGISTRO DE DATOS ☑          ");
    System.out.println("___________________________________________________________");
    for(int i=0;i<cnt;i++){
        System.out.print("\nREGISTRO #"+(i+1)+"\n"+"\n>> Nombre de Departamento: "); depa = num.nextLine();
        System.out.print(">> Cantidad de Municipios: "); muni = num.nextInt(); num.nextLine();
        System.out.print(">> Cabecera Departamental: "); cab = num.nextLine();
        System.out.println("___________________________________________________________");
        this.historial(depa,muni,cab);
        vecBus[i]=depa;   vecBusp[i]=muni;
        
        /*char vecBusc[] = new char[depa.length()];
        for(i = 0; i < depa.length(); i++){
            vecBusc[i] = depa.charAt(i);
        }*/
}}
//Historial...................................
protected void historial(String n1,int n2,String n3){
cnth=cnth+1;
vecHist[cnth]="--> Departamento:  "+n1+"   tiene "+n2+" municipios   y su Cabecera es: "+n3;

}

protected void vmos(){

try{
    System.out.println(vecHist.length);
    for(int i=1; i<vecHist.length;i++){
        if (!vecHist[i].isEmpty()){
           System.out.println(vecHist[i]);
        }       
    }
}catch(Exception e){
    System.out.println(e.getMessage());
        }

    } 
//Vector de Captura de Busqueda................
public void vecSe (){
    int pos = -1;
    System.out.println("___________________________________________________________");
    System.out.println("★ BUSQUEDA");
    System.out.println("Ingrese el nombre del Departamento que desee buscar");
    suss = num.nextLine();

    //System.out.println("\n Resultado de su busqueda: ");
    for(int i=0;i<vecBus.length;i++){
        if(vecBus[i] == null ? (suss) == null : vecBus[i].equals(suss)){
        pos=i;
        }
    }
    if(pos==-1){System.out.println("Aun no ah sido registrado." + pos);
    }else{System.err.println("ya fue registrado, en la posicion: "+pos);}

    System.out.println("___________________________________________________________");
    }
//vector de Busqueda por inicial............... A;DLFKJAS;LFJAS;FL
public void vecBl (){
    int pos = -1;
    System.out.println("___________________________________________________________");
    System.out.println("★ BUSQUEDA");
    System.out.println("Ingrese el nombre del Departamento que desee buscar");
    suss = num.nextLine();  
    

    System.out.println("___________________________________________________________");
    }
//vector de pares...............
public void vecBp (){
    System.out.println("___________________________________________________________");
    System.out.println("      ☑ REGISTROS PARES CON MUNICIPIOS MAYORES DE 4 ☑          "); //
    System.out.println("___________________________________________________________");
         for(int i=0; i<10;i++)
        {  
            if(i%2==0) //VERIFICAMOS SI LA POCISION i ES PAR O NO.
             if(vecBusp[i]>4){
              System.out.println(vecBus[i]);   
            }
             
            }
        


    }
        
    


}

