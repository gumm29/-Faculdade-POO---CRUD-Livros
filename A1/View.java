package A1;

import java.util.Scanner;

public class View extends Controller{
  public static void livraria(){
    imprimeMenu();
    Scanner out = new Scanner(System.in);
    System.out.println("Escolha o que deseja fazer :D");
    int escolheMenu = out.nextInt();
    switch(escolheMenu){
      case 1:
        listarTodosLivros();
        livraria();
        break;
      case 2:
        listarUmLivro();
        livraria();
        break;
      case 3:
        adicionaUmLivro();
        livraria();
        break;
      case 4:
        editarUmLivro();
        livraria();
        break;
      case 5:
        deletarUmLivro();
        livraria();
        break;
      case 10:
        sair();
        break;
    }
  }

  private static void listarTodosLivros(){
    apresentacaoMenu();
    System.out.println("Listar livros");
    listarLivros();
    apresentacaoMenu();
  }

  private static void adicionaUmLivro(){
    apresentacaoMenu();
    System.out.println("Adiciona livro");
    Scanner out = new Scanner(System.in);
    System.out.println("Digite o nome do livro");
    String nome = out.nextLine();
    System.out.println("Digite a descrição do livro");
    String descricao = out.nextLine();
    System.out.println("Digite o valor do livro");
    double valor = out.nextDouble();
    adicionaLivro(nome, descricao, valor);
    apresentacaoMenu();
  }

  private static void editarUmLivro(){
    apresentacaoMenu();
    System.out.println("Editar livro");
    Scanner out = new Scanner(System.in);
    System.out.println("Digite o id do livro");
    int id = out.nextInt();
    System.out.println("Digite o nome do livro");
    String nome = out.nextLine();
    System.out.println("Digite a descrição do livro");
    String descricao = out.nextLine();
    System.out.println("Digite o valor do livro");
    double valor = out.nextDouble();
    try {
      editaLivro(id, nome, descricao, valor);
    } catch (Exception e) {
      System.out.println("Não existe o id selecionado");
    }
    apresentacaoMenu();
  }

  private static void listarUmLivro(){
    apresentacaoMenu();
    Scanner out = new Scanner(System.in);
    System.out.println("Digite um id para ser listado");
    int escolheId = out.nextInt();
    System.out.println("Listar livros por id "+id);
    try {
      listaLivro(escolheId);
    } catch (Exception e) {
      System.out.println("Não existe o id selecionado");
    }
    apresentacaoMenu();
  }

  private static void deletarUmLivro(){
    apresentacaoMenu();
    System.out.println("Deleta livro");
    Scanner out = new Scanner(System.in);
    System.out.println("Digite um id para ser deletado");
    int escolheId = out.nextInt();
    try {
      deletaLivro(escolheId);
    } catch (Exception e) {
      System.out.println("Não existe o id selecionado");
    }
    apresentacaoMenu();
  }

  private static void sair(){
    listarLivros();
    System.out.println("Até mais! :D");
  }
}