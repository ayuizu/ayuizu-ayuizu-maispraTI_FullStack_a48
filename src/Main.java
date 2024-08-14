import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Arrays Uni e Bidimensionais

        //Inicializar Arrays
        //Forma 1
        int[] vetor = new int[5];
        vetor[0] = 10;
        vetor[1] = 20;
        vetor[2] = 30;
        vetor[3] = 40;
        vetor[4] = 50;
        //Forma2
        int[] vetorInicializado = {1, 2, 3, 4, 5, 6, 7};

        //Mudar um elemento do Array
        vetor[3] = 80;

        //Imprimir Array
        System.out.println("Vetor original:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("[" + i + "] " + vetor[i]);
        }

        //Somar elementos do Array
        int somaVetor = 0;
        for (int i = 0; i < vetor.length; i++) {
            somaVetor += vetor[i];
        }
        System.out.println("Soma do vetor: " + somaVetor);

        //Maior elemento Array
        int maiorElementoVetor = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maiorElementoVetor) {
                maiorElementoVetor = vetor[i];
            }
        }
        System.out.println("Maior elemento: " + maiorElementoVetor);

        //Invertendo Array
        int[] newVetor = new int[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            newVetor[i] = vetor[vetor.length - 1 - i];
        }
        vetor = newVetor;
        System.out.print("Vetor invertido: [ ");
        for (int i = 0; i < vetor.length; i++) {
            if (i == vetor.length - 1)
                System.out.print(vetor[i]);
            else
                System.out.print(vetor[i] + ",");
        }
        System.out.println(" ]");

        //Adicionar elementos a um Array
        int[] vetorAdicionar = new int[vetor.length + 1];

        for (int i = 0; i < vetor.length; i++) {
            vetorAdicionar[i] = vetor[i];
        }
        System.out.println("-------------------------------");
        System.out.print("Vetor trabalhado a seguir: [ ");
        for (int i = 0; i < vetor.length; i++) {
            if (i == vetor.length - 1)
                System.out.print(vetor[i]);
            else
                System.out.print(vetor[i] + ",");
        }
        System.out.println(" ]");

        System.out.print("Digite um número para adicionar ao vetor: ");
        int elementoAdd = sc.nextInt();
        for (int i = 0; i < vetorAdicionar.length; i++) {
            //Não aceita null. Se tiver um elemento for 0 mesmo não vai funcionar
            if (vetorAdicionar[i] == 0) {
                vetorAdicionar[i] = elementoAdd;
                break;
            }
        }
        System.out.print("Novo vetor: [ ");
        for (int i = 0; i < vetorAdicionar.length; i++) {
            if (i == vetorAdicionar.length - 1)
                System.out.print(vetorAdicionar[i]);
            else
                System.out.print(vetorAdicionar[i] + ",");
        }
        System.out.println(" ]");


        //Excluir elementos de um Array
        System.out.print("Digite um número para deletar do vetor: ");
        int elementoDel = sc.nextInt();
        for (int i = 0; i < vetorAdicionar.length; i++) {
            if (vetorAdicionar[i] == elementoDel) {
                vetorAdicionar[i] = 0;
            }
        }
        System.out.print("Novo vetor: [ ");
        for (int i = 0; i < vetorAdicionar.length; i++) {
            if (i == vetorAdicionar.length - 1)
                System.out.print(vetorAdicionar[i]);
            else
                System.out.print(vetorAdicionar[i] + ",");
        }
        System.out.println(" ]");

        //Pesquisar elementos em um Array

        System.out.print("Digite um elemento para encontrar a posição no vetor: ");
        int elementoSearch = sc.nextInt();
        int posicao = 0;
        for (int i = 0; i < vetorAdicionar.length; i++) {
            if (vetorAdicionar[i] == elementoSearch) {
                posicao = i;
                System.out.println("Posição do elemento procurado: " + posicao);
            }
        }


        //Professor:
        /*
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == elementoSearch) {
                System.out.println("Posição " + i);
            }
        }*/

        //Arrays Bidimensionais - Matrizes
        System.out.println("-------------------------------");
        System.out.println("Matriz original:");
        int[][] matriz = {
                {2, 4, 6, 8},
                {9, 7, 8, 1},
                {7, 8, 9, 4},
                {6, 6, 7, 5}
        };
        //Imprimir elementos da matriz
        for (int[] row : matriz) {
            for(int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        //Somar elementos da matriz
        int somaMatriz = 0;
        for (int[] row : matriz) {
            for(int value : row) {
                somaMatriz += value;
            }
        }
        System.out.println("Soma do matriz: " + somaMatriz);

        //Somar diagonal principal e secundária
        int somaDiagonalPrincipal = 0;
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[i].length; j++) {
                if(i==j)
                    somaDiagonalPrincipal += matriz[i][j];
            }
        }
        System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal);
        int somaDiagonalSecundaria = 0;
        //Tip: i+j == length+1
        for(int i=0; i<matriz.length; i++) {
                somaDiagonalSecundaria += matriz[i][matriz.length-i-1];

        }
        System.out.println("Soma da diagonal secundária: " + somaDiagonalSecundaria);

        //Rotacionar Matriz
        int n = matriz.length;
        int[][] matrizRotacionada = new int[n][n];
        for (int i = 0; i < n; i++) {
            for(int j=0; j<n; j++) {
                matrizRotacionada[i][j] = matriz[n-j-1][i];
                //ou matrizRotacionada[j][n-i-1] = matriz[i][j];
            }
        }
        System.out.println("Matriz rotacionada:");
        for (int[] row : matrizRotacionada) {
            for(int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        //Buscar elemento na Matriz
        System.out.print("Digite um elemento para buscar a posição na matriz original: ");
        int busca = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for(int j=0; j<n; j++) {
                if(matriz[i][j] == busca) {
                    System.out.println("Posição: ["+i+"]["+j+"]");
                }
            }
        }
    }


}