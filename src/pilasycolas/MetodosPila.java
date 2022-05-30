
package pilasycolas;


public class MetodosPila{
    //Variables para ejercicio 1
    private NodoA cimaA;
    int tamanioA;
    private NodoB cimaB;
    int tamanioB;
    
    //Variables para ejercicio 3 y 4
    private NodoStringA cimaS_a;
    int tamanioS_a;
    private NodoStringB cimaS_b;
    int tamanioS_b;
    
    public MetodosPila(){
        //Ejercicio1
        cimaA = null;
        tamanioA = 0;
        cimaB = null;
        tamanioB = 0;
        
        //Ejercicio3 y 4
        cimaS_a = null;
        tamanioS_a = 0;
        cimaS_b = null;
        tamanioS_b = 0;
    }
    
    //Ejercicio 1
    public boolean aVacia(){
        return cimaA == null;
    }
    
    public boolean bVacia(){
        return cimaB == null;
    }
    
    public int ingresoA( int dato){ 
        NodoA nuevo = new NodoA(dato);
        nuevo.siguienteA = cimaA;
        cimaA = nuevo;
        tamanioA++;
        return dato;
    }
    
    public void revertirPila(){ 
        NodoA aux = cimaA;
        NodoB nuevoB = new NodoB(cimaA.dato);
        nuevoB.siguienteB = cimaB;
        cimaB = nuevoB;
        tamanioB ++;
        while( !bVacia()){
            aux = aux.siguienteA;
            nuevoB = new NodoB(aux.dato);
            nuevoB.siguienteB = cimaB;
            cimaB = nuevoB;
            tamanioB++;               
            if ( tamanioB == tamanioA){
                break;
            }
        }
        System.out.println("PILA INVERTIDA");
    }
    
    public void eliminar(){
        int aux = cimaA.dato;
        cimaA = cimaA.siguienteA;
        tamanioA--;
        if (cimaA.siguienteA == null){
            cimaA = null;
            tamanioA = 0;
        }
    }
    
    public void mostrarPilaA(){ 
        NodoA aux = cimaA;
        System.out.println("LA PILA INGRESADA ES: ");
        while(aux!= null){
            System.out.println(aux.dato);        
            aux = aux.siguienteA;
        }
    }
    
    public void mostrarPilaB(){
        System.out.println("LA PILA INVERTIDA ES:");
        NodoB aux = cimaB;
        while(aux!= null){
            System.out.println(aux.dato);
            aux = aux.siguienteB;
        }
    }
    
    //Ejercicio 3
    public void empilarString( String cadena){
        char arreglo[]= cadena.toCharArray();
        for(int i = 0; i < arreglo.length; i ++){
            NodoStringA nuevo = new NodoStringA(arreglo[i]);
            nuevo.siguienteA = cimaS_a;
            cimaS_a = nuevo;
            tamanioS_a++;
        }
    }   
    
    public boolean pilaAvacia(){
        if(cimaS_a == null){
            return true;
        }
        return false;
    }
    
    public void invertirPilaCadena(){
        NodoStringA aux = cimaS_a;
        NodoStringB nuevo = new NodoStringB(cimaS_a.datoS);
        nuevo.siguienteB = cimaS_b;
        cimaS_b = nuevo;
        tamanioS_b ++;
        while( !pilaAvacia()){
            aux = aux.siguienteA;
            nuevo = new NodoStringB(aux.datoS);
            nuevo.siguienteB = cimaS_b;
            cimaS_b = nuevo;
            tamanioS_b++;               
            if ( tamanioS_b == tamanioS_a){
                break;
            }
        }
    }
    
    public void mostrarPilas(){
        NodoStringA aux = cimaS_a;
        System.out.println("LA PILA INGRESADA ES: ");
        while(aux!= null){
            System.out.println("[" + aux.datoS + "]");        
            aux = aux.siguienteA;
        }
        System.out.println("PILA INVERTIDA: ");
        NodoStringB auxB = cimaS_b;
        while(auxB!= null){
            System.out.println("[" + auxB.datoS + "]"+ "B");
            auxB = auxB.siguienteB;
        }
    }
    
    //Ejercicio4
    public void pushParentesis( String cadena){
        char arreglo[]= cadena.toCharArray();
        for(int i = 0; i < arreglo.length; i ++){        
            if( arreglo[i] == '('){
                NodoStringA nuevo = new NodoStringA(arreglo[i]);
                nuevo.siguienteA = cimaS_a;
                cimaS_a = nuevo;
                tamanioS_a++;   
            }else{
                if(arreglo[i] == ')'){
                    if(pilaAvacia()==false){                  
                        eliminarPilaString();
                    }                                                               
                }
            }
        }
    }
    public void eliminarPilaString(){
        char aux = cimaS_a.datoS;
        cimaS_a =cimaS_a.siguienteA ;
        tamanioS_a--;
        if (cimaS_a.siguienteA == null){
            cimaS_a = null;
            tamanioS_a = 0;
        }
    }
    
    public void limpiarPilaA(){
        while(!pilaAvacia()){
            eliminarPilaString();
        }
    } 
}
