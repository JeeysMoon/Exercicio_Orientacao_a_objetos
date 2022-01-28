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
public class Exercicio_Orientacao_a_objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Pessoa pessoa1 = new Pessoa ("Fulano", "123.456.789-85");
       Endereco enderecoPessoa1 = new Endereco("Rua das flores", "35400-000");
       enderecoPessoa1.complementaEndereco(220, "São João");
       pessoa1.informaEndereco(enderecoPessoa1);
       pessoa1.falarEndereco();
       Conta contaPessoa1 = new Conta(272, pessoa1);
       contaPessoa1.informaEnderecoTitular();
    }
    
}
