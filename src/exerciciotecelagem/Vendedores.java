/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciotecelagem;

/**
 *
 * @author Samsung
 */
public class Vendedores extends Funcionario{
    private double salarioFixo;
    double totalVenda=0;
    double comissao;
    
    public Vendedores(String nome, String rg, double salarioFixo){
        super(nome,rg);
        this.salarioFixo = salarioFixo;
    }
    
    public void registrarVenda(double valor){
        totalVenda += valor;
    }
    
    @Override
    public double salarioLiquido() {
        comissao = totalVenda * 0.03;
        return salarioFixo + comissao;
    }

    @Override
    public void novoMes() {
        comissao = 0;
        totalVenda = 0;
    }
    
    @Override
    public void hollerith(){
        super.hollerith();
        System.out.println("Salario Fixo : " + salarioFixo + "\n" + 
                            "Comissão: " + comissao + "\n" + 
                            "Salario Liquido: " + salarioLiquido() + "\n");
        System.out.print("----------------------------------------------------------\n");
    }
    
}
