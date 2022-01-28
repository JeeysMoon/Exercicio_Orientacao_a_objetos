/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_orientacao_a_objetos;

/**
 *
 * @author Ana
 */
public class Pessoa {
    public String nome;
    public String cpf;
    public Endereco endereco;
    
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        System.out.println(nome + " foi criada com sucesso");
        
    }
    
    public void informaEndereco(Endereco endereco){
        this.endereco = endereco;
        
    }
    
    public void falarEndereco() {
        System.out.println("Eu moro na " + this.endereco.rua);
    }
    
}
