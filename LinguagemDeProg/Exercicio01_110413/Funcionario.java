/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author aluno
 */
public class Funcionario {
    private String nome;
    private String departamento;
    private boolean demitido;
    private double salario;
    private String rg;
    private int anoEntrada;
    private int dependente;
    
    Funcionario(String nome, String dpto, double salario){
        this.nome = nome;
        this.departamento = dpto;
        this.salario = salario;
    }
    Funcionario(String nome, String departamento, double salario, String rg, int ano, boolean funcionario, int numDependente){
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.rg = rg;
        this.anoEntrada = ano;
        this.demitido = funcionario;
        this.dependente = numDependente;
    }
    
    public double calculaLiquido(int numDependente, double salario){
        double salarioLiquido = 0;
        salarioLiquido = numDependente*20;
        if(salario > 1000){
            salarioLiquido += salario*0.95;
        }
        else{
            salarioLiquido += salario*0.97;
        }
        return salarioLiquido;
    }
    public int tempoServico(int anoAtual){
        return anoAtual - this.anoEntrada;
    }
    
    public void aumentaSalario(int tempoServico){
        if(tempoServico >= 5){
            this.salario *= 1.08;
        }
        else{
            this.salario *= 1.05;
        }
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getDepartamento(){
        return this.departamento;
    }
    
    public int getAnoEntrada(){
        return this.anoEntrada;
    }
            
    public String getRG(){
        return this.rg;
    }
    public boolean getDemitido(){
        return this.demitido;
    }
    
    public int getDependente(){
        return this.dependente;
    }
    
    public void setDemitido(boolean demissao){
        this.demitido = demissao;
    }
    
    public void setAnoEntrada(int anoEntrada){
        this.anoEntrada = anoEntrada;
    }
    
    public void setRG(String rg){
        this.rg = rg;
    }
    
    public void setDependente(int numDep){
        this.dependente = numDep;
    }
    
}
