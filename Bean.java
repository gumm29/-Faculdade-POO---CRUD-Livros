package A1;

public class Bean {
  private long id;
  private String nomeLivro;
  private String descricao;
  private double valor;

  public long getId(){ return this.id; }
  public void setId(long id){ this.id = id; }

  public String getNomeLivro(){ return this.nomeLivro; }
  public void setNomeLivro(String nomeLivro){ this.nomeLivro = nomeLivro; }

  public String getDescricao(){ return this.descricao; }
  public void setDescricao(String descricao){ this.descricao = descricao; }

  public double getValor(){ return this.valor; }
  public void setValor(double valor){ this.valor = valor; }
}
