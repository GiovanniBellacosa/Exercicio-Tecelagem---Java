/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciotecelagem;

/**
 *
 * @author Samsung
 */
public class Administracao extends Funcionario{
    private double salarioBruto;
    private int falta = 0;
    private double desconto;
    
    public Administracao(String nome, String rg, int codigo,double salarioBruto){
        super(nome,rg,codigo);
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    
    public void registrarFaltas(){
        falta++;
    }
    
    @Override
    public double salarioLiquido() {
        desconto = falta * (salarioBruto / 30);
        return salarioBruto - desconto;
    }
    
    @Override
    public void hollerith(){
        super.hollerith();
        System.out.println("Salario Base: " + salarioBruto + "\n" + 
                            "Faltas: " + falta + "\n" + 
                            "Total Descontado do salario: " + falta * (salarioBruto / 30) + "\n" + 
                            "Salario Liquido: " + salarioLiquido() + "\n");
        System.out.print("----------------------------------------------------------\n");
    }

    @Override
    public void novoMes() {
        falta = 0;
        desconto = 0;
    }
   
}
