import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    static double promedio = 0;

    public static void main(String[] args) {
        Scanner mi_Scanner = new  Scanner(System.in);
        String cursos [] = {"Geom", "Ing", "Quim", "Lect", "Alg", "Edat", "Econ" };
        int parcial;
        String resp, alumn= "";

        int varxxx = 0;

        while (varxxx <=0) {
            parcial = 0;

            while (parcial< 4) {
                switch (parcial) {
                    case 0:
                    alumn = dar_Gene();
                        
                        break;
                     case 1 :
                        prim_Parc(cursos);
                            
                        break;
                    case 2:
                         seg_Parc(cursos);
                                
                         break;

                         case 3:
                         ter_Parc(cursos);
                             
                      break;
                
                }
                parcial =  parcial +1;
            
            }
            System.out.println("Calificacion de"+ alumn + "registrado");
            System.out.println("Desea seguir S/N");

            resp =  mi_Scanner.next();
            if (resp.toUpperCase().equals("N")) {
                varxxx= 11;
            }
        }

        System.out.println("Adios, asta la Proxima");
    }
 public static void prim_Parc(String[] args) {
     
 }
 public static void seg_Parc(String[] args) {
     
}
public static void ter_Parc(String[] args) {
     
}
public static String dar_Gene() {
     String nomb, curp, ine, numec, carti, medad, mujer,resut = "";
     Scanner elScanner = new Scanner(System.in);
     System.out.print("Introduzca su nombre: ");
     nomb = elScanner.nextLine().toUpperCase();
     System.out.println("Alumno:"+ nomb+"\n");
     resut= resut +"Alumno:"+ nomb +"\n";
     do {
         System.out.print("Introduzca su CURP:");
         curp = elScanner.nextLine().toUpperCase();
         System.out.println("CURP:"+ curp);

         if(curp.length()<=2){
             System.out.println("El CURP debe tener 2 caracteres");

         }
     } while (curp.length()<=2);
     resut = resut + "CURP:" + curp + "\n";
     System.out.print("Introduzca su numerode control: ");
     numec = elScanner.nextLine();
     System.out.println("Numero de control: "+ numec);

     System.out.println("Es mayo de edad, INE : " );
     medad = elScanner.nextLine();
     if (medad.equals("si")) {
         System.out.print("Introdusca su INE: ");
         ine = elScanner.next();
         System.out.println("Es mayor de edad, INE" + ine);
         System.out.println(" Es usted mujer (S/N) ?");
         mujer = elScanner.next();

         if (mujer.equals("si")||mujer.equals("Si") || mujer.equals("SI")) {
             System.out.println("Mujer");

         } else {
             do {
                 carti = "";
                 System.out.print("Introdusca su num Cartilla");
                 carti = elScanner.next();
             } while (carti.length()>=10
               );

             System.out.println("hombre, Cartilla"+ carti);
         }
         
     } 
     

return resut;

}

}
