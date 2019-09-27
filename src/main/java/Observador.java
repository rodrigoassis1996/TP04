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

@Aspect
public class Observador {

	@Before("execution(* Pessoa.setNome(*))")
	public void logAntesSetNome(JoinPoint joinPoint) {
		System.out.println("------");
		System.out.println("Antes de executar o método: " + joinPoint.getSignature().getName());
		System.out.println("Tinha-se o objeto " + joinPoint.getArgs()[0]);
	}

	@Around("execution(* Pessoa.setNome(..))")
	public Object logEmSetNome(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("------");
		System.out.println("Antes do método: " + pjp.getSignature().getName());
		Object o = pjp.proceed();
		System.out.println("Depois do método: " + pjp.getSignature().getName());
		System.out.println("------");

		return o;
	}

	@After("execution(* Pessoa.setNome(..))")
	public void logAposSetNome(JoinPoint joinPoint) {
		System.out.println("------");
		System.out.println("Após executar o método: " + joinPoint.getSignature().getName());
		System.out.println("Tinha-se o objeto " + joinPoint.getArgs()[0]);
		System.out.println("------");
	}

	@Before("execution(* Operacao.alterarPessoa(..))")
	public void logAntesAlterarPessoa(JoinPoint joinPoint) {
		System.out.println("------");
		System.out.println("Antes de executar o método: " + joinPoint.getSignature().getName());
		System.out.println("Tinha-se o objeto " + joinPoint.getArgs()[0]);
	}

}
