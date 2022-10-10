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
    
    //contrutores
    public Funcionario(String nome, String rg){
        this.nome = nome;
        this.rg = rg;
    }
    
    // getters e setters

    public String getNome() {
        return nome;
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
                            "RG: " + rg + "\n");
    }
    
}
