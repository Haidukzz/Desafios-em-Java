public class Musica {

    String titulo;
    String artista;
    int anoLancamento;
    int avaliacao;
    double numAvaliacao;

    void exibeFichaTecnica() {
        System.out.println("O titulo é " + titulo);
        System.out.println("O cantor é " + artista);
        System.out.println("O ano de lançamento da musica é " + anoLancamento);
    }

    void avalia(double nota) {
        avaliacao += nota;
        numAvaliacao++;
    }

    double mediaAvaliacao() {
        return avaliacao/numAvaliacao;
    }

}
