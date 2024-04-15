public class Exibicao {
    public static void solicitarOpcao(){
        System.out.println();
        System.out.println("***************************************************");
        System.out.println("Seja bem-vindo/a ao Conversor de Moeda =]");
        System.out.println();
        System.out.println("1) Dólar => Peso argentino.");
        System.out.println("2) Peso argentino => Dólar.");
        System.out.println("3) Dólar => Real brasileiro.");
        System.out.println("4) Real brasileiro => Dólar.");
        System.out.println("5) Dólar => Peso colambiano.");
        System.out.println("6) Peso colambiano => Dólar.");
        System.out.println("7) Sair.");
        System.out.println("***************************************************");
        System.out.println();
        System.out.print("Escolha uma opção válida: ");
    }

    public static void solicitarValor(){
        System.out.print("Digite o valor que deseja converter: ");
    }
}
