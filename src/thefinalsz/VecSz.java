/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thefinalsz;
import java.util.Scanner;
/**
 * @author Suzzanne Acevedo Morales 
 * 0909-21-10857
 */
public class VecSz extends GuateSz{
    protected int cnt, cnth;
    protected String[] vecHist;

   public VecSz(){

    vecHist=new String[100];//iniciar vector
    this.cnth=0;  }

    Scanner num=new Scanner(System.in);

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
        this.historial(depa,muni,cab);

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



}
