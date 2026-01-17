package gerenciamentoPrograma.bancoDados;

import gerenciamentoPrograma.bancoDados.obrasCatalogadas.ObrasCatalogadas;
import gerenciamentoPrograma.bancoDados.usuariosCadatrados.UsuariosCadastrados;
import obras.Obra;
import usuarios.Usuario;

import java.util.ArrayList;

public class BancoDados {
    private static BancoDados instancia;
    private static ObrasCatalogadas obrasCatalogadas =  new ObrasCatalogadas();
    private static UsuariosCadastrados usuariosCadastrados = new UsuariosCadastrados();


    public static BancoDados getInstancia() {
        if (instancia == null) instancia = new BancoDados();
        return instancia;
    }

    public UsuariosCadastrados getUsuarios() { return usuariosCadastrados; }
    public ObrasCatalogadas getObras() { return obrasCatalogadas; }

}
