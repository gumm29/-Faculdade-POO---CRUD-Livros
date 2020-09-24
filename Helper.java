package A1;

import java.util.List;

public class Helper{
  public static void imprimeLivro(List<Bean> lista, int i){
    System.out.println("Id: "+lista.get(i).getId());
    System.out.println("Nome livro: "+lista.get(i).getNomeLivro());
    System.out.println("Descrição: "+lista.get(i).getDescricao());
    System.out.println("Valor: "+lista.get(i).getValor());
  }

  public static void imprimeListaLivros(List<Bean> lista, int i){
    imprimeLivro(lista, i);
    System.out.println("################");
  }

  public static void imprimeMenu(){
    System.out.println("Bem vindo ao CRUD bibliotecário!");
    System.out.println("Escolha uma opção - Digite o numero do menu desejado");
    System.out.println("1 - Listar todos os livros");
    System.out.println("2 - Lista livro por id");
    System.out.println("3 - Adicionar um livro");
    System.out.println("4 - Editar um livro");
    System.out.println("5 - Deletar um livro");
    System.out.println("10 - Sair");
    System.out.println("Obs: já adicionamos um livro!");
  }

  public static void apresentacaoMenu(){
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("##############");
  }
}
