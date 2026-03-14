import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Ola");
        System.out.println("Ola Mundo!");

        //comentario 1 linha
        /*
        comentario em varias linhas

         */


        //alt+shift+= aumentar o zoom
        String nome = "Francisco";
        int idade = 30;
        float altura = 1.75f;
        boolean status = true;

        //Exibindo o conteudo da variavel
        System.out.print(nome);
        System.out.print(idade);
        System.out.print(altura);
        System.out.print(status);

        // trocando o conteudo da variavel
        idade = 31;
        nome = "Francisco Douglas";

        System.out.println(nome);
        System.out.println(idade);

        //operadores matematicos
        int a = idade +1;
        int b = idade *2;
        int c = idade /2;
        int d = idade -10;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        if(idade>30){
            System.out.println(true);
        }else{
            System.out.println(true);
        }
        //operadores de comparação
        System.out.println(idade ==30);
        System.out.println(idade >30);
        System.out.println(idade <30);
        System.out.println(idade >=30);
        System.out.println(idade <=30);
        System.out.println(idade !=30);


        //operadores acumuladores
        idade = idade +5;
        System.out.println(idade);
        //ou
        idade += 5;
        System.out.println(idade);

        //operadores de incremento e decremento
        System.out.println(idade++);
        System.out.println(idade--);

        Scanner sc = new Scanner(System.in);
        System.out.println("digite o seu nome")
        nome = sc.nextLine();
        System.out.println(nome);

        System.out.println("digite a sua idade");
        idade = sc.nextInt();
        //nextint() obtem o valor do terminal e converte para nuemro inteiro

        System.out.println(idade);















    }
}