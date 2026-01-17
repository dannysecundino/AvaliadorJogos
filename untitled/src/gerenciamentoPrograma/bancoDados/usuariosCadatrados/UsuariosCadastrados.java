package gerenciamentoPrograma.bancoDados.usuariosCadatrados;

import obras.Obra;
import usuarios.Usuario;

import java.util.ArrayList;

public class UsuariosCadastrados {
    private static ArrayList<Usuario> usuariosCadastrados = new ArrayList<>();

    public void add(Usuario novo) {
        int i = 0;
        while (i < usuariosCadastrados.size() &&
                usuariosCadastrados.get(i).getNome()
                        .compareToIgnoreCase(novo.getNome()) < 0) {
            i++;
        }
        usuariosCadastrados.add(i, novo);
    }

    public ArrayList<Usuario> getUsuarios() { return usuariosCadastrados; }
}
