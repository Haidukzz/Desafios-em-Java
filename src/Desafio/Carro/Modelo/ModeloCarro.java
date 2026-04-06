package Desafio.Carro.Modelo;

    public class ModeloCarro extends Carro {

         private int kilometragem;
         private String marca;

        public void setKilometragem(int kilometragem) {
            this.kilometragem = kilometragem;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        @Override
        public void definirInfo() {
            super.definirInfo();

            System.out.println("Marca: " + marca);
            System.out.println("Kilometragem: " + kilometragem);
        }
    }


