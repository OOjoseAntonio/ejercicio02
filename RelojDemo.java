import java.util.Scanner;

public class RelojDemo {

    public static void main(String []args) {

        int s;
        Scanner entrada = new Scanner(System.in);

         System.out.println("ingrese los datos");

         s = entrada.nextInt();

    ejecicioReloj reloj4= new ejecicioReloj(s);
    System.out.println(":"+reloj4.getHora()+":"+ reloj4.getMinutos()+":"+reloj4.segundos+ reloj4.getSegundos());
    
    
    for(int i=1; i<10;i++){
    reloj4.TICKS();
    System.out.println(":"+reloj4.getHora()+":"+ reloj4.getMinutos()+":"+reloj4.segundos+ reloj4.getSegundos());
     }
   }
 }