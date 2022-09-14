package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RPCClientAct2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        System.out.println("Ingrese el 1er numero: ");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el 2do numero: ");
        double num2 = scanner.nextDouble();

        System.out.println("Ingrese el 3er numero: ");
        double num3 = scanner.nextDouble();

        System.out.println("Ingrese el 4to numero: ");
        double num4 = scanner.nextDouble();

        Object[] datos = {num1, num2, num3, num4};

        String response = (String)
                client.execute("Methods.act2", datos);

        System.out.println(response);


    }
}
