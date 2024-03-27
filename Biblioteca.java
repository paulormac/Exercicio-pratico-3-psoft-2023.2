import java.util.LinkedList;
import java.util.List;

public class Biblioteca {
    private LivroRepository livroRepository;


    public void cadastrarLivro(String titulo, String id) {
        livroRepository.cadastrarLivro(titulo, id);
    }

    public void alterarDisponibilidade(String titulo) {
        livroRepository.alterarDisponibilidade(titulo);
    }

    public List<Livro> buscarTodosOsLivros() {
        return livroRepository.buscarTodosOsLivros();
    }

    public List<Livro> buscarLivrosDisponíveis() {

        return livroRepository.buscarLivrosDisponíveis();
    }
}
