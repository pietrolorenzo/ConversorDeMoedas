package modelo;

import java.util.Scanner;

public class Menu {
    Scanner ler = new Scanner(System.in);

    public void mensagemInicial(){
        System.out.println("Seja bem-vindo ao conversor de moedas!");
        System.out.println("Recomendo que veja primeiro a lista de moedas, caso não esteja muito familiarizado com as siglas.");
    }

    public void exibirMenu(){
        System.out.println("------------ Menu -------------");
        System.out.println(" 1 - Converter Moedas");
        System.out.println(" 2 - Lista de Moedas");
        System.out.println("3 - Sair");
        System.out.println("-------------------------------");
        System.out.println("Digite o número da opção que você deseja: ");
        int escolha = ler.nextInt();
        switch (escolha){
            case 1:
                System.out.println("----------- Conversor De Moedas -----------");
                System.out.println("Digite a sigla da moeda de origem: ");
                String x = ler.next().toUpperCase();
                System.out.println("Digite a sigla da moeda na qual você quer que seja convertida: ");
                String y = ler.next().toUpperCase();
                System.out.println("Digite o valor a ser convertido");
                double valor = ler.nextDouble();
            case 2:
                System.out.println("----------- Lista de Moedas -----------");
                for (Moedas moedas : Moedas.values()) {
                    System.out.println(moedas);
                }
                System.out.println(" Digite 1 para continuar e 0 para sair");
                int decisao = ler.nextInt();
                if (decisao == 1){
                    exibirMenu();
                }else{
                    break;
                }

            case 3:
                break;
        }



    }
}
