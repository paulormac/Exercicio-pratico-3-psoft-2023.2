public class Livro {
    private String id;
    private String titulo;
    private boolean disponivel;
    private boolean reservado;

    public Livro(String titulo, String id) {
        this.titulo = titulo;
        this.id = id;
        this.disponivel = true;
        this.reservado = false;
    }

    public Livro(String titulo, String id, boolean disponivel, boolean reservado) {
        this.titulo = titulo;
        this.id = id;
        this.disponivel = true;
        this.reservado = false;
    }

    public boolean getDisponivel(){
        return this.disponivel;
    }

    public void toggleDisponivel(){
        if(disponivel) {
            this.disponivel = false;
        } else {
            this.disponivel = true;
        }
    }

    public void setDisponivel(boolean disp) {
        this.disponivel = disp;
    }

    public Object getTitulo() {
        return this.titulo;
    }
}