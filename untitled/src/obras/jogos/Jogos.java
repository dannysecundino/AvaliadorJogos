package obras.jogos;

import obras.Obra;

public class Jogos extends Obra {
    private String genero;
    private String plataforma;

    public Jogos(int id, String titulo, String desenvolvedor, int ano, String genero, String plataforma) {
        super(id, titulo,ano,desenvolvedor);
        this.genero = genero;
        this.plataforma = plataforma;
    }

    public String getGenero(){
        return this.genero;
    }

    public String getPlataforma(){
        return this.plataforma;
    }
    @Override
    public String exibirDetalhes() {

        return String.format("JOGO: %s (%d)\nDesenvolvedora: %s\nGênero: %s\nPlataforma: %s\nMédia: %.1f",
                getTitulo(), getAno(), getDesenvolvedor(), genero, plataforma, getMedia());
    }
}
