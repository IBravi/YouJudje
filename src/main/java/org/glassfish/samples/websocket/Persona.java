/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.glassfish.samples.websocket;

import java.io.Serializable;

/**
 *
 * @author Piero
 */
class Persona {
    
    public String nome;
    
    public Persona(String nome){
        this.nome=nome;
    }
    
    public String getNome(){
        return nome;
    }
}
