package gerenciamentoPrograma.bancoDados.obrasCatalogadas;

import interfaces.ColecaoJogosModificavel;
import obras.Obra;

import java.util.ArrayList;

public class ObrasCatalogadas implements ColecaoJogosModificavel {

    private static ArrayList<Obra> obrasCatalogadas = new ArrayList<>();

    @Override
    public void add(Obra novo) {
        int i = 0;
        while (i < obrasCatalogadas.size() &&
                obrasCatalogadas.get(i).getTitulo()
                        .compareToIgnoreCase(novo.getTitulo()) < 0) {
            i++;
        }
        obrasCatalogadas.add(i, novo);
    }

    @Override
    public void remove(int id) {
        getObras().removeIf(o -> o.getId() == id);
    }

    public ArrayList<Obra> getObras() { return obrasCatalogadas; }
}
