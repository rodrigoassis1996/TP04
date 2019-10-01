/**
 * 
 */
package main.java;


import java.util.List;

public class Operacao {

	public Pessoa alterarPessoa(Pessoa pessoa, String nome, String dataNascimento, String signo, List<Historico> historicoList) {
//		System.out.println("> Alterar Atributo");

//		if (pessoa.getNome() != nome){
//			historicoList.add(new Historico("nome", pessoa.getNome(), nome, pessoa.getCpf()));
//		}
//
//		if (pessoa.getDataNascimento() != dataNascimento){
//			historicoList.add(new Historico("dataNascimento", pessoa.getDataNascimento(), dataNascimento, pessoa.getCpf()));
//		}
//
//		if (pessoa.getSigno() != signo){
//			historicoList.add(new Historico("signo", pessoa.getSigno(), signo, pessoa.getCpf()));
//		}

		pessoa.setNome(nome);
		pessoa.setDataNascimento(dataNascimento);
		pessoa.setSigno(signo);

//		for(Historico historico: historicoList)
//		{
//			System.out.println(historico.toString());
//		}

		return pessoa;
	}

	public void exibirMensagem() {
		System.out.println("> exibirMensagem");
		System.out.println("Exibindo a classe operação.");
	}

	public int subtrair(int a, int b) {
		System.out.println("> subtrair");
		int c = a - b;
		return c;
	}

	public Integer somar(int a, int b) {
		System.out.println("> somar");
		int c = a + b;
		return c;
	}

	public void excecao() {
		System.out.println("Exibindo qualquer mensagem.");
		throw new RuntimeException("Gerando qualquer exceção");
	}
}
