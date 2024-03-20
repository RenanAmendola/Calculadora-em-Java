package poo;

import java.util.HashMap;
import java.util.Scanner;

public class teste_numero {

    public static void main(String[] args) {
        Number n = new Number();

        boolean running = true;


    Scanner scan = new Scanner(System.in);

    while (running) {

        double Number_1 = 0; 
        double Number_2 = 0;
        int operation;

        
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("0 - Finalizar a calculadora");
        System.out.print("Digite a operação que deseja executar: ");

        operation = scan.nextInt();

        if (operation == 0) {

            running = false;
            System.out.println("Encerrando o sistema");
            return;
        }



        System.out.print("Informe o primeiro numero: ");

        Number_1 = scan.nextDouble();
        System.out.println("");
        
        System.out.print("Informe o segundo numero: ");

        Number_2 = scan.nextDouble();
        System.out.println("");

        System.out.println("");

        switch (operation) {
            case 1:

            show_result(operation, n.sum(Number_1, Number_2), Number_1, Number_2);

                break;

            case 2:

            show_result(operation, n.sub(Number_1, Number_2), Number_1, Number_2);

                break;

            case 3:

            show_result(operation, n.mult(Number_1, Number_2), Number_1, Number_2);

                break;

            case 4:

            show_result(operation, n.div(Number_1, Number_2), Number_1, Number_2);

                break;
        }
    }


    scan.close();



    }


    static void show_result(int operation, double resultado, double Number_1, double Number_2){

        HashMap<Integer, String> map_operation = new HashMap<>();

        map_operation.put(1, " + ");
        map_operation.put(2, " - ");
        map_operation.put(3, " x ");
        map_operation.put(4, " / ");

        System.out.println( Number_1+ map_operation.get(operation) + Number_2 + " = " + resultado + "\n");


    }
    
}
