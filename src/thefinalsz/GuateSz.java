/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thefinalsz;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * @author Suzzanne Acevedo Morales 
 * 0909-21-10857
 */
public class GuateSz {
protected String depa;
protected int muni;    
protected String cab;

public GuateSz(String depa, int muni, String cab){
this.depa = depa;
this.muni= muni;
this.cab = cab;

}
Scanner num=new Scanner(System.in);
boolean salir = false; int n;

    GuateSz() {
        
    }
    ArrayList<GuateSz> lisGt = new ArrayList<GuateSz>();

public void regList (){

do{
    System.out.println("\n ");
    System.out.println("___________________________________________________________");
    System.out.println("           ☑ REGISTRO DE DATOS ☑          ");
    System.out.println("___________________________________________________________");
    System.out.print(">> Nombre de Departamento: "); depa = num.nextLine();
    System.out.print(">> Cantidad de Municipios: "); muni = num.nextInt(); num.nextLine();
    System.out.print(">> Cabecera Departamental: "); cab = num.nextLine();
    System.out.println("___________________________________________________________");   
    lisGt.add(new GuateSz(depa,muni,cab));
    System.out.println("\nDeseas realizar otro registro?\n> ❶ Si\n> ❷ No");
    n = num.nextInt(); num.nextLine();

}while(n==1);}

public String data (){
return"El Departamento: " + depa + " tiene "+ muni + " municipios y su cabecera es: "+cab;
}

public void lisVi (){
    System.out.println("la lista esta vacia? - "+lisGt.isEmpty());
    System.out.println("\n ");
    System.out.println("___________________________________________________________");
    System.out.println("           ☑ HISTORIAL DE REGISTROS ☑          ");
    System.out.println("___________________________________________________________");
    for (GuateSz e:lisGt)
    System.out.println(e.data());
    System.out.println("___________________________________________________________");
}

public void listCl (){
lisGt.clear();
JOptionPane.showMessageDialog(null, "       Borrando...");
System.out.println("La lista de registros esta vacia");
}

public void listSe (){
    System.out.println("___________________________________________________________");
    System.out.println("★ BUSQUEDA");
    System.out.println("Ingrese el nombre del Departamento que desee buscar");
    String num1 = num.nextLine();
    System.out.println("\n Resultado de su busqueda: ");
    lisGt.contains(num1);
}



}

