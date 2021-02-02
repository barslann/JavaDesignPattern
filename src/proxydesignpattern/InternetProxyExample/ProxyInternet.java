package proxydesignpattern.InternetProxyExample;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{

    private Internet realInternet;

    public ProxyInternet(Internet realInternet) {
        this.realInternet = realInternet;
    }

    private static List<String> bannedHosts = new ArrayList<>();

    static{
        bannedHosts.add("www.youtube.com");
        bannedHosts.add("youtube.com");
        bannedHosts.add("www.facebook.com");
        bannedHosts.add("facebook.com");
        bannedHosts.add("www.twitter.com");
        bannedHosts.add("twitter.com");
        bannedHosts.add("www.instagram.com");
        bannedHosts.add("instagram.com");
    }

    @Override
    public void connectTo(String serverHost) throws Exception {
        if (bannedHosts.contains(serverHost)){
            throw new Exception("Access Denied");
        }else{
            realInternet.connectTo(serverHost);
        }
    }
}
