package lista02;
import java.util.Scanner;

public class Questoes {
	public static void exercicio1() {
	        int n = 10; 
	        int a = 0, b = 1, c;

	        System.out.print(a + " " + b);

	        for (int i = 3; i <= n; ++i) {
	            c = a + b;
	            System.out.print(" " + c);
	            a = b;
	            b = c;
	     }
	}
	public static void exercicio2() {
		int a = 0, b = 1, c=0;  

        System.out.print(a + " " + b);

        while (c <= 500) {
            c = a + b;  
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
	public static void exercicio3() {
	 Scanner scanner = new Scanner(System.in);

     System.out.print("Digite um número inteiro: ");
     int numero = scanner.nextInt();

     int fatorial = 1;
     System.out.print(numero + "! = ");
     for (int i = 1; i <= numero; i++) {
         fatorial *= i;
         if (i > 1) {
             System.out.print(" * " + i);
         }
     }

     System.out.println(" = " + fatorial);
 }
	public static void exercicio4() {
		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a quantidade de números: ");
	        int n = scanner.nextInt();

	        int menor = Integer.MAX_VALUE;
	        int maior = Integer.MIN_VALUE;
	        int soma = 0;

	        for (int i = 1; i <= n; i++) {
	            System.out.print("Digite o " + i + "º número: ");
	            int numero = scanner.nextInt();

	            if (numero < menor) {
	                menor = numero;
	            }

	            if (numero > maior) {
	                maior = numero;
	            }

	            soma += numero;
	        }

	        System.out.println("Menor valor: " + menor);
	        System.out.println("Maior valor: " + maior);
	        System.out.println("Soma dos valores: " + soma);
	    }
	
	public static void exercicio5() {
		Scanner scanner = new Scanner(System.in);

			        System.out.print("Digite a quantidade de números: ");
			        int n = scanner.nextInt();

			        int[] numeros = new int[n];

			        for (int i = 0; i < n; i++) {
			            int numero;
			            do {
			                System.out.print("Digite o " + (i + 1) + "º número (entre 0 e 1000): ");
			                numero = scanner.nextInt();

			                if (numero < 0 || numero > 1000) {
			                    System.out.println("Número inválido. Digite um número entre 0 e 1000.");
			                }
			            } while (numero < 0 || numero > 1000);

			            numeros[i] = numero;
			        }

			        int menor = Integer.MAX_VALUE;
			        for (int numero : numeros) {
			            if (numero < menor) {
			                menor = numero;
			            }
			        }

			        int maior = Integer.MIN_VALUE;
			        for (int numero : numeros) {
			            if (numero > maior) {
			                maior = numero;
			            }
			        }

			        int soma = 0;
			        for (int numero : numeros) {
			            soma += numero;
			        }

			        System.out.println("Menor valor: " + menor);
			        System.out.println("Maior valor: " + maior);
			        System.out.println("Soma dos valores: " + soma);
			    }
	public static void exercicio6() {
	Scanner scanner = new Scanner(System.in);

    while (true) {
        int numero;
        do {
            System.out.print("Digite um número inteiro positivo e menor que 16 (0 para sair): ");
            numero = scanner.nextInt();

            if (numero < 0 || numero > 15) {
                System.out.println("Número inválido. Digite um número entre 0 e 15.");
            }
        } while (numero < 0 || numero > 15);

        if (numero == 0) {
            break;
        }

        int fatorial = 1;
        System.out.print(numero + "! = ");
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
            if (i > 1) {
                System.out.print(" * " + i);
            }
        }

        System.out.println(" = " + fatorial);
    }
	}
    public static void exercicio7() {
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (ehPrimo(numero)) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
            System.out.print("Ele é divisível pelos seguintes números: ");
            for (int i = 2; i <= numero; i++) {
                if (numero % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }

    static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    
    }
    public static void exercicio8() {
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de notas: ");
        int quantidadeNotas = scanner.nextInt();

        double somaNotas = 0;
        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }

        double media = somaNotas / quantidadeNotas;

        System.out.println("A média aritmética é: " + media);
    }
    public static void exercicio9() {
    	  Scanner scanner = new Scanner(System.in);

          System.out.print("Digite a quantidade de pessoas na turma: ");
          int quantidadePessoas = scanner.nextInt();

          int somaIdades = 0;
          for (int i = 1; i <= quantidadePessoas; i++) {
              System.out.print("Digite a idade da pessoa " + i + ": ");
              int idade = scanner.nextInt();
              somaIdades += idade;
          }

          double mediaIdade = somaIdades / quantidadePessoas;

          if (mediaIdade <= 25) {
              System.out.println("A turma é jovem.");
          } else if (mediaIdade <= 60) {
              System.out.println("A turma é adulta.");
          } else {
              System.out.println("A turma é idosa.");
          }
    }
    public static void exercicio10() {
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;

        for (int i = 1; i <= totalEleitores; i++) {
            System.out.println("Eleitor " + i + ", digite o número do candidato em que deseja votar (1, 2 ou 3):");
            int voto = scanner.nextInt();

            switch (voto) {
                case 1:
                    votosCandidato1++;
                    break;
                case 2:
                    votosCandidato2++;
                    break;
                case 3:
                    votosCandidato3++;
                    break;
                default:
                    System.out.println("Voto inválido!");
            }
        }

        System.out.println("Resultados da eleição:");
        System.out.println("Candidato 1: " + votosCandidato1 + " votos");
        System.out.println("Candidato 2: " + votosCandidato2 + " votos");
        System.out.println("Candidato 3: " + votosCandidato3 + " votos");
    }
    public static void exercicio11() {
    	 Scanner scanner = new Scanner(System.in);

         System.out.print("Digite a quantidade de turmas: ");
         int quantidadeTurmas = scanner.nextInt();

         int totalAlunos = 0;
         for (int i = 1; i <= quantidadeTurmas; i++) {
             System.out.print("Digite a quantidade de alunos na turma " + i + ": ");
             int quantidadeAlunos = scanner.nextInt();

             if (quantidadeAlunos > 40) {
                 System.out.println("Turma " + i + " inválida! A quantidade máxima de alunos por turma é 40.");
                 continue;
             }

             totalAlunos += quantidadeAlunos;
         }

         double mediaAlunos = totalAlunos / quantidadeTurmas;

         System.out.println("A média de alunos por turma é: " + mediaAlunos);
     }
    public static void exercicio12() {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a quantidade de CDs: ");
    int quantidadeCDs = scanner.nextInt();

    double valorTotal = 0;
    for (int i = 1; i <= quantidadeCDs; i++) {
        System.out.print("Digite o valor do CD " + i + ": ");
        double valorCD = scanner.nextDouble();

        valorTotal += valorCD;
    }

    double mediaValor = valorTotal / quantidadeCDs;

    System.out.println("O valor total investido na coleção é: R$" + valorTotal);
    System.out.println("O valor médio gasto em cada CD é: R$" + mediaValor);
}
    public static void exercicio13() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lojas Quase Dois");
        System.out.println("Tabela de preços");

        for (int i = 1; i <= 50; i++) {
            if (i == 1) {
                System.out.println("  " + i);
            } else if (i % 2 == 0) {
            	System.out.printf("%3d R$ %5.2f\n", i, i * 1.99);
            	} 
            else {
            	System.out.printf("%3d\n", i);
          
            }
         }
   }
  

    public static void exercicio14() {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o número a ser tabuado: ");
    int numero = scanner.nextInt();

    System.out.print("Digite o valor inicial da tabuada: ");
    int inicio = scanner.nextInt();

    System.out.print("Digite o valor final da tabuada: ");
    int fim = scanner.nextInt();

    if (inicio > fim) {
        System.out.println("Valor inicial da tabuada deve ser menor ou igual ao valor final!");
        return;
    }

    System.out.println("Vou montar a tabuada de " + numero + " começando em " + inicio + " e terminando em " + fim + ":");

    for (int i = inicio; i <= fim; i++) {
        System.out.println(numero + " x " + i + " = " + (numero * i));
    }
    }
}

