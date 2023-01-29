
public class EGit {
  
  public static void main(String[] args) {
    
    final int CANTIDAD_NUMEROS = 20;
    final int NUMERO_MAX = 10;
    final int NUMERO_MIN = 1;
    int[] numero = new int [CANTIDAD_NUMEROS];
    
    for (int i = 0; i < CANTIDAD_NUMEROS; i++) {
      numero[i] = (int) (Math.random() * (NUMERO_MAX - NUMERO_MIN + 1) + NUMERO_MIN);
      
    }
  }  
}

