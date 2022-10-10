/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciotecelagem;

/**
 *
 * @author Samsung
 */
public class ExercicioTecelagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Administracao adm = new Administracao("Pamela","123456",2000);
        Producao prod = new Producao("Joao","678995",10);
        Vendedores vend = new Vendedores("OSvaldo","167489",1500);
        
        adm.registrarFaltas();
        adm.registrarFaltas();
        adm.salarioLiquido();
        adm.hollerith();
        
        prod.registrarHorasDiurnas(5);
        prod.registrarHorasNoturnas(5);
        prod.salarioLiquido();
        prod.hollerith();
        
        vend.registrarVenda(5000);
        vend.registrarVenda(5000);
        vend.salarioLiquido();
        vend.hollerith();
        
        adm.novoMes();
        prod.novoMes();
        vend.novoMes();
        adm.hollerith();
        prod.hollerith();
        vend.hollerith();
        
    }
    
}
