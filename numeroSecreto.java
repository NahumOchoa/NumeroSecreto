import java.util.Scanner;

public class JavaApplication1 {

public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);

 int a = (int) ((Math.random() * 100)+1); 
 int b; 
 int i; 
 System.out.print("Tienes 5 vidas. Escribe un número entre 1 y 100: ");
 b = sc.nextInt();

 for (i=0; i<=4; i++) { 

    
    
    if (a == b) {  
      System.out.println("¡Has acertado!"); 
      break; }   
    else if (i == 4) { 
      System.out.println("perdiste!. El número era el: " + a); 
      break; } 
    
    else if (a > b) 
      System.out.println("El número es MAYOR que " + b);
    else if (a < b)
      System.out.println("El número es MENOR que " + b);
    
    if (i <=1) { 
     System.out.print("Otro intento: "); 
     b = sc.nextInt(); } 
    else if (i ==2) { 
    int x = (int) (a/10);
    System.out.println("Una pista, la primera cifra es " + x);
    System.out.print("Inténtalo de nuevo: ");
    b = sc.nextInt(); } 
    else if (i >= 3) {
    b = sc.nextInt(); }
    }
  }
}