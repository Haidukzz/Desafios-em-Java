package Desafio.Animais.Domesticos;

import Desafio.Carro.Modelo.Carro;

public class TesteAnimal {
    static void main(String[] args) {

        Cachorro tobby = new Cachorro();
        tobby.emitirSom();
        tobby.abanarRabo();

        Gato myrtis = new Gato();
        myrtis.arranharMoveis();
        myrtis.emitirSom();
    }
}
