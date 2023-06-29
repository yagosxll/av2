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
public class Diretor extends CargoDeConfianca{
    public  final double PREMIO = 0.3;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento, String logradouro, String numero, String complemento, String cep, String cidade, UnidadeFederativa unidadeFederativa) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento, logradouro, numero, complemento, cep, cidade, unidadeFederativa);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n PREMIO:" + PREMIO;
    }

    @Override
    public double SalarioFinal() {
        double salarioFinal = 0; 
        salarioFinal += super.salario * this.PREMIO; 
        salarioFinal += super.salario; return salarioFinal;
    }
    
    

    
    
    

    
    
    
}
