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
public class Endereco {
    public String rua;
    public String bairro;
    public int numero;
    public String cep;
    
    public Endereco(String rua, String cep) {
        this.cep = cep;
        this.rua = rua;
        
    }
    
    public void complementaEndereco(int numero, String bairro) {
        this.numero = numero;
        this.bairro = bairro;
        
    }
    
}
