/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova3;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Gerente extends CargoDeConfianca{

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento, String logradouro, String numero, String complemento, String cep, String cidade, UnidadeFederativa unidadeFederativa) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento, logradouro, numero, complemento, cep, cidade, unidadeFederativa);
    }

    @Override
    public String toString() {
        return super.toString()+
                "Gerente{";
    }

    @Override
    public double SalarioFinal() {
        double salarioFinal = 0; 
        salarioFinal += super.salario * this.salario; 
        salarioFinal += super.salario; return salarioFinal;
    }
    
    
    
    
    
    

    
    
    
}
