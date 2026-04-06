package Desafio.Carro.Modelo;

public class Carro {
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;
    private String modelo;

    public void definirModelo(String modelo){
        this.modelo = modelo;
    }

    public void definirPreco(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public void definirInfo() {
        System.out.println("O modelo do carro é " + modelo);
        System.out.println("O preço do carro no primeiro ano é de: " + precoAno1);
        System.out.println("O preço do carro no segundo ano é de: " + precoAno2);
        System.out.println("O preço do carro no terceiro ano é de: " + precoAno3);
        System.out.println("O maior preço do carro foi de: " + calcularMaiorPreco());
        System.out.println("O menor preço do carro foi de: " + calculaMenorPreco());
    }

    public double calculaMenorPreco() {
        double menorPreco = precoAno1;

        if (precoAno2 < menorPreco) {
            menorPreco = precoAno2;
        }
        if (precoAno3 < menorPreco){
            menorPreco = precoAno3;
        }

        return menorPreco;
    }

    public double calcularMaiorPreco() {
        double maiorPreco = precoAno1;

        if (precoAno2 > maiorPreco) {
            maiorPreco = precoAno2;
        }
        if (precoAno3 > maiorPreco){
            maiorPreco = precoAno3;
        }
        return maiorPreco;
    }

}
