
package modelo;

 import java.util.Random;

 public class Problema_Reinas
 {    
 Random aleatorio = new Random();
 private int Tablero,intentosR=100000;
 private int fila ,columna,contR= 0;

 public void Principal()
 {    
int recorrido;
 System.out.println("\n ---------------Problema de las ocho reinas.-----------------------");
 Tablero = 8;
 int fracasos = 0;
 int Vec[][] = new int[Tablero+ 1][Tablero + 1];
 while ( Tablero > contR  && fracasos < intentosR)
 {
 GeneraPosicion(); 
 recorrido =  VerificadorDePosicion(Vec); 
 if ( 0 == recorrido )
 fracasos++;
 else
 Vec[fila][columna] = ++contR;

 }
 if ( Tablero != contR)
 {
    System.out.printf("\nSolo se colocaron %d reinas\n", contR);
     }
    else {
 
  System.out.printf("\n¡¡¡¡¡¡SE COLOCARON LAS %d REINAS!!!!!\n", Tablero);
    }
 Imprime(Vec);
 
 }  
 public void GeneraPosicion()
 {         
 fila = aleatorio.nextInt(Tablero) + 1;
 columna = aleatorio.nextInt(Tablero) + 1;
 }       

 public int VerificadorDePosicion(int C[][] )
 {        
 int estatus = 1;
 if ( 0 == C[fila][columna] )
 {      
 for ( int i = 1; i <= Tablero; i++ )
 for ( int j = 1; j <= Tablero; j++ )
 { 
 if ( 0 != C[i][j] )
 {      
 if ((( fila == i) || (columna == j ))  || (Math.abs(fila - i) == Math.abs(columna - j )) )
 {
 estatus = 0;
 break;
 }
    }      
        }    
            }       
 else
 estatus = 0;
return estatus;
 }         
 public void Imprime(int C[][])
 {      
 for ( int k = 1; k <= Tablero; k++ )
 {
 for ( int j = 1; j <= Tablero; j++)
 {
 System.out.printf("%6d", C[k][j]);
 } 
 System.out.println("\n");
     }
        }    
            } 