package gerenciamentoPrograma.adicionadores;

import gerenciamentoPrograma.bancoDados.BancoDados;
import usuarios.Usuario;

public class AdicionadorUsuario {

    public void adicionarUsuario(Usuario novoUsuario) {
        BancoDados.getInstancia().getUsuarios().add(novoUsuario);
    }
}
