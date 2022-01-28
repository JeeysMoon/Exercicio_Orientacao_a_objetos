/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_orientacao_a_objetos;

import java.util.Random;

/**
 *
 * @author Ana
 */
public class Conta {
    public int numero;
    public int agencia;
    public Double saldo;
    public Pessoa titular;
    
    public Conta(int agencia, Pessoa titular) {
        Random gerador = new Random();
        this.numero = gerador.nextInt(99999);
        this.agencia = agencia;
        this.saldo = 0.0; 
        this.titular = titular;
        System.out.println("Conta crida para o Sr. " + this.titular.nome);
    }
    
    public void informaEnderecoTitular() {
        System.out.println("O titular " + this.titular.nome + " mora no endereço " + this.titular.endereco.rua + " CEP " + this.titular.endereco.cep);
    }
    
}
