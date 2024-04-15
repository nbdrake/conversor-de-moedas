import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int opcao = 0;
        double valor = 0.0;
        String moedaBase;
        String moedaAlvo;

        //Dólar = USD
        //Real brasileiro = BRL
        //Peso argentino = ARS
        //Peso colombiano = COP

        while(opcao!=7){
            Exibicao.solicitarOpcao();
            opcao = leitura.nextInt();

            switch (opcao){
                case 1:
                    moedaBase = "USD";
                    moedaAlvo = "ARS";
                    Exibicao.solicitarValor();
                    valor = leitura.nextDouble();
                    Cambio.RealizarCambio(moedaBase, moedaAlvo, valor);
                    break;
                case 2:
                    moedaBase = "ARS";
                    moedaAlvo = "USD";
                    Exibicao.solicitarValor();
                    valor = leitura.nextDouble();
                    Cambio.RealizarCambio(moedaBase, moedaAlvo, valor);
                    break;
                case 3:
                    moedaBase = "USD";
                    moedaAlvo = "BRL";
                    Exibicao.solicitarValor();
                    valor = leitura.nextDouble();
                    Cambio.RealizarCambio(moedaBase, moedaAlvo, valor);
                    break;
                case 4:
                    moedaBase = "BRL";
                    moedaAlvo = "USD";
                    Exibicao.solicitarValor();
                    valor = leitura.nextDouble();
                    Cambio.RealizarCambio(moedaBase, moedaAlvo, valor);
                    break;
                case 5:
                    moedaBase = "USD";
                    moedaAlvo = "COP";
                    Exibicao.solicitarValor();
                    valor = leitura.nextDouble();
                    Cambio.RealizarCambio(moedaBase, moedaAlvo, valor);
                    break;
                case 6:
                    moedaBase = "COP";
                    moedaAlvo = "USD";
                    Exibicao.solicitarValor();
                    valor = leitura.nextDouble();
                    Cambio.RealizarCambio(moedaBase, moedaAlvo, valor);
                    break;
            }
        }
    }
}