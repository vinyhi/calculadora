public class Calculadora{
    public int somar (int a , int b){
    return a + b;
}
public float somarReais(float a, float b){
    return a+b;
}
public int somarString(String a , String b){
    return Integer.parseInt(a)+Integer.parseInt(b); 
}
public int somar (String a, int b){
    return Integer.parseInt (a)+b;
}
public int somar (int a,String b ){
    return a + Integer.parseInt(b);
}
}