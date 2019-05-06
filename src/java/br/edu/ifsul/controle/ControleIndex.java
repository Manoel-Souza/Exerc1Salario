/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifsul.controle;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;

/**
 * 
 * @author manoel souza
 */
@ManagedBean(name = "controleIndex")
public class ControleIndex implements Serializable{
   
    public ControleIndex() {
    }
    
    public String inicio(){
	return "index?faces-redirect=true";
    }
    
    public String Salario() {
	return "Salario?faces-redirect=true";
    }

}
