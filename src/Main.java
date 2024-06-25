import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner entrada = new Scanner(System.in);
        ConsultaMoeda consulta = new ConsultaMoeda();
        ConversaoRequest conversao = new ConversaoRequest();
        ConversionRate conversionRate;
        double resultado;
        boolean menu = true;
        int valor = 0;

        String operacoes = """
                ************************************************************************
                                
                Bem vindo ao conversor de moedas!!!
                                
                Selecione sua conversão abaixo:
                                
                1 - Real para Dólar
                                
                2 - Dólar para Real
                                
                3 - Peso Argentino para Dólar
                                
                4 - Dólar para Peso Argentino
                                
                5 - Euro para Real
                                
                6 - Euro para Dólar
                                
                7 - Yen para Peso Colombiano
                
                8 - Sair
                
                Escolha uma opção Válida:            
                                
                ************************************************************************
                """;

            while (menu) {
                System.out.println(operacoes);
                valor = entrada.nextInt();

                if (valor == 8) {
                    System.out.println("Sistema finalizado!");
                    break;
                }

                switch (valor) {
                    case 1:
                        conversao.setBaseCode("BRL");
                        conversao.setTargetCode("USD");
                        break;
                    case 2:
                        conversao.setBaseCode("USD");
                        conversao.setTargetCode("BRL");
                        break;
                    case 3:
                        conversao.setBaseCode("ARS");
                        conversao.setTargetCode("USD");
                        break;
                    case 4:
                        conversao.setBaseCode("USD");
                        conversao.setTargetCode("ARS");
                        break;
                    case 5:
                        conversao.setBaseCode("EUR");
                        conversao.setTargetCode("BRL");
                        break;
                    case 6:
                        conversao.setBaseCode("EUR");
                        conversao.setTargetCode("USD");
                        break;
                    case 7:
                        conversao.setBaseCode("JPY");
                        conversao.setTargetCode("COP");
                        break;
                    default:
                        System.out.println("Opção Inválida");
                        break;
                }

                System.out.println("Informe o valor desejado:");
                conversao.setValor(entrada.nextDouble());
                conversionRate = consulta.buscaMoeda(conversao.getBaseCode(), conversao.getTargetCode());
                resultado = conversao.getValor() * conversionRate.conversion_rate();
                System.out.println("Conversão = " + resultado);
            }
    }
}