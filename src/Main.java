public class Main {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.fala();

        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dobrarNumero(5);
        System.out.println(resultado);

        Musica musica = new Musica();

        musica.titulo = "Dias de luta ";
        musica.artista = "Chorão ";
        musica.anoLancamento = 2010;

        musica.exibeFichaTecnica();

        musica.avalia(5);
        musica.avalia(4);

        double mediaAvaliacoes = musica.mediaAvaliacao();
        System.out.println("media das avaliações é " + mediaAvaliacoes);

        Carro carro = new Carro();
        carro.modelo = "Fox";
        carro.ano = 2013;
        carro.cor = "Branco";

        carro.exibeFichaCarro();

        System.out.println("A idade do carro é" + carro.idadeCarro() + "anos");

        Aluno aluno = new Aluno();
        aluno.idade = 22;
        aluno.nome = "Gustavo";

        aluno.caracteristicas();
    }
}
