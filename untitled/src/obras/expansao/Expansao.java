package obras.expansao;

import obras.Obra;
import obras.jogo.Jogo;

public class Expansao extends Obra {
    private Jogo jogoBase;

    public Jogo getJogoBase() {
        return this.jogoBase;
    }
    public Expansao(int id, String titulo, String desenvolvedor, int ano, Jogo jogoBase) {
        super(id, titulo,ano,desenvolvedor);
        this.jogoBase = jogoBase;
    }


    @Override
    public String exibirDetalhes() {
        return String.format("EXPANSÃO: %s (%d)\nJogo Base: %s\nDesenvolvedora: %s\nMédia: %.1f",
                getTitulo(), getAno(), jogoBase.getTitulo(), getDesenvolvedor(), getMedia());
    }
    public boolean igual(Obra outra) {
        if(outra instanceof Expansao && outra.getTitulo().equalsIgnoreCase(this.getTitulo()) &&  outra.getAno() == this.getAno()
                && outra.getDesenvolvedor().equalsIgnoreCase(this.getDesenvolvedor()) && ((Expansao)outra).getJogoBase().igual(this.getJogoBase()) ) return true;
        else return false;
    }
}
