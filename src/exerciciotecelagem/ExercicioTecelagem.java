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
//        Administracao adm = new Administracao("Pamela","123456",2000,1);
//        Producao prod = new Producao("Joao","678995",10,2);
//        Vendedores vend = new Vendedores("OSvaldo","167489",1500,3);
        
//        adm.registrarFaltas();
//        adm.registrarFaltas();
//        adm.salarioLiquido();
//        adm.hollerith();
//        
//        prod.registrarHorasDiurnas(5);
//        prod.registrarHorasNoturnas(5);
//        prod.salarioLiquido();
//        prod.hollerith();
//        
//        vend.registrarVenda(5000);
//        vend.registrarVenda(5000);
//        vend.salarioLiquido();
//        vend.hollerith();
//        
//        adm.novoMes();
//        prod.novoMes();
//        vend.novoMes();
//        adm.hollerith();
//        prod.hollerith();
//        vend.hollerith();

          listaFuncionario L1 = new listaFuncionario(10);
          
          L1.adicionar(new Vendedores("OSvaldo","167489",1,1500));
          L1.adicionar(new Vendedores("Maria","448596",6,2000));
          L1.adicionar(new Producao("Joao","678995",2,10));
          L1.adicionar(new Producao("Jonathan","256389",5,20));
          L1.adicionar(new Administracao("Pamela","123456",3,2000));
          L1.adicionar(new Administracao("Carlos","456231",4,3000));
          
//          L1.listarVendedores();
//          L1.listarAdministracao();
//          L1.listarProducao();
          
          L1.registrarFalta(4);
          L1.registrarFalta(3);
          L1.relatorioAdministracao();
          
          L1.registrarHorasNoturnas(2,2);
          L1.registrarHorasDiurnas(2, 2);
          L1.registrarHorasNoturnas(5,2);
          L1.registrarHorasDiurnas(5,2);
          L1.relatorioProducao();
          
          L1.registrarVenda(1,10000);
          L1.registrarVenda(6,15000);
          L1.relatorioVendas();
          
            
    }
    
}
