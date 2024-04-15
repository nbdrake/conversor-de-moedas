public class Cambio {
    public static void RealizarCambio(String base, String alvo, Double valor){

        ConsultaCotacao consultaCotacao = new ConsultaCotacao();
        Moeda moeda = consultaCotacao.buscaCotacao("USD", "BRL");

        Double cambio;
        cambio = valor * moeda.conversion_rate();

        String mensagem = "Valor " + valor + "[" + base + "] corresponde ao valor final de = " + cambio + "[" + alvo + "]";

        System.out.println();
        System.out.println(mensagem);

    }
}
