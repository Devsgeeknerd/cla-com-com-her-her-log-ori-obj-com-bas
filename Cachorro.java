package br.com.geeknerd.zoologico.classes;

public class cachorro extends Animal {
    public Cachorro(String nome) {
        super(String nome);
    }

    public Cachorro(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }

    public Cachorro(String nome, int idade) {
        super(nome, idade,"Cachorro");
    }
}
