
package javaapplication1;

/**
 *
 * @author lab1
 */
public class DiaLatim extends IdiomasColleague{
    
    public DiaLatim(HenriqueMediator mediator){
        
        super(mediator);
    }
    
    public void receberMensagem(String mensagem){
        
        System.out.println("Diandra Recebeu:" + mensagem);
    }
}
