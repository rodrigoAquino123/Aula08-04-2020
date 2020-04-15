
package Classes;

import interfaces.InterfaceProduto;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class Produto extends UnicastRemoteObject implements InterfaceProduto{
    public String descrição;
    public double preco;
    public int quantidade;
    
    public Produto() throws RemoteException{
        System.out.println("A Classe produto está disponível remotamente");
    }

    @Override
    public void setDescricao(String descricao) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPreco(double preco) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setQuantidade(int quantidade) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDescricao() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPreco() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getQuantidade() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    
}
