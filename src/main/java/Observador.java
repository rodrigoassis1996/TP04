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

	@Before("execution(* Operacao.alterarPessoa(..))")
	public void logAntesAlterarPessoa(JoinPoint joinPoint) {
		System.out.println("------");
		System.out.println("Antes de executar o método: " + joinPoint.getSignature().getName());
		System.out.println("Tinha-se o objeto " + joinPoint.getArgs()[0]);
	}

//	@After("execution(* Operacao.alterarPessoa(..))")
//	public void logAposAlterarPessoa(JoinPoint joinPoint) {
//		System.out.println("------");
//		System.out.println("Após executar o método: " + joinPoint.getSignature().getName());
//		System.out.println("Tinha-se o objeto " + joinPoint.getArgs()[0]);
//		System.out.println("que virou " + joinPoint.getThis());
//		System.out.println("------");
//	}

	@AfterReturning(pointcut = "execution(* Operacao.alterarPessoa(..))", returning="result")
	public void logAposRetorno(JoinPoint joinPoint, Object result) {
		System.out.println("que virou " + result);
		System.out.println("------");
	}

	@Around("execution(* Operacao.somar(..))")
	public Object logEmVoltaSomar(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("------");
		System.out.println("Antes do método: " + pjp.getSignature().getName());
		Object o = pjp.proceed();
		System.out.println("Depois do método: " + pjp.getSignature().getName());
		System.out.println("------");
		
		return o; 
	}
	
	@AfterThrowing(
			pointcut = "execution(* Operacao.excecao(..))",  
            throwing= "error")  
	public void logAposGerarExcecao(JoinPoint joinPoint,Throwable error) {
		System.out.println("------");
		System.out.println("Após o retorno do método: " + joinPoint.getSignature().getName());
		System.out.println("Erro: " + error.getMessage());
		System.out.println("------");
	}
	
}
