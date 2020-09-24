package A1;

import java.util.ArrayList;
import java.util.List;

public class Controller extends Helper{
  static List<Bean> lista = new ArrayList<Bean>();
  static int id = 0;

  public static Bean livroAdicionado() {
    return adicionaLivro("Codigo Limpo", "Livro referente a boas práticas de desenvolvimento", 120.00);
  }

  public static Bean adicionaLivro(String nome, String descricao, double valor) {
    Bean livro = new Bean();
    livro.setId(id);
    livro.setNomeLivro(nome);
    livro.setDescricao(descricao);
    livro.setValor(valor);
    adicionarLivrosLista(livro);
    id++;
    return livro;
  }

  private static List<Bean> adicionarLivrosLista(Bean livro) {
    lista.add(livro);
    return lista;
  }

  public static void listarLivros(){
    for(int i = 0; i<= lista.size()-1;i++){
      imprimeListaLivros(lista, i);
    }
  }

  public static void listaLivro(int id){
    imprimeLivro(lista, id);
  }

  public static void editaLivro(int id, String nome, String descricao, double valor){
    Bean livro = lista.get(id);
    livro.setNomeLivro(nome);
    livro.setDescricao(descricao);
    livro.setValor(valor);
  }

  public static void deletaLivro(int id){
    lista.remove(lista.get(id));
  }
}