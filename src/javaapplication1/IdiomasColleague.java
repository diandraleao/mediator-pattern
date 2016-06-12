/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author lab1
 */
public abstract class IdiomasColleague {
    
    protected HenriqueMediator mediator;
    
    public IdiomasColleague(HenriqueMediator mediator){
        
        this.mediator = mediator;
    }
    
    public abstract void receberMensagem(String mensagem);
    
    public void enviarMensagem(String mensagem){
        
        this.mediator.enviarMensagem(mensagem, this);
    }
    
}
