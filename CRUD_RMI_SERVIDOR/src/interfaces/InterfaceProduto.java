
package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface InterfaceProduto extends Remote{
    
    public void setDescricao(String descricao) throws RemoteException;
    public void setPreco(double preco) throws RemoteException;
    public void setQuantidade(int quantidade) throws RemoteException;
    public String getDescricao() throws RemoteException;
    public double getPreco() throws RemoteException;
    public int getQuantidade() throws RemoteException;
    
}
