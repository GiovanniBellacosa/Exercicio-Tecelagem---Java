/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciotecelagem;

/**
 *
 * @author 0040482112030
 */
public class listaFuncionario {
    private Funcionario listaFunc[];
    private int cont;
    private double totalAdm;
    private double totalVendas;
    private double totalProducao;
    
    
    public listaFuncionario(int tamanho){
        listaFunc = new Funcionario[tamanho];
        cont = 0;
        totalAdm = 0;
        totalVendas = 0;
        totalProducao = 0;
    }
    
    public boolean adicionar(Funcionario f){
        if(cont >= listaFunc.length) return false;
        if(buscarFunc(f.getCodigo()) >= 0)return false;
        listaFunc[cont] = f;
        cont++;
        return true;
    }
    
    public int buscarFunc(int cod){
        for(int i=0;i<cont;i++){
            if(listaFunc[i].getCodigo() == cod){
                return i;
            } 
        }
        return -1;
    }
    
    
    public void listarVendedores(){
        System.out.println("\nFuncionarios na area de Vendas ");
        for(int i=0;i<cont;i++){
            if(listaFunc[i] instanceof Vendedores){
               listaFunc[i].hollerith();
            } 
        }
    }
    
    public void listarAdministracao(){
        System.out.println("\n Funcionario na area da Administração ");
        for(int i=0;i<cont;i++){
            if(listaFunc[i] instanceof Administracao){
                listaFunc[i].hollerith();
            } 
        }
    }
    
    public void listarProducao(){
        System.out.println("\nFuncionario na area da PRodução ");
        for(int i=0;i<cont;i++){
            if(listaFunc[i] instanceof Producao){
                listaFunc[i].hollerith();
            } 
        }
    }
    //segunda parte
    
    public void relatorioAdministracao(){
        System.out.println("========================== Relatorio dos funcionarios da Administração ========================");
        for(int i=0;i<cont;i++){
            if(listaFunc[i] instanceof Administracao){
                listaFunc[i].hollerith();
                Administracao a = (Administracao)listaFunc[i];
                totalAdm += a.salarioLiquido();
            } 
        }
        System.out.println("Total dos salarios da ADM: " + totalAdm + "\n");
    }
    
    public void relatorioVendas(){
        System.out.println("========================== Relatorio dos funcionarios de Vendas ========================");
        for(int i=0;i<cont;i++){
            if(listaFunc[i] instanceof Vendedores){
               listaFunc[i].hollerith();
               Vendedores v = (Vendedores)listaFunc[i];
               totalVendas += v.salarioLiquido();
            } 
        }
        System.out.println("Total dos salarios da Vendas: " + totalVendas + "\n");
    }
    
    public void relatorioProducao(){
        System.out.println("========================== Relatorio dos funcionarios da Produção ========================");
        for(int i=0;i<cont;i++){
            if(listaFunc[i] instanceof Producao){
                listaFunc[i].hollerith();
                Producao p = (Producao)listaFunc[i];
                totalProducao += p.salarioLiquido();
            } 
        }
        System.out.println("Total dos salarios da Produção: " + totalProducao + "\n");
    }
    
    public void registrarFalta(int cod){
        int index = buscarFunc(cod);
        
        if(index < 0){
            System.out.println("o codigo nao existe...");
            return;
        }
        
        if(listaFunc[index] instanceof Administracao){
            Administracao a = (Administracao)listaFunc[index];
            a.registrarFaltas();
        }
        else{
            System.out.println("o funcionario nao e da adm...");
        }
    }
    
    public void registrarHorasDiurnas(int cod, int horas){
        int index = buscarFunc(cod);
        
        if(index < 0){
            System.out.println("o codigo nao existe...");
            return;
        }
        
        if(listaFunc[index] instanceof Producao){
            Producao p = (Producao)listaFunc[index];
            p.registrarHorasDiurnas(horas);
        }
        else{
            System.out.println("o funcionario nao e da produção...");
        }
    }
    
    public void registrarHorasNoturnas(int cod, int horas){
        int index = buscarFunc(cod);
        
        if(index < 0){
            System.out.println("o codigo nao existe...");
            return;
        }
        
        if(listaFunc[index] instanceof Producao){
            Producao p = (Producao)listaFunc[index];
            p.registrarHorasNoturnas(horas);
        }
        else{
            System.out.println("o funcionario nao e da produção...");
        }
    }
    
    public void registrarVenda(int cod, double valor){
        int index = buscarFunc(cod);
        
        if(index < 0){
            System.out.println("o codigo nao existe...");
            return;
        }
        
        if(listaFunc[index] instanceof Vendedores){
            Vendedores v = (Vendedores)listaFunc[index];
            v.registrarVenda(valor);
        }
        else{
            System.out.println("o funcionario nao e de vendas...");
        }
    }
    
}
