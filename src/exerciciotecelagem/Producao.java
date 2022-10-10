/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciotecelagem;

/**
 *
 * @author Samsung
 */
public class Producao extends Funcionario{
    private double valorHora;
    int horaDia;
    int horaNoite;
    
    public Producao(String nome, String rg, double valorHora){
        super(nome,rg);
        this.valorHora = valorHora;
        
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    public void registrarHorasDiurnas(int horas){
        horaDia = horas;
    }
    
    public void registrarHorasNoturnas(int horas){
        horaNoite = horas;
    }

    @Override
    public double salarioLiquido() {
        return (valorHora * horaDia) + (valorHora*1.3) * horaNoite ;
    }
    
    @Override
    public void hollerith(){
        super.hollerith();
        System.out.println("Valor da hora trabalhada: " + valorHora + "\n" + 
                            "Horas Diurnas: " + horaDia + "\n" + 
                            "Horas Noturnas: " + horaNoite + "\n" + 
                            "Salario Liquido: " + salarioLiquido() + "\n");
        System.out.print("----------------------------------------------------------\n");
    }

    @Override
    public void novoMes() {
        horaDia = 0;
        horaNoite = 0;
    }
}
