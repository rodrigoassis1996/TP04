package main.java;

import java.util.Calendar;

/**
 * Created by usuario on 24/09/2019.
 */
public class Historico {

  private String atributo;
  private String valorAnterior;
  private String valorAtual;

  public Historico(String atributo, String valorAnterior, String valorAtual) {
    this.atributo = atributo;
    this.valorAnterior = valorAnterior;
    this.valorAtual = valorAtual;
  }

  @Override
  public String toString()
  {
    return "Historico{" +
            "atributo= '" + atributo + '\'' +
            ", Valor Anterior= " + valorAnterior +
            ", Valor Atual= " + valorAtual +
            '}';
  }
}
