
package pilasycolas;

public class MetodosCola {
    private NodoA primeroA;
    private NodoA ultimoA;
    int tamanioA;
    private NodoB primeroB;
    private NodoB ultimoB;
    int tamanioB;
    private NodoR primeroR;
    private NodoR ultimoR;
    int tamanioR;
    
    public MetodosCola(){
        primeroA = null;
        ultimoA = null;
        tamanioA = 0;
        primeroB = null;
        ultimoB = null;
        tamanioB = 0;
    }
    
    public boolean vacia(){
        if(primeroA != null){
            return true;
        }
        System.out.println("Cola vacía");
        return false;
    }
    
    public int encolar(int dato){
        NodoA nuevo = new NodoA(dato);
        if(tamanioA==0){
            primeroA = nuevo;}
        else{
            ultimoA.setSiguiente(nuevo);}
        ultimoA = nuevo;
        tamanioA++;
        return dato;
    }

    public int encolaB(int dato){ 
        NodoB nuevo = new NodoB(dato);
        if(tamanioB==0){
        primeroB = nuevo;}
        else{
            ultimoB.setSiguiente(nuevo);}
        ultimoB = nuevo;
        tamanioB++;
        return dato;
    }
    
    public void colaResultado(int datoA, int datoB){
        int suma = datoA + datoB;
        NodoR cResultado = new NodoR(suma);
        if(tamanioR==0){
        primeroR = cResultado;}
        else{
            ultimoR.setSiguiente(cResultado);}
        ultimoR = cResultado;
        tamanioR++;
    }
    
    public void mostrarColas(){
        NodoA aux1 = primeroA;
        NodoB aux2 = primeroB;
        NodoR auxR = primeroR;
        System.out.println("PRIMERA COLA:");
        while(aux1!= null){
            System.out.println("[" + aux1.dato + "]");
            aux1 = aux1.siguienteA;
        }
        System.out.println("SEGUNDA COLA:");
        while( aux2!= null ){
            System.out.println("[" + aux2.dato + "]"); 
            aux2 = aux2.siguienteB;
        }
        System.out.println("RESULTADO: ");
        while( auxR != null){ 
            System.out.println("[" + auxR.dato + "]");
            auxR = auxR.siguienteR;
        }
    }  
}
    
