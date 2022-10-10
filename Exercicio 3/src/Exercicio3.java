import java.util.Scanner;

public class Exercicio3 {

    public static void main(String args[]){
        // Faça um Programa que peça dois números e imprima
        // 1) Ação do usuário: digitar dois numeros
        // 2) Tarefa do programa: calcular a soma
        // 3) Resposta do programa: Mostra o resultado da soma

        double numero1;
        double numero2;
        double resultado;

        Scanner teclado = new Scanner(System.in);
        numero1 = teclado.nextDouble();
        numero2 = teclado.nextDouble();
        teclado.close();

        resultado = numero1 + numero2;

        System.out.print("O resultado é ");
        System.out.print(resultado);



    }
}