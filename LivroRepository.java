import java.util.LinkedList;
import java.util.List;

public class LivroRepository {
    private List<Livro> livros;

    public void alterarDisponibilidade(String titulo) {
        for(Livro livro:livros) {
            if(livro.getTitulo().equals(titulo)) {
                livro.toggleDisponivel();
            }
        }
    }

    public List<Livro> buscarLivrosDisponíveis() {

        List<Livro> livrosDisponiveis = new LinkedList<Livro>();
        for(Livro livro: livros) {
            if(livro.getDisponivel()) {
                livrosDisponiveis.add(livro);
            }
        }
        return livrosDisponiveis;
    }

    public void cadastrarLivro(String titulo, String id) {
        livros.add(new Livro(titulo, id));
    }

    public List<Livro> buscarTodosOsLivros(){
        return this.livros;
    }
}
