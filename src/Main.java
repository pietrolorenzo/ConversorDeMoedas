import com.google.gson.*;
import modelo.Menu;
import modelo.Moedas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        Menu menu = new Menu();
        menu.mensagemInicial();
        System.out.println("------------ Menu -------------");
        System.out.println(" 1 - Converter Moedas");
        System.out.println(" 2 - Lista de Moedas");
        System.out.println(" 3 - Sair");
        System.out.println("-------------------------------");
        System.out.println("Digite o número da opção que você deseja: ");
        int escolha = ler.nextInt();
        switch (escolha){
            case 2:
                System.out.println("----------- Lista de Moedas -----------");
                for (Moedas moedas : Moedas.values()) {
                    System.out.println(moedas);
                }

            case 1:
                System.out.println("----------- Conversor De Moedas -----------");
                System.out.println("Digite a sigla da moeda de origem: ");
                String x = ler.next().toUpperCase();
                System.out.println("Digite a sigla da moeda na qual você quer que seja convertida: ");
                String y = ler.next().toUpperCase();
                System.out.println("Digite o valor a ser convertido");
                double valor = ler.nextDouble();

                String endereco = "https://v6.exchangerate-api.com/v6/dccb0288651acb61ba9ba4ef/pair/"+ x + "/" +y + "/" + valor;
                URL url = new URL(endereco);
                HttpURLConnection request = (HttpURLConnection) url.openConnection();
                request.connect();

                JsonParser jp = new JsonParser();
                JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
                JsonObject jsonobj = root.getAsJsonObject();

                String req_result = jsonobj.get("conversion_result").getAsString();

                System.out.println("O valor após a conversão de " +x + " para " +y+ "será "+ req_result);
                double taxa = jsonobj.get("conversion_rate").getAsDouble();
                System.out.println("Taxa de conversão: " + taxa);

            case 3:
                break;
        }
    }
}