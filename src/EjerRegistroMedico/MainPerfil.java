package EjerRegistroMedico;
import java.util.Scanner;

public class MainPerfil {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese el apellido: ");
        String apellido = entrada.nextLine();
        System.out.print("Ingrese el sexo: ");
        String sexo = entrada.nextLine();
        System.out.print("Día de nacimiento: ");
        int dia = entrada.nextInt();
        System.out.print("Mes de nacimiento: ");
        int mes = entrada.nextInt();
        System.out.print("Año de nacimiento: ");
        int anio = entrada.nextInt();
        System.out.print("Altura (cm): ");
        double altura = entrada.nextDouble();
        System.out.print("Peso (kg): ");
        double peso = entrada.nextDouble();

        PerfilMedico persona = new PerfilMedico(nombre, apellido, sexo, dia, mes, anio, altura, peso);

        System.out.printf("\nNombre: %s %s", persona.getNombre(), persona.getApellido());
        System.out.printf("\nSexo: %s", persona.getSexo());
        System.out.printf("\nFecha de nacimiento: %02d/%02d/%d", persona.getDia(), persona.getMes(), persona.getAnio());
        System.out.printf("\nEdad: %d años", persona.calcularEdad());
        System.out.printf("\nAltura: %.1f cm", persona.getAltura());
        System.out.printf("\nPeso: %.1f kg", persona.getPeso());
        System.out.printf("\n\nÍndice de Masa Corporal (BMI): %.2f - %s", persona.calcularBMI(), persona.categoriaBMI());
        System.out.printf("\nFrecuencia máxima: %d bpm", persona.frecuenciaMaxima());
        System.out.printf("\nRango esperado: %s bpm", persona.rangoFrecuenciaEsperada());
        System.out.printf("\n\nVALORES DE BMI:\nBajo peso <18.5 | Normal 18.5–24.9 | Sobrepeso 25–29.9 | Obeso ≥30\n");
    }
}
