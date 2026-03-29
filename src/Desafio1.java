public class Desafio1 {

    static void main(String[] args) {
        double temperatura = 35;
        double temperaturaFarenheit = (temperatura * 1.8) + 32;
        System.out.printf("A temperatura em celsius é: %.1f, ja a temperatura em Fahrenheit é: %.1f%n",temperatura, temperaturaFarenheit);

        double media = (temperatura + temperaturaFarenheit) / 2;
        System.out.printf("A medias das temperatura é: %.2f%n", media);

        double mediaInteira = (int) media;

        char letra = 'A' ;
        String palavra = "igual";
        System.out.printf("%s é %s a b%n",letra, palavra);

        double precoProduto = 5.99;
        int quantidade = 5;
        double total = precoProduto * quantidade;
        System.out.printf("O valor total é %.2f%n", total);

        double valorDolares = 10;
        double valorReais = valorDolares * 4.94;
        System.out.printf("O valor do produto é $%.2f, que convertido para reais é R$%.2f%n",valorDolares, valorReais);

        double precoOriginal = 5;
        double percentualDesconto = 10;

        double valorDesconto = (percentualDesconto / 100) * precoOriginal;
        double valorFinal = precoOriginal - valorDesconto;

        System.out.printf("O valor do produto com desconto é %.2f, o deconto que voce ganhou foi de %.2f", valorFinal, valorDesconto);

    }

}

