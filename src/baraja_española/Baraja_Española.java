package baraja_española;
import java.util.Scanner;
/**
 * Es un método que genera aleatoriamente una carta de la baraja española, generando un número aleatorio para el número (1-12) y otro número aleatorio para el palo (1-4) para después mostrar la carta según los valores generados con este formato:
Numero: 1 -> A (As) 10 -> S (Sota) 11 -> C (Caballo) 12 -> R (Rey)
Palo: 1 -> Espadas y color azul claro, 2-> Oros y color amarillo, 3 -> Copas y color rojo, 4 -> Bastos y color verde
 * 
 * @author Dansegvel
 * @version 1.0
 * @since 31/3/2022
 */
public class Baraja_Española {
    //Metodos
    /**
     * 
     * @param args 
     * String rojo/azul/amarillo/verde harán que nuestras cartas tengan. Num y palo son los valores de la carta generados aleatoriamente, y num1 y palo1 variables para encajar los palos y numeros a letras
     */
    public static void main(String[] args) {
        String rojo="\033[31m";
        String azul="\033[36m";
        String amarillo="\033[33m";
        String verde="\033[32m";
        String num1,palo1;
        
        int numero=(int)(Math.random()*(12)+1);
        int palo=(int)(Math.random()*(4)+1);
        
        switch(numero){
            case 1:
                num1="A";
                break;
            case 10:
                num1="S";
                break;
            case 11:
                num1="C";
                break;
            case 12:
                num1="R";
                break;
            default:
                num1=Integer.toString(numero);
                break;
        }
        switch(palo){
            case 1:
                palo1="E";
                System.out.println(azul+" --- \n|"+azul+palo1+azul+"  |\n| "+azul+num1+azul+" |\n|  "+azul+palo1+azul+"|\n ---"+azul);
                break;
            case 2:
                palo1="O";
                System.out.println(amarillo+" --- \n|"+amarillo+palo1+amarillo+"  |\n| "+amarillo+num1+amarillo+" |\n|  "+amarillo+palo1+amarillo+"|\n ---"+amarillo);
                break;
            case 3:
                palo1="C";
                System.out.println(rojo+" --- \n|"+rojo+palo1+rojo+"  |\n| "+rojo+num1+rojo+" |\n|  "+rojo+palo1+rojo+"|\n ---"+rojo);
                break;
            case 4:
                palo1="B";
                System.out.println(verde+" --- \n|"+verde+palo1+verde+"  |\n| "+verde+num1+verde+" |\n|  "+verde+palo1+verde+"|\n ---"+verde);
                break;
        }
    }
}