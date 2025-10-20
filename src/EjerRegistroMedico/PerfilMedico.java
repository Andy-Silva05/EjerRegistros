package EjerRegistroMedico;

import java.time.LocalDate;
import java.time.Period;

public class PerfilMedico {
    private String nombre;
    private String apellido;
    private String sexo;
    private int dia;
    private int mes;
    private int anio;
    private double altura; // en cm
    private double peso;   // en kg

    public PerfilMedico() {}

    public PerfilMedico(String nombre, String apellido, String sexo, int dia, int mes, int anio, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.altura = altura;
        this.peso = peso;
    }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setSexo(String sexo) { this.sexo = sexo; }
    public void setDia(int dia) { this.dia = dia; }
    public void setMes(int mes) { this.mes = mes; }
    public void setAnio(int anio) { this.anio = anio; }
    public void setAltura(double altura) { this.altura = altura; }
    public void setPeso(double peso) { this.peso = peso; }

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getSexo() { return sexo; }
    public double getAltura() { return altura; }
    public double getPeso() { return peso; }
    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getAnio() { return anio; }

    public int calcularEdad() {
        LocalDate nacimiento = LocalDate.of(anio, mes, dia);
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }

    public int frecuenciaMaxima() {
        return 220 - calcularEdad();
    }

    public String rangoFrecuenciaEsperada() {
        double min = frecuenciaMaxima() * 0.5;
        double max = frecuenciaMaxima() * 0.85;
        return String.format("%.1f - %.1f", min, max);
    }

    public double calcularBMI() {
        double alturaMetros = altura / 100;
        return peso / (alturaMetros * alturaMetros);
    }

    public String categoriaBMI() {
        double bmi = calcularBMI();
        if (bmi < 18.5) return "Bajo peso";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Sobrepeso";
        else return "Obeso";
    }
}
