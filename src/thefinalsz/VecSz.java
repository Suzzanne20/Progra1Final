/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thefinalsz;


import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author Suzzanne Acevedo Morales 
 * 0909-21-10857
 */
public class VecSz extends GuateSz{
    protected int cnt, cnth;
    protected String[] vecHist;
    protected String[] vecBus;
    String suss, nDepa;



    public VecSz(){
    nDepa="";
    vecHist=new String[50];//iniciar vector
    vecBus=new String[10];//Vector Busqueda
    this.cnth=0;  }
    

    public String getnDepa() {
        return nDepa;
    }

    public void setnDepa(String n) {
        this.nDepa = n;
    }



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
        vecBus[i]=depa;
}}

//Historial................
protected void historial(String n1,int n2,String n3){
cnth=cnth+1;
vecHist[cnth]="--> Departamento:  "+n1+"   tiene "+n2+" municipios   y su Cabecera es: "+n3;

}

protected void mostrarHistorial(){

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
protected void busqueda(String n1){
cnth=cnth+1;
vecBus[cnth]="--> Departamento:  "+n1;
}

protected void busView(){

try{
    System.out.println(vecBus.length);
    for(int i=1; i<vecBus.length;i++){
        if (!vecBus[i].isEmpty()){
           System.out.println(vecBus[i]);
        }       
    }
}catch(Exception e){
    System.out.println(e.getMessage());
        }

    } 


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



}

