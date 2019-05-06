/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifsul.controle;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * 
 * @author manoel souza
 */
@ManagedBean(name = "controleSalario")
@SessionScoped
public class ControleSalario implements Serializable{
    private String nome;
    private Double salario;
    private Double inss;
    private Double salarioLiquido;
    
    public ControleSalario() {
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public Double getSalario() {
	return salario;
    }

    public void setSalario(Double salario) {
	this.salario = salario;
    }
    
    public Double getInss() {			
	//calculo do inss é o (salario*inss)/100 = tributação do inss = 8, 9 e 11%
	if (salario <= 1556.94) {
	    inss = (salario*8)/100;
	} else if(salario <= 2594.92){
	    inss = (salario*9)/100;
	} else {
	    inss = (salario*11)/100;
	}
	return inss;
    }

    public void setInss(Double inss) {
	this.inss = inss;
    }

    public Double getSalarioLiquido() {
	salarioLiquido= salario-inss;
	return salarioLiquido;
    }

    public void setSalarioLiquido(Double salarioLiquido) {
	this.salarioLiquido = salarioLiquido;
    }
    
    public String dados(){
	return "Salario?faces-redirect=true";
    }
    
    public String calcular() {
	return "Resultado?faces-redirect=true";
    }    
    
}
