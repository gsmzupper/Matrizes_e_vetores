package exercicios;

public class UsandoDoWhile {
    public static void main(String[] args) {
        int[] vetorUneDimencional = {11, 12, 13, 14, 15};
        int i = 0;

        System.out.println("Exibe o vetor: ");
        do {
            System.out.println(vetorUneDimencional[i]);
            i++;
        } while (i < vetorUneDimencional.length);
    }
}
