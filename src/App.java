import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    static double prom = 0;

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
 public static void prim_Parc(String Guante_materias[]) {
     Scanner pripaScanner = new Scanner(System.in);
     int califs0[]=new int[7];
     int pasa0 = 0 ;
     for (int i = 0; i < califs0.length; i++) {
         do {
             System.out.println("Capture calificaciones de "+ Guante_materias[i]);
         } while (pasa0 <0 || pasa0 >10);
         califs0[i] = pasa0;
     }
     System.out.println("Promedio del primer Parcial");
     System.out.println("Curso Calificacion");
     System.out.println("------- ----------");
     int pr = 0;
     for (int j = 0; j < califs0.length; j++) {
         pr = (pr + califs0[j]);
         System.out.println(Guante_materias[j] + "===>"+ califs0[j]);
     }
     prom = prom + pr;
     System.out.println("Su promedio es :" + (prom/7));

     
 }
 public static void seg_Parc(String cursos[]) {
     System.out.println("Curso Calificacion");
     System.out.println("--------- ---------");
     int califs1[]= {10,9,6,5,8,7};
     System.out.println("Promedio 2do parcial");

     int pr = 0;
     for (int i = 0; i < califs1.length; i++) {
         pr = (pr + califs1[i]);
         System.out.println(cursos[i]+ "=====>" + califs1[i]);

     }

     prom = prom + pr;
     System.out.println("Su promedio es :" + (prom/7));
     
}
public static void ter_Parc(String cacha_materias[] ) {

    DecimalFormat dosdigitos = new DecimalFormat("##.##");
    System.out.println("CURSO Calificacion");
    System.out.println("___________ ___________");
    int califs2[] = {6,7,5,8,6,7,8};
    System.out.println("Promedio 3er parcial");
    int pr= 0;
    for (int j = 0; j < califs2.length; j++) {
        pr= (pr + califs2[j]);
        System.out.println(cacha_materias[j]+ "---->" + califs2[j]);

    }
    prom = prom + pr;
    System.out.println("");
    System.out.println("Su promedio Final" + dosdigitos.format(prom/21));

    
     
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

         if(curp.length() <18 || curp.length() >18 ){
             System.out.println("El CURP debe tener 18 caracteres");

         }
     } while (curp.length() <18 || curp.length() >1823);
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
             } while (carti.length()>=10);

             System.out.println("hombre, Cartilla"+ carti);
         }
         
     } 
     

return resut;

}

}
