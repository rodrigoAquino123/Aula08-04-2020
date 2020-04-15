
package principal;

import Classes.Produto;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;


public class IniciarServidor {
    public static void main(String[] args){
        try {
            System.out.println("Iniciando Servidor");
            LocateRegistry.createRegistry(1099);
            
            Produto objetoProduto = new Produto();
            Naming.rebind("rmi://192.168.0.120:1099", objetoProduto);
            
        } catch (RemoteException re) {
            System.out.println("Erro Remoto: "+re.toString());  
        } catch (Exception e){
            System.out.println("Erro Local: "+e.toString());
        }
    }
    
}
