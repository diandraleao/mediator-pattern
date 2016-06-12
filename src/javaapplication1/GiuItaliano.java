
package javaapplication1;

/**
 *
 * @author lab1
 */
public class GiuItaliano extends IdiomasColleague{
    
    public GiuItaliano(HenriqueMediator mediator){
        
        super(mediator);
    }
    
    public void receberMensagem(String mensagem){
        
        System.out.println("Giulianne Recebeu:" + mensagem);
    }
}
