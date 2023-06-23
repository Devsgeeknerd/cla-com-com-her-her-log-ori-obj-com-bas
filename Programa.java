package br.com.devsgeeknerd.zoologico.app;

import br.com.devsgeeknerd.zoologico.Animal;
import br.com.devsgeeknerd.zoologico.Cachorro;
import br.com.geeknerd.zoologico.classes.cachorro;

public class Programa {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Toto");
        cachorro.setEspecie("Cachorro");
        cachorro.setIdade(2);

        System.out.println("Ola, seu animal é " + cachorro.getEspecie() + ", o nome do " + "animal é "
                + cachorro.getNome() + " e ele tem " + cachorro.getIdade() + " anos.");

        if (cachorro.ehAdulto()) {
            System.out.println("Animal adulto");
        } else {
            System.out.println("Animal não é adulto");
        }
    }
}
