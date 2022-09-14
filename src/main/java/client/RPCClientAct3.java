package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RPCClientAct3 {
        static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) throws MalformedURLException, XmlRpcException {
            XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
            config.setServerURL(new URL("http://localhost:1200"));
            XmlRpcClient client = new XmlRpcClient();
            client.setConfig(config);

            System.out.println("Ingrese el 1er numero: ");
            int num1 = scanner.nextInt();

            System.out.println("Ingrese el 2do numero: ");
            int num2 = scanner.nextInt();

            Object[] datos = {num1, num2};

            String response = (String)
                    client.execute("Methods.act3", datos);

            System.out.println(response);

    }
}
