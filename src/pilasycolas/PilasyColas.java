
package pilasycolas;

import java.util.Scanner;

public class PilasyColas {

    Scanner op = new Scanner(System.in);
    MetodosCola cola = new MetodosCola();
    MetodosPila pila = new MetodosPila();
    
    public void menu(){
        boolean salir = false;
        int opcion = 0;
        
        while(!salir){
           System.out.println("------PILAS Y COLAS-----"); 
           System.out.println("EJERCICIO 1"); 
           System.out.println("1. Ingresar datos a la pila");
           System.out.println("2. Invertir pila ingresada");
           System.out.println("EJERCICIO 2");
           System.out.println("3. Ingresar números a las colas");
           System.out.println("4. Mostrar la suma de ambas colas");
           System.out.println("EJERCICIO 3");
           System.out.println("5. Ingrese una palabra a la pila");
           System.out.println("6. Mostrar la palabra invertida");
           System.out.println("EJERCICIO 4");           
           System.out.println("7. Ingrese una cadena con paréntesis");
           System.out.println("8. Verificar si los paréntesis están cerrados");
           System.out.println("");
           System.out.println("9. Salir");
           System.out.println("Selecciona la opción");
           opcion = op.nextInt();
           op.nextLine();
           switch(opcion){
            case 1:
                System.out.println("Ingrese dato: ");
                int dato = op.nextInt();
                pila.ingresoA(dato);
                break;
            case 2:
                pila.revertirPila();
                pila.mostrarPilaA();
                pila.mostrarPilaB();              
                break;
            case 3:
                System.out.println("Ingrese dato a la cola 1: ");
                int datoA = op.nextInt();
                System.out.println("Ingrese dato a la cola 2: ");
                int datoB = op.nextInt();
                op.nextLine();
                cola.colaResultado(cola.encolar(datoA), cola.encolaB(datoB));                    
                break;
            case 4:
                cola.mostrarColas();
                break;
            case 5:
                String palabra;
                System.out.println("Ingrese una palabra: ");
                palabra = op.nextLine();
                pila.empilarString(palabra);
                pila.invertirPilaCadena();
                break;
            case 6:
                pila.mostrarPilas();
                break;
            case 7:
                pila.limpiarPilaA();
                String parentesis;
                System.out.println("Ingrese los paréntesis: ");
                parentesis = op.nextLine();
                pila.empilarString(parentesis);
                break;
            case 8:
                if(pila.aVacia()==true){
                    System.out.println("Los paréntesis están cerrados");
                    }else{
                        System.out.println("Lo sentimos, no todos los paréntesis están cerrados");
                    }
                pila.mostrarPilas();
                break;
            case 9:
                salir = true;               
                break;
            default:
                System.out.println("La opción ingresada es incorrecta");          
            }
        }
    }
    
    public static void main(String[] args) {
        PilasyColas objeto = new PilasyColas();
        objeto.menu();
    }
    
}
