package sobrecargarmetodos;
public class SobreCargarMetodos {
    public static void main(String[] args) {
        
        Metodos obj = new Metodos();
        int a=2; 
        String b=" Esto es un ejemplo de sobrecarga de Metodos";
        
        obj.Julian(a);
        obj.Julian(a, b);
    }
    
}
