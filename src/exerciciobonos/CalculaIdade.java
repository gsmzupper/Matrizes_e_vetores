package exerciciobonos;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculaIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá seja bem-vindo! "
        +"\nQual é o seu nome? ");
        String name = sc.nextLine();

        System.out.println("Digite a data do seu nascimento: formato (YY-MM-DD).");
        String dataNascimento = sc.nextLine();

        try {
            LocalDate converteDataNascimento = LocalDate.parse(dataNascimento);

            LocalDate dataAtual = LocalDate.now();

            int idadeCalculada = Period.between(converteDataNascimento, dataAtual).getYears();

            System.out.printf("\nOlá! %s você tem %d anos de idade.", name, idadeCalculada);
        } catch (Exception e) {
            System.out.println("Erro: Certifique-se de inserir a data no formato correto (yyyy-MM-dd).");
        } finally {
            sc.close();
        }
    }
}
