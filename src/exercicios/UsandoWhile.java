package exercicios;

public class UsandoWhile {
    public static void main(String[] args) {
        int[] vetorUniDimencional = {10, 20, 15, 4, 75};

        int i = 0;

        System.out.println("Exibe o vetor: ");
        while (i < vetorUniDimencional.length) {
            System.out.println(vetorUniDimencional[i]);
            i++;
        }
    }

}
