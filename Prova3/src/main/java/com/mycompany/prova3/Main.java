/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prova3;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Travessa", "515", "Lado do Banco", "40350758", "Salvador", UnidadeFederativa.RIO_DE_JANEIRO);
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Fernanda", "4035025898", "52561651561", endereco, Setor.SAUDE, Genero.FEMININO, 4500, EstadoCivil.CASADO, LocalDate.of(2000, Month.MARCH, 12), "Apto", "258", "Lado do Banco", "4035065898", "Salvador", UnidadeFederativa.BAHIA);
        Motoboy motoboy = new Motoboy("26266565", "Luis", "4035025898", "51516165", endereco, Setor.SAUDE, Genero.MASCULINO, 4800, EstadoCivil.CASADO, LocalDate.of(2000, Month.MARCH, 6), "Travessa", "678", "Lado do Mercado", "4035012565", "Salvador", UnidadeFederativa.BAHIA);
        Gerente gerente = new Gerente(Bonificacao.DIRETOR, "Fernando", "4035056598", "5265256265", endereco, Setor.SAUDE, Genero.MASCULINO, 6500, EstadoCivil.VIUVO, LocalDate.of(2000, Month.MARCH, 12), "Apto", "200", "Perto da praia", "40350256", "Salvador", UnidadeFederativa.BAHIA);
        Engenheiro engenheiro = new Engenheiro("254", "Alberto", "40350458765", "2155612652", endereco, Setor.MARKETING, Genero.MASCULINO, 2500, EstadoCivil.DIVORCIADO, LocalDate.of(2000, Month.DECEMBER, 25), "Avenida", "35", "Fundo do barreto", "4035065898", "Salvador", UnidadeFederativa.BAHIA);
        
        
       
        
        
        
        System.out.println(diretor.toString());
        System.out.println(motoboy.toString());
        System.out.println(gerente.toString());
        System.out.println(engenheiro.toString());
        
                
        
}
}