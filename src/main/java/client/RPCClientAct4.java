package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import server.Methods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
public class RPCClientAct4 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        Object [] datos = new Object[5];

        for (int i = 0; i < datos.length ; i++) {
            System.out.print("Ingrese un entero");
            datos[i] = scanner.nextInt();
        }

        String response = (String) client.execute("Methods.act4", datos);

        System.out.println(response);

    }
}
