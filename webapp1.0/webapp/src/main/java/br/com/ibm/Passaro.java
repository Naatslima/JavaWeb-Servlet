package br.com.ibm;

public class Passaro extends Animal {
        private int idade;
        private String raca;
        private String cor;

        public Passaro(String nome, String especie, int idade, String raca, String cor) {
            super(nome, especie);
            this.idade = idade;
            this.raca = raca;
            this.cor = cor;
        }

        public int getIdade() {
            return idade;
        }

        public String getRaca() {
            return raca;
        }

        public String getCor() {
            return cor;
        }

        @Override
        public String fazerSom() {
            return "Dá o pé Louro! hahaha";
        }
    }

