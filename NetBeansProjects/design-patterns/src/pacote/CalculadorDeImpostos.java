/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote;

/**
 *
 * @author fredaum
 */
public class CalculadorDeImpostos {
    
    public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer){
        double resultado = impostoQualquer.calcula(orcamento);
        System.out.println(resultado);
    }   
    }
    