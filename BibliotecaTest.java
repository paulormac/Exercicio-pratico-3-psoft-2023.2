import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {
    // TODOS OS TESTES SE REFEREM ÀS FUNCIONALIDADES DA US2

    // retornar uma lista vazia, quando nenhum livro foi cadastrado
    @Test
    public void testeBibliotecaVazia() throws Exception{
        Biblioteca biblioteca = new Biblioteca();

        List<Livro> listaVazia = new LinkedList<Livro>();

        assert(biblioteca.buscarTodosOsLivros().equals(listaVazia));
    }
    // retornar todos os livros cadastrados quando todos os livros estão disponíveis
    @Test
    public void teste1() throws Exception{
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.cadastrarLivro("Xadrez", "12345");
        biblioteca.cadastrarLivro("Damas", "678910");

        assert(biblioteca.buscarLivrosDisponíveis().equals(biblioteca.buscarTodosOsLivros()));
    }

    //retornar apenas os livros cadastrados E disponíveis
    @Test
    public void teste2() throws Exception{
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.cadastrarLivro("Xadrez", "12345");
        biblioteca.cadastrarLivro("Damas", "678910");
        biblioteca.alterarDisponibilidade("Xadrez");

        List<Livro> esperado = new LinkedList<Livro>();
        esperado.add(new Livro("Xadrez", "12345", true, false));

        assert(biblioteca.buscarLivrosDisponíveis().equals(esperado));
    }
}