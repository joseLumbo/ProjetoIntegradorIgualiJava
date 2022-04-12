package br.com.generation.igualijava;

import java.util.ArrayList;
import java.util.Scanner;

//Descontos.
//5% - 10% por renda.
//10% por etnia.
//5% por orienta��o sexual.
//5% por identidade de g�nero.
public class IgualiJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner valor = new Scanner(System.in);
		Cadastro pe1 = new Cadastro();

		// Vari�veis.
		int descontoEtnia = 0;
		int descontoOrientacaoSexual = 0;
		int descontoIdentidade = 0;
		int descontoRenda = 0;
		double descontoTotal = 0.0;
		double conta = 0.0;
		double pagar = 0.0;

		// Declara��o.
		ArrayList<String> orientaS = new ArrayList<>();
		ArrayList<String> identidadeGenero = new ArrayList<>();
		ArrayList<String> etniaArray = new ArrayList<>();
		// ArrayList<String> renda = new ArrayList<>();

		// Etnias.
		etniaArray.add("(1)Negro(a)");
		etniaArray.add("(2)Pardo(a)");
		etniaArray.add("(3)Ind�gena");
		etniaArray.add("(4)Branco(a)");
		etniaArray.add("(5)Prefiro n�o dizer.");
		
		// Orienta��o sexual.
		orientaS.add("(1)Homossexual");
		orientaS.add("(2)Bissexual");
		orientaS.add("(3)PanSexual");
		orientaS.add("(4)Assexual");
		orientaS.add("(5)H�tero");
		orientaS.add("(6)Prefiro n�o dizer.");
		
		// Identidade de g�nero.
		identidadeGenero.add("(1)Cisg�nero");
		identidadeGenero.add("(2)N�o-Bin�rio");
		identidadeGenero.add("(3)Travesti");
		identidadeGenero.add("(4)Transg�nero");
		identidadeGenero.add("(5)Prefiro n�o dizer.");

		System.out.println("********************************************");
		System.out.println("**                                        **");
		System.out.println("**              IgualiJava!               **");
		System.out.println("**                                        **");
		System.out.println("**    Dando um desconto para sua a VIDA!   **");
		System.out.println("********************************************");
		System.out.println();

		System.out.println("--------------------------------------------");
		System.out.println();

		// Cadastro do Usu�rio.
		System.out.println("--------------------------------------------");
		System.out.println("| Queremos conhecer um pouco mais de voc�. |");
		System.out.println("--------------------------------------------");
		System.out.println();

		// Cadastro do Usu�rio.
		System.out.println("Informe o seu Nome: ");
		pe1.setNome(valor.nextLine());
		System.out.println();

		try {
		System.out.println(pe1.getNome() + ", voc� se identifica com qual Etnia?\n" + etniaArray);
		int m = valor.nextInt();
		
		if (m != 1 && m != 2 && m != 3 && m != 4 && m != 5 ) {
			System.out.println("Op��o inv�lida! Por favor, recomece todas as etapas." + "\nCertique-se que est� digitando um n�mero dentro das op��es apresentadas.");
			System.exit(m);
		}
		
		pe1.setEtnia(etniaArray.get(m - 1));
		// System.out.println(pe1.getEtnia());

		if (pe1.getEtnia() == "(1)Negro(a)") {
			descontoEtnia = 10;
		} 
		else if (pe1.getEtnia() == "(2)Pardo(a)") {
			descontoEtnia = 10;
		} 
		else if (pe1.getEtnia() == "(3)Indigena") {
			descontoEtnia = 10;
		} 
		else if (pe1.getEtnia() == "(4)Branco(a)") {
			descontoEtnia = 0;
		} 
		else if (pe1.getEtnia() == "(5)Prefiro n�o dizer.") {
			descontoEtnia = 0;
			System.out.println("Infelizmente n�o vamos poder contalizar"
					+ " seu desconto desta etapa. � importante detalhar todas as condi��es,"
					+ " mas sem problemas! Continue nas pr�ximas etapas, e faremos o c�lculo total.");
		}}
		catch(java.util.InputMismatchException errorLetra) {
            System.out.println("Op��o inv�lida! S�o aceitos somente n�meros nesta etapa. Por favor, recomece todas as etapas.");
            System.exit(descontoEtnia);
        }		
		System.out.println(descontoEtnia + "% de desconto");
		System.out.println("--------------------------------------------");
		System.out.println();

		try {
		System.out.println(pe1.getNome() + ", qual sua Orienta��o Sexual?\n" + orientaS);
		int n = valor.nextInt();
		
		if (n != 1 && n != 2 && n != 3 && n != 4 && n != 5 && n != 6) {
			System.out.println("Op��o inv�lida! Por favor, recomece todas as etapas." + "\nCertique-se que est� digitando um n�mero dentro das op��es apresentadas.");
			System.exit(n);
		}
		
		pe1.setOrientSexo(orientaS.get(n - 1));
		// System.out.println(pe1.getOrientSexo());

		if (pe1.getOrientSexo() == "(1)Homossexual") {
			descontoOrientacaoSexual = 5;
		} 
		else if (pe1.getOrientSexo() == "(2)Bissexual") {
			descontoOrientacaoSexual = 5;
		} 
		else if (pe1.getOrientSexo() == "(3)PanSexual") {
			descontoOrientacaoSexual = 5;
		} 
		else if (pe1.getOrientSexo() == "(4)Assexual") {
			descontoOrientacaoSexual = 5;
		} 
		else if (pe1.getOrientSexo() == "(5)H�tero") {
			descontoOrientacaoSexual = 0;
		} 
		else if (pe1.getOrientSexo() == "(6)Prefiro n�o dizer.") {
			descontoOrientacaoSexual = 0;
			System.out.println("Infelizmente n�o vamos poder contalizar"
					+ " seu desconto desta etapa. � importante detalhar todas as condi��es."
					+ "\nMas sem problemas! Continue nas pr�ximas etapas, e faremos o c�lculo total.");
		}}
		catch(java.util.InputMismatchException errorLetra) {
            System.out.println("Op��o inv�lida! S�o aceitos somente n�meros nesta etapa. Por favor, recomece todas as etapas.");
            System.exit(descontoOrientacaoSexual);
        }

		System.out.println(descontoOrientacaoSexual + "% de desconto");
		System.out.println("--------------------------------------------");
		System.out.println();

		try {
		System.out.println(pe1.getNome() + ", com rela��o ao seu g�nero, como voc� se identifica?\n" + identidadeGenero);
		int o = valor.nextInt();
		
		if (o != 1 && o != 2 && o != 3 && o != 4 && o != 5) {
			System.out.println("Op��o inv�lida! Por favor, recomece todas as etapas." + "\nCertique-se que est� digitando um n�mero dentro das op��es apresentadas.");
			System.exit(o);
		}

		pe1.setIdentiGenero(identidadeGenero.get(o - 1));
		//System.out.println(pe1.getIdentiGenero());

		if (pe1.getIdentiGenero() == "(1)Cisg�nero") {
			descontoIdentidade = 0;
		}
		else if (pe1.getIdentiGenero() == "(2)N�o-Bin�rio") {
			descontoIdentidade = 5;
		}
		else if (pe1.getIdentiGenero() == "(3)Travesti") {
			descontoIdentidade = 5;
		}
		else if (pe1.getIdentiGenero() == "(4)Transg�nero") {
			descontoIdentidade = 5;
		}
		else if (pe1.getIdentiGenero() == "(5)Prefiro n�o dizer.") {
			descontoIdentidade = 0;
			System.out.println("Infelizmente n�o vamos poder contabilizar"
					+ " seu desconto desta etapa. � importante detalhar todas as condi��es."
					+ "\nMas sem problemas! Continue nas pr�ximas etapas, e faremos o c�lculo total.");
		}}
		catch(java.util.InputMismatchException errorLetra) {
            System.out.println("Op��o inv�lida! S�o aceitos somente n�meros nesta etapa. Por favor, recomece todas as etapas.");
            System.exit(descontoIdentidade);
        }
		
		System.out.println(descontoIdentidade + "% de desconto");
		System.out.println("--------------------------------------------");
		System.out.println();

		try {
		System.out.println(pe1.getNome() + ", qual seu sal�rio ou ganhos mensais?");
		double p = valor.nextDouble();
		// System.out.println(pe1.getRenda());
		if (p <= 1212.00) {
			descontoRenda = 10;
		} else if (p > 1212.00) {
			descontoRenda = 5;
		} else if(p <= 2000.00) {
			descontoRenda = 0;
		}}
		catch(java.util.InputMismatchException errorNumero) {
            System.out.println("Op��o inv�lida! Digite apenas n�meros nesta etapa, Ex: 1000 ou 1000,00. Por favor, recomece todas as etapas.");
            System.exit(descontoRenda);
        }		

		System.out.println(descontoRenda + "% de desconto");
		System.out.println("--------------------------------------------");
		System.out.println();

		System.out.println("---------------------------------------------------");
		System.out.println("| Pronto! Estamos com as informa��es necess�rias. |");
		System.out.println("|      Hora de calcular o quanto voc� pagar�.     |");
		System.out.println("---------------------------------------------------");
		System.out.println();

		// Apresenta��o dos c�lculo para pagar.
		descontoTotal = descontoEtnia += descontoOrientacaoSexual += descontoIdentidade += descontoRenda;
		System.out.println(descontoTotal + "% de desconto total");
		System.out.println();

		try {
		System.out.println(pe1.getNome() + ", qual o valor da conta a ser dividida?");
		double q = valor.nextDouble();
		conta = q;
		}
		catch(java.util.InputMismatchException errorNumero) {
            System.out.println("Op��o inv�lida. Digite apenas n�meros nesta etapa, Ex: 1000 ou 1000,00. Por favor, recomece todas as etapas.");
            System.exit(descontoRenda);
		}
		
        double r = descontoTotal;
		double s = r / 100.00 * conta;
		pagar = conta - s;
		System.out.printf("Valor a pagar �  R$%.2f: ", pagar);
		System.out.println();
	
		valor.close();
	}

}