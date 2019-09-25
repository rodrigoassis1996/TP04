/**
 * 
 */
package main.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Principal.
 */
public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		Pessoa p = new Pessoa("12533909670","Rodrigo", "10/09/1996", "Virgem");
		List<Historico> historicoList = new ArrayList<Historico>();
//		System.out.println(p.toString());

    Operacao o = context.getBean(Operacao.class);
    o.alterarPessoa(p, "João", "10/09/1996", "Virgem", historicoList);
    o.alterarPessoa(p, "João", "10/09/1996", "Touro", historicoList);
    o.alterarPessoa(p, "Maria", "10/07/1987", "Libra", historicoList);
//    System.out.println(p.toString());


	}
}
