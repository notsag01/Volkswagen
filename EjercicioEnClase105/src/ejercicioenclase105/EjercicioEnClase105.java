
package ejercicioenclase105;

import java.util.Date;
import java.util.Scanner;


public class EjercicioEnClase105 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /**Vende solo de la marca XXX tres modelos (buscar que hay en el mercado hoy) en promoción, cada uno con sus gamas básico, medio y alto.
El vendedor debería :
- Ingresar el nombre del vendedor
-Ingresar el nombre del cliente , dni y teléfono.*/
        Date fecha= new Date();
        System.out.printf("%s %tB %<te, %<tY", "", fecha);        
       
       String vendedor ="";
       String cliente ="";
       int dni=0;
       long telefono =0;
       String autoSeleccionado="";
       String gamaSeleccionada="";
       String planSeleccionado="";
       int precioLista=0;
       int precioFinal=0;
       int numeroCuotas=0;
       int cuotas=0;
       float alicuota=0;
       int cuotaMensual=0;
       String entregaAuto="";
       String dominioAutoUsado="";
       
       //ingresando los datos
       
       System.out.println(" Concesionaria Volkswagen-EL Alemán");
       System.out.println("\n");
       
       //pidiendo datos de contacto
        System.out.print("Por favor ingresa tu nombre: ");
            Scanner nom = new Scanner(System.in);
                vendedor = nom.next();
                
         System.out.print("Por favor ingresa nombre del cliente: ");
            Scanner clien = new Scanner(System.in);
                cliente = clien.nextLine();


        System.out.print("Ingresa DNI sin puntos: ");
            Scanner dn = new Scanner(System.in);
                dni = dn.nextInt();
        
        System.out.print("Ingresa telefono: ");
            Scanner tel = new Scanner(System.in);
                telefono = tel.nextLong();
                
                
        Scanner obtenerDatos= new Scanner(System.in);
        
        String modelos []= {"POLO", "VENTO", "VIRTUS"};
        int gamaBasica []= {1000000, 1200000, 1300000};
        int gamaIntermedia []= {1400000, 1500000, 1600000};
        int gamaAlta []= {1700000, 1800000, 1900000};
        
        System.out.println("Modelos Disoponibles");
            for (int i=0; i< modelos.length; i++){
             System.out.println((i + 1) + ". " + modelos[i]);
             
            }
            
        System.out.print("Selecciona un MODELO: ");

        String modelo=obtenerDatos.nextLine();    
        
        System.out.println("\n");
            
        switch(modelo){
            case "1": autoSeleccionado=modelos[0];
            break;
            case "2": autoSeleccionado=modelos[1];
            break;
            case "3": autoSeleccionado=modelos[2];
            break;   
        }
            
            
        System.out.println("Gamas disponibles: ");
        System.out.println("1- BASICO");
        System.out.println("2- INTERMEDIO");
        System.out.println("3- ALTA");
        System.out.print("Selecciona una GAMA: ");
        String gama=obtenerDatos.nextLine();
        switch(gama){
            case "1": gamaSeleccionada="BASICA";
                      switch(autoSeleccionado){
                          case "POLO": precioLista=gamaBasica[0];
                          break;
                          case "VENTO": precioLista=gamaBasica[1];
                          break;
                          case "VIRTUS": precioLista=gamaBasica[2];
                          break;
                      }  
            break;
            case "2": gamaSeleccionada="INTERMEDIA";
                      switch(autoSeleccionado){
                          case "POLO": precioLista=gamaIntermedia[0];
                          break;
                          case "VENTO": precioLista=gamaIntermedia[1];
                          break;
                          case "VIRTUS": precioLista=gamaIntermedia[2];
                          break;
                      }   
            break;
            case "3": gamaSeleccionada="ALTA";
                      switch(autoSeleccionado){
                          case "POLO": precioLista=gamaAlta[0];
                          break;
                          case "VENTO": precioLista=gamaAlta[1];
                          break;
                          case "VIRTUS": precioLista=gamaAlta[2];
                          break;
                      }  
            break;   
        }

        System.out.println("\n");
            
        String planes []= {"Efectivo" , "70 30" , "80 20" , "100% financiado"};
        System.out.println("Planes disponibles ");
            for (int p = 0; p < planes.length; p++) {
                System.out.println((p + 1) + ". " + planes[p]);
            }   
       System.out.print("Selecciona un PLAN: ");
       Scanner sel = new Scanner(System.in);
       int seleccion = sel.nextInt();
            
       System.out.println("\n");            

       if(seleccion >=1 && seleccion <= planes.length){
            planSeleccionado = planes[seleccion-1];
            
            switch(planSeleccionado){
                case "Efectivo": numeroCuotas = 0;
                                 alicuota = (float) 1.0;   
                                 precioFinal=(int) ((float) precioLista * alicuota);
                                 System.out.println("PF: " + precioFinal + ". Cuotas: " + cuotas);// ** ELIMINAR **
                break;
                case "70 30": numeroCuotas = 120;
                              alicuota = (float) 1.70;  
                              precioFinal=(int)((float) precioLista * alicuota);
                              cuotas=(int) ((int) (float) precioFinal / numeroCuotas);
                              System.out.println("PF: " + precioFinal + ". Cuotas: " + cuotas);// ** ELIMINAR **
                break;
                case "80 20": numeroCuotas = 85;
                              alicuota = (float) 1.85;  
                              precioFinal=(int)((float) precioLista * alicuota);
                              cuotas=(int) ((int) (float) precioFinal / numeroCuotas);
                              System.out.println("PF: " + precioFinal + ". Cuotas: " + cuotas);// ** ELIMINAR **
                break;
                case "100% financiado": numeroCuotas = 240;
                                        alicuota = (float) 2;
                                        precioFinal=(int)((float) precioLista * alicuota);
                                        cuotas=(int) ((int) (float) precioFinal / numeroCuotas);
                                        System.out.println("PF: " + precioFinal + ". Cuotas: " + cuotas);// ** ELIMINAR **
                break;
                
            }           
            System.out.println("Elegiste el modelo " + autoSeleccionado +", gama " + gamaSeleccionada+ ", plan " + planSeleccionado + ", cuotas " + numeroCuotas + ", alicuota: " + alicuota);
       }
       System.out.println("Entrega auto usado: ");
       System.out.println("1- SÍ --------------");
       System.out.println("2- NO --------------");
       String autoUsado= obtenerDatos.nextLine();
       
       switch(autoUsado){
           case "1": entregaAuto = "SI";
                     System.out.print("Dominio?: ");   
                     String dominio=obtenerDatos.nextLine();
                     dominioAutoUsado=dominio;
           break;
           case "2": entregaAuto="NO";
       }
        System.out.println(dominioAutoUsado);//** ELIMINAR **
       
       
               
       

       
       
                
                
                
                
                
                
            
    }                                       
}
    

