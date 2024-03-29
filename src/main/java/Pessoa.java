package main.java;

 import lombok.Getter;
 import lombok.Setter;

import java.util.Calendar;

 @Getter
 @Setter

/**
 * Created by usuario on 24/09/2019.
 */
public class Pessoa {

  private String cpf;
  private String nome;
  private String dataNascimento;
  private String signo;

//  public Pessoa(String cpf, String nome, String dataNascimento, String signo) {
//    this.cpf = cpf;
//    this.nome = nome;
//    this.dataNascimento = dataNascimento;
//    this.signo = signo;
//  }

 public String getCpfPessoa() {
     return cpf;
 }

 public String getNomePessoa() {
     return nome;
 }

 public String getDataNascimentoPessoa() {
     return dataNascimento;
 }

 public String getSignoPessoa() {
     return signo;
 }

 public void setCpfPessoa(String cpf) {
     this.cpf = cpf;
 }

 public void setNomePessoa(String nome) {
     this.nome = nome;
 }

 public void setDataNascimentoPessoa(String dataNascimento) {
     this.dataNascimento = dataNascimento;
 }

 public void setSignoPessoa(String signo) {
     this.signo = signo;
 }

  @Override
  public String toString()
  {
    return "Pessoa{" +
            "CPF= '" + cpf + '\'' +
            "Nome= '" + nome + '\'' +
            ", Data de Nascimento= " + dataNascimento +
            ", Signo= " + signo +
            '}';
  }

}
