package exemplos;

import java.util.ArrayList;
import java.util.Calendar;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TimeZone;

public class Comparacoes {
    public static void main(String[] args) {

        Calendar hora = Calendar.getInstance(TimeZone.getTimeZone("Brazil/East"));
        System.out.println("@@@@@@ nova versao @@@@@@");
        System.out.println(hora.getTime());
        System.out.println(hora.get);

        ArrayList<Produto> lista = new ArrayList<>();
        HashSet<Produto> set = new HashSet<>();
        HashMap<Integer, Produto> mapa = new HashMap<>();

        Produto p1 = new Produto(111, "Produto1");
        Produto p2 = new Produto(222, "Produto2");

        //lista permite duplicar conteúdos
        lista.add(p1);
        lista.add(p1);

        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println(lista);

        //Set não permite duplicar conteúdos
        set.add(p1);
        set.add(p1);

        System.out.println("Tamanho do set: " + set.size()); 
        System.out.println(set);

        //Map não permite duplicar chaves
        mapa.put(p1.getCodigo(), p1);
        mapa.put(p2.getCodigo(), p2);

        System.out.println("Tamanho do Map: " + mapa.size()); 
        //System.out.println(mapa);
        for (Integer key : mapa.keySet()) {
            System.out.println("Elemento do mapa na chave " + key + " : " + mapa.get(key));
        }

        //Get retorna o elemento com a chave informada
        //nao é necessário fazer buscas na estrutura
        System.out.println("Produto 111: " +  mapa.get(111));
    }
}
