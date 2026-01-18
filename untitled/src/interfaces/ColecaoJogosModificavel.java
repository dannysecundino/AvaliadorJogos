package interfaces;

import excecoes.ObraJaCadastradaException;
import obras.Obra;

public interface ColecaoJogosModificavel {
    public void add(Obra novo) throws ObraJaCadastradaException;
    public void remove(int id);
}
