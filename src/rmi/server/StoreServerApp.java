package rmi.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.security.AccessControlException;

public class StoreServerApp {
    public static void main(String[] s){
        boolean err = false;
        int registryPort = 8000;
        try{
             LocateRegistry.createRegistry(registryPort);
             StoreServer server = new StoreServerImpl();
             UnicastRemoteObject.exportObject(server, 0);
             Naming.rebind("//localhost:"+registryPort+"/sServer", server);           
        }
        catch(java.rmi.UnknownHostException uhe){
             System.out.println("[error] podana nazwa hosta nie jest \n identyfikatorem tego komputera\n"+uhe+"\n");
             err = true;
        }
        catch(AccessControlException ace){
             System.out.println("[error] nie masz uprawnien aby uruchomic serwer\n na tym porcie dla podanej nazwy hosta\n"+ace+"\n");
             err = true;
        }
        catch(RemoteException re){
             System.out.println("[error] nie uda�o si� zarejestrowa� \n zdalnego obiektu serwera\n"+re+"\n");
             err = true;
        }
        catch(MalformedURLException mURLe){
             System.out.println("[error] wewn�trzny b��d" + mURLe+"\n");
             err = true;
        }
        catch(Exception ee){
             System.out.println("[error] cccc"+ee.getMessage()+"\n");
             err = true;
        }
        if(!err)
            System.out.println("\n[OK] Store server running...\n");
                  
   }
}
