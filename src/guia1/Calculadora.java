
package guia1;


public class Calculadora {
    //atributos
    public float num1,num2,result;
    //metodos
   public void suma(){
    result=num1+num2;
    
}  
public void resta(){
    result=num1-num2;
}
public void multi(){
    result=num1*num2;
}
public void division(){
    result=num1/num2;
}
public void sen(double a){
    a = Math.toRadians(a); 
    result=(float)Math.sin(a);
}
public void cos(double a){
    a = Math.toRadians(a); 
    result=(float)Math.cos(a);
}
public void tan(double a){
    a = Math.toRadians(a); 
    result=(float)Math.tan(a);
}
public void iva(){
    result=num1*num2/100;
}
public void raiz(){
   result=(float) Math.sqrt(num1);
}
public void pow(){
   result=(float) Math.pow(num1,num2);
}
}
