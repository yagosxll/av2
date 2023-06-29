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
public class Motoboy extends Funcionario{
    private final String carteiraDeHabilitacao;


    
    public Motoboy(String carteiraDeHabilitacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento, String logradouro, String numero, String complemento, String cep, String cidade, UnidadeFederativa unidadeFederativa) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento, logradouro, numero, complemento, cep, cidade, unidadeFederativa);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n carteiraDeHabilitacao:" + carteiraDeHabilitacao;
    }

    @Override
    public double SalarioFinal() {
        double salarioFinal = 0; 
        salarioFinal += super.salario * this.salario; 
        salarioFinal += super.salario; return salarioFinal;
    }
    
    
    
}
