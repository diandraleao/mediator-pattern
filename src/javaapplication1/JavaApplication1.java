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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MensagemMediator tradutor = new MensagemMediator();
        
        IdiomasColleague diandra = new DiaLatim(tradutor);
        IdiomasColleague fabiana = new FabIngles(tradutor);
        IdiomasColleague giulianne = new GiuItaliano(tradutor);
        
        tradutor.setColleague(diandra);
        tradutor.setColleague(fabiana);
        tradutor.setColleague(giulianne);
        
        giulianne.enviarMensagem("hello world");
    }
    
}
