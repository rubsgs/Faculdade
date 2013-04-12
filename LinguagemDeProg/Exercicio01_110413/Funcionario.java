/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author aluno
 */
public class FuncApp {
    public static void main(String[] args){
        Funcionario[] func = new Funcionario[10];
        func[1] = new Funcionario("Maria", "Comercial", 1000);
        func[2] = new Funcionario("João", "Suporte", 900);
        func[3] = new Funcionario("Rubens","Suporte",1000);
        func[4] = new Funcionario("Renato","Suporte", 2000);
        func[5] = new Funcionario("Graziele","Suporte",1000);
        func[6] = new Funcionario("Ana","Comercial",1000);
        func[7] = new Funcionario("Helaine","RH",1500);
        func[8] = new Funcionario("Bruna","Financeiro",1500);
        func[9] = new Funcionario("Stephanie","Pessoal",1000);
        for(int i =0; i < func.length; i++){
            
        }
    }
}
