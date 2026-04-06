package Desafio.Carro.Modelo;

public class TesteCarro {
    static void main(String[] args) {

        ModeloCarro carro1 = new ModeloCarro();
        carro1.setKilometragem(55000);
        carro1.setMarca("Nissan");
        carro1.definirModelo("Sedan");
        carro1.definirPreco(25000,35594,24050);
        carro1.definirInfo();
    }
}
