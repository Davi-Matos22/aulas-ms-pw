package br.edu.cpti;

public class TesteAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String cor ="verde";
		//Strimg cor = new String("verde");
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Joaquim";
		aluno1.telefone = "2244-3456";
		aluno1.email = "joaquim@gmail.com";
		
		System.out.println("Dados aluno: "+ aluno1.email);
		
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		
		if (aluno2 == aluno3) {
			System.out.println("Iguais");
		}else {
			System.out.println("Diferentes");
		}
	}
	
}
