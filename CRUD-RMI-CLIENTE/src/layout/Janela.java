
package layout;

import javax.swing.JFrame;
import views.adicionarProduto;


public class Janela extends JFrame{
    public Janela(){
        
        add(new adicionarProduto());
        setSize(280, 400);
        show();
    }

    private void add(adicionarProduto adicionarProduto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
