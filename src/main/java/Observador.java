/**
 * 
 */
package main.java;

import org.aspectj.lang.JoinPoint;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.ArrayList;
import java.util.List;

@Aspect
public class Observador {

	@Before("execution(* Pessoa.getNomePessoa(*))")
	public void logAntesSetNome(JoinPoint joinPoint) {
		System.out.println("------");
		System.out.println("Antes de executar o método: " + joinPoint.getSignature().getName());
	}

	@After("execution(* Pessoa.getNomePessoa(..))")
	public void logAposSetNome(JoinPoint joinPoint) {
		System.out.println("------");
		System.out.println("Após executar o método: " + joinPoint.getSignature().getName());
		System.out.println("------");
	}

//	@Before("execution(* Pessoa.setNome(*))")
//	public void logAntesSetNome(JoinPoint joinPoint) {
//		System.out.println("------");
//		System.out.println("Antes de executar o método: " + joinPoint.getSignature().getName());
//		System.out.println("Tinha-se o objeto " + joinPoint.getArgs()[0]);
//	}

	@Around("execution(* Pessoa.setNomePessoa(..))")
	public Object logEmSetNomePessoa(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("------");
		System.out.println("Antes do método: " + pjp.getSignature().getName());
		System.out.println("Args: " + pjp.getArgs()[0]);
		System.out.println("Get Target: " + pjp.getTarget());

		List<Historico> historicoList = new ArrayList<Historico>();
		historicoList.add(new Historico("nome", "", (String)pjp.getArgs()[0]));

		Object o = pjp.proceed();
		System.out.println("Depois do método: " + pjp.getSignature().getName());
		System.out.println("Atributo: " + pjp.getTarget());
		System.out.println("Atributo: " + pjp.proceed());

		System.out.println("------");

		return o;
	}

//	@After("execution(* Pessoa.setNome(..))")
//	public void logAposSetNome(JoinPoint joinPoint) {
//		System.out.println("------");
//		System.out.println("Após executar o método: " + joinPoint.getSignature().getName());
//		System.out.println("Tinha-se o objeto " + joinPoint.getArgs()[0]);
//		System.out.println("------");
//	}
//
//	@Before("execution(* Operacao.alterarPessoa(..))")
//	public void logAntesAlterarPessoa(JoinPoint joinPoint) {
//		System.out.println("------");
//		System.out.println("Antes de executar o método: " + joinPoint.getSignature().getName());
//		System.out.println("Tinha-se o objeto " + joinPoint.getArgs()[0]);
//	}

}
