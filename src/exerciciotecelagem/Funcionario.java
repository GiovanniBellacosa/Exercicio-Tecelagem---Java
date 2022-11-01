/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciotecelagem;

/**
 *
 * @author Samsung
 */
public abstract class Funcionario {
    private String nome;
    private String rg;
    private int codigo;
    
    //contrutores
    public Funcionario(String nome, String rg, int codigo){
        this.nome = nome;
        this.rg = rg;
        this.codigo = codigo;
    }
    
    // getters e setters

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRg() {
        return rg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public abstract double salarioLiquido();
    
    public abstract void novoMes();
    
    public void hollerith(){
        System.out.print("Nome: " + nome + "\n" + 
                            "RG: " + rg + "\n" + 
                            "Codigo:" + codigo + "\n");
    }
    
}
