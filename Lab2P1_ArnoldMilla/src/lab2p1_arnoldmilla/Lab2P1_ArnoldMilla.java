package lab2p1_arnoldmilla;
import java.util.Scanner;

public class Lab2P1_ArnoldMilla {

    
    public static void main(String[] args) {
        char reintentar = 's';
        while (reintentar == 's' || reintentar == 'S'){
        char resp = 's';
        Scanner sc = new Scanner(System.in);
            System.out.println("///////////Menu////////////");
            System.out.println("1. Dibujar triangulos ");
            System.out.println("2. Area de figuras ");
            System.out.println("3. Evaluar numeros ");
            System.out.println("Ingrese una opcion [1,2,3] ");
                int opcion = sc.nextInt();
        
        if (opcion == 1){
            while (resp == 's' || resp == 'S'){
            System.out.println("Ingrese los tres lados de un triangulo ");
            System.out.println("Ingrese a: ");
            int lado1 = sc.nextInt();
            System.out.println("Ingrese b: ");
            int lado2 = sc.nextInt();
            System.out.println("Ingrese c: ");
            int lado3 = sc.nextInt();
                if (lado1 < 0 || lado2 < 0 || lado3 < 0){
                    System.out.println("Las longitudes no pueden ser negativas ");
                    }//fin verificacion negativo
                else if (lado1 + lado2 < lado3 || lado2 + lado3 < lado1 || lado3 + lado1 < lado2){
                    System.out.println("Las longitudes ingresadas no forman un triangulo ");
                }//fin verificacion suma de lados
                    else {
                        System.out.println("Las longitudes ingresadas forman un triangulo");
                }
                System.out.println("Desea ingresar otro triangulo? [s/n] ");
                resp = sc.next().charAt(0);
                }//fin respuesta de usuario
        }// fin opcion 1
        
        else if (opcion == 2){
            while (resp == 's' || resp == 'S'){
            System.out.println("CALCULAR AREAS");
            System.out.println("Ingrese la figura a la que le desea calcular el area: ");
            System.out.println("1. Triangulo ");
            System.out.println("2. Rectangulo ");
            System.out.println("3. Circulo ");
            System.out.println("Ingrese una opcion [1,2,3] ");
            int figura = sc.nextInt();
            double area;
                    
            if (figura == 1){
                System.out.println("Esta apunto de calcular el area de un triangulo ");
                System.out.println("Ingrese la base del triangulo ");
                double base = sc.nextDouble();
                System.out.println("Ingrese la altura del triangulo ");
                double altura = sc.nextDouble();
                area = 0.5 * (base * altura);
                System.out.println("El area del triangulo es de " + area);
            }// fin area triangulo
            
                else if (figura == 2){
                    System.out.println("Esta a punto de calcular el area de un rectangulo ");
                    System.out.println("Ingrese una base del rectangulo ");
                    double base1 = sc.nextDouble();
                    System.out.println("Ingrese la otra base del rectangulo ");
                    double base2 = sc.nextDouble();
                    area = (base1 * base2);
                    System.out.println("El area del rectangulo es de " + area);
            }// fin area rectangulo
                
                    else if (figura == 3){
                        System.out.println("Esta a punto de calcular el area de un circulo ");
                        System.out.println("Ingrese el radio de el circulo ");
                        double radio = sc.nextDouble();
                        area = Math.PI * Math.pow(radio, 2);
                        System.out.println("El area del circulo es de " + area);    
                    }//fin area circulo
                    
                        else {
                            System.out.println("Opcion incorrecta");
                        }
            
            System.out.println("Desea calcular el area de otra figura? [s/n] ");
            resp = sc.next().charAt(0);
            }//fin respuesta de usuario
        }//fin opcion2
        
        else if (opcion == 3){
            while (resp == 's' || resp == 'S'){
                boolean verif1;
                boolean verif2;
                int contador = 1;
                int acum = 0;
                System.out.println("EVALUAR NUMEROS ");
                System.out.println("Ingrese El numero que quiere evaluar: ");
                int num = sc.nextInt();
                    if (num % 2 == 0){
                        verif1 = true;
                    }
                    else {
                        verif1 = false;
                    }//fin verificacion par
                    while (contador <= num) {
                        if (num % contador == 0){
                            acum = acum + 1;
                            contador = contador + 1;
                        }
                        else {
                            contador = contador + 1;
                        }
                    }//fin ciclo calculo primo
                    System.out.println(acum);
                    if (acum == 2){
                        verif2 = true;
                    }
                        else {
                            verif2 = false;
                        }//fin verif primo
                    
            if (verif1 && verif2 == true){
                System.out.println("El numero ingresado es par y primo ");
            }
                else if (verif1 == true && verif2 == false){
                    System.out.println("El numero ingresado es par ");
                }
                    else if (verif1 == false && verif2 == true ){
                        System.out.println("El numero ingresado es impar y primo ");
                    }
                        else if (verif1 == false && verif2 == false){
                            System.out.println("El numero ingresado es impar");
                        }
                contador = 1;        
                System.out.println("Desea verificar otro numero? s/n ");
                resp = sc.next().charAt(0);
            }
        }//fin opcion 3
        System.out.println("Desea volver a correr el programa? s/n ");
        reintentar = sc.next().charAt(0);
    }  
    }
    
}//fin clase
