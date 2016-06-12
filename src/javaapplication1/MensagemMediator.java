/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.ArrayList;
/**
 *
 * @author lab1
 */
public class MensagemMediator implements HenriqueMediator{
    
    private ArrayList<IdiomasColleague> colleagues;
    
    public MensagemMediator(){
        
        colleagues = new ArrayList<IdiomasColleague>();
    }
    
    public void setColleague(IdiomasColleague colleague){
        
        colleagues.add(colleague);
    }
    
    public void enviarMensagem(String mensagem, IdiomasColleague remetente){
        
        for(IdiomasColleague colleague : colleagues ){
            
            if( colleague != remetente){
                
                colleague.receberMensagem(mensagem);
            }
        }
        
    }
}
