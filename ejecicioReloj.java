import java.util.Set;

public class ejecicioReloj{

// SE DECLARA LAS PROPIEDADES EL OBJETO

int hora;
int minutos;
int segundos;
// SE CREA UN CONSTRUCTOR Y SE LE ASIGNA VALORES SIN ENVIAR PARAMETRO
public ejecicioReloj (){
   hora=12;
   minutos=00;
   segundos=00;


// SE CREA UN CONSTRUCTOR  Y SE LE ASIGNA VARIALES PRINCIPAL A LOS TRES PARAMETROS ENVIADO 
}public ejecicioReloj (int h, int m, int s ){
    hora=h;
    minutos=m;
    segundos=s;
 }
 //SE CREA UN CONSTRUCTOR PARA ASIGNAR VALORES DE HORAS MINUTOS Y SEGUNDOS  DES LA MEDIA NOCHE
 public ejecicioReloj (int s ){
    hora = s/3600;
    s&= 3600;
    minutos=s/60;
    s%=60;
    segundos=s;
 }
// SE CREA UN METODO SET PARA MOSTRAR LOS VALORES DE LAS VARIABLES
 public void setReloj(int s){
   hora=s/3600;
   s = segundos - (hora*3600); 
   minutos = s/60;
   s= - (minutos*60);
   segundos=s;
}

// Metodo SET Y GET

// SE ENVIA LOS VALORES POR SER CON UN PARAMETRO DE SEGUNDOS PARA IMPRIMIR HORA MINUTOS Y SEGUNDOS

public void setSegundos(int segundos) {
   this.segundos = segundos;
}

// SE ENVIA LOS VALORES POR GET DE HORA MINUTOS Y SEGUNDOS

public int getHora() {
    return hora;
}

public int getMinutos() {
    return minutos;
}
public int getSegundos() {
    return segundos;
}

// SE ENVIA TODOS LOS VALORES DE LA VARIABLE UN EN CADA PARAMETRO 

public void setHora(int hora) {
    this.hora = hora;
}  

public void setMinutos(int minutos) {
    this.minutos = minutos;
}

// SE  POR METODO TICKS PARA INCRIMENTAR EL SEGUNDO EN 1

public void TICKS(){
   segundos++;
   if (segundos==60){
      segundos=0;
      minutos++;     
  }

}
// SE CREA UN METODO DE TIPO RELOJ  

public void addReloj(ejecicioReloj reloj){ // 2 0 0 + 23 0 0 

        hora+=reloj.hora;
        minutos+=reloj.minutos;
        segundos+=reloj.segundos;

        if (segundos>=60){
            segundos-=60;
            minutos++;
        }
        if (minutos>=60){
            minutos-=60;
            hora++;
        }
        if (hora>=24){
            hora-=24;
        } 

}

// SE CREA UN TosString que envia el valor de la hora
public String toString(){
   System.out.println(hora+":"+minutos +":"+ segundos);
   return "";
}
// Se crea un ticksDescrement para descrementar el valor del segundo
public void ticksDescrement(){
   segundos=segundos-1;  

}


public static void main(String []args) {

   // Envia por parametros sin valores para llamar a hora minutos y segundos
    ejecicioReloj reloj1 = new ejecicioReloj();
   System.out.println(reloj1.hora+":"+ reloj1.minutos +":"+ reloj1.segundos);
   reloj1.toString();

   // Envia por parametros con tres valores a las variables hora, minutos y segundos
    ejecicioReloj reloj2 = new ejecicioReloj(4,6,8);
    System.out.println(reloj2.hora+":"+ reloj2.minutos +":"+ reloj2.segundos);

    // Envia por parametros un valor a las variables s en segundo para combertir hora minutos y segundos
    ejecicioReloj reloj3 = new ejecicioReloj(50000);
    System.out.println(reloj3.hora+":"+ reloj3.minutos +" : "+ reloj3.segundos);

    // Envia por parametros un valor en segundo para convertir los valore en hora, minutos y segundos
    reloj1.setReloj(6000);
    System.out.println("la hora "+reloj2.hora+"minutos:"+ reloj2.minutos +"segundos:"+ reloj2.segundos);

    //llamamos al metodo getReloj para obtener el valor en este caso de las horas, minutos, segundos
    System.out.println(reloj2.getHora()+":"+ reloj2.getMinutos() +":"+ reloj2.getSegundos());
    
    //llamamos al metodo set para enviar parametro en las variables hora, minutos y segundos
    reloj1.setHora(6000);
    reloj1.setMinutos(10);
    reloj1.setSegundos(10);
    System.out.println(reloj1.hora+":"+ reloj1.minutos +":"+ reloj1.segundos); 
    
    // LLAMAMOS AL METODOS TICKS PARA INCREMENTAR EL VALOR DE SEGUNDO
    reloj1.TICKS();
    System.out.println(reloj1.hora+":"+ reloj1.minutos +":"+ reloj1.segundos);  
     // LLAMAMOS AL METODO addReloj del tipo ejercicioReloj (la clase principal)

   reloj2.addReloj(reloj1); //sumo las horas, minutos, segundos del reloj 3
   System.out.println(reloj2.hora+":"+reloj2.minutos+":"+reloj2.segundos);
   
    // LLAMAMOS AL METODOS TICKS PARA DESCREMENTAR EL VALOR DEL SEGUNDOS
    reloj2.ticksDescrement();
    System.out.println(reloj2.hora+":"+ reloj2.minutos +":"+ reloj2.segundos); 
    
    //INSTANCIA PARA ASIGNAR VALOR AL 

   ejecicioReloj resta = new ejecicioReloj(2,4,6);      
   System.out.println(resta.hora+":"+ resta.minutos+":"+resta.segundos);

   }

}






