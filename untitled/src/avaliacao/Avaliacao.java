package avaliacao;
import usuarios.Usuario;
import obras.Obra;
public class Avaliacao {
    private int nota;
    private Usuario autor;
    private String comentario;
    public Avaliacao(int nota, Usuario usuario,String comentario){
        this.nota = nota;
        this.autor = usuario;
        this.comentario = comentario;
    }
    public int getNota() {
        return nota;
    }

    public Usuario getAutor(){
        return this.autor;
    }

    public String getComentario(){
        return this.comentario;
    }
}
