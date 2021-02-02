package proxydesignpattern.InternetProxyExample;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Internet realInternet = new RealInternet();
        Internet internet = new ProxyInternet(realInternet);

        System.out.print("Enter your website: ");
        String url = scanner.next();

        try
        {
            internet.connectTo(url);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
