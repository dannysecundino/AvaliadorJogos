//SuperModerador aceita ou não os pedidos de criação de contas de Moderadores, além de poder adicionar obras

package usuarios.moderador.superModerador;

import usuarios.moderador.Moderador;
import usuarios.Usuario;
import usuarios.moderador.Moderador;
import gerenciamentoPrograma.bancoDados.BancoDados;
import java.util.ArrayList;

public class SuperModerador extends Moderador {
    public SuperModerador(String nome, String email, String login, String senha) {
        super(nome, email, login, senha);
    }

    public void promoverParaModerador(Usuario usuarioAlvo) {

        if (usuarioAlvo instanceof Moderador) {
            System.out.println("Este usuário já possui cargo elevado.");
            return;
        }

        // 2. Criar o novo objeto Moderador com os dados existentes
        Moderador novoMod = new Moderador(
                usuarioAlvo.getNome(),
                usuarioAlvo.getEmail(),
                usuarioAlvo.getLogin(),
                usuarioAlvo.getSenha()
        );


        BancoDados bd = BancoDados.getInstancia();
        int posicao = bd.getUsuarios().getUsuarios().indexOf(usuarioAlvo);

        if (posicao != -1) {
            bd.getUsuarios().getUsuarios().set(posicao, novoMod);
            System.out.println("Promoção concluída: " + usuarioAlvo.getNome() + " agora é Moderador!");
        }
    }


    public void rebaixarParaJogador(Moderador moderadorAlvo) {
        if (moderadorAlvo instanceof SuperModerador) {
            System.out.println("Não é possível rebaixar o Administrador Único.");
            return;
        }

        Usuario usuarioComum = new Usuario(
                moderadorAlvo.getNome(),
                moderadorAlvo.getEmail(),
                moderadorAlvo.getLogin(),
                moderadorAlvo.getSenha()
        );

        BancoDados bd = BancoDados.getInstancia();
        int index = bd.getUsuarios().getUsuarios().indexOf(moderadorAlvo);

        if (index != -1) {
            bd.getUsuarios().getUsuarios().set(index, usuarioComum);
            System.out.println("Permissões removidas. O usuário " + moderadorAlvo.getNome() + " agora é Jogador.");
        }
    }
}
