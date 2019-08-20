
package menu;


public class Operador {
   //
    public int numero1 = 0; 
    public int numero2 = 0; 
    public int total = 0; 
    
    //Constructor
    public Operador(int num1,int num2) {
    
       this.numero1 = num1;
       this.numero2 = num2;
    } 
    //M. Suma
     
    public int suma (){
    
    return this.numero1 + this.numero2;
    
    }
    // M. Resta
    
     public int resta(){
    
    return this.numero1 - this.numero2;
    }
    
     //M. Multiplicación
    public int multiplicación (){
    
    return this.numero1 * this.numero2;
    }
    
     // M. División
    public int división(){
    
    return this.numero1 / this.numero2;
    }
}
    

