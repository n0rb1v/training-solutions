package stringmethods.url;

public class UrlManager {
    private String protocol;
    private Integer port;
    private String host;
    private String path;
    private String query;

    public UrlManager(String url) {
        if ("".equals(url) || url == null){
            throw new IllegalArgumentException("Empty");
        }
        int proto = url.indexOf("://");
        int por = url.indexOf(":",proto+3);
        int pat = url.indexOf("/",proto+3);
        int quer = url.indexOf("?",pat);

        protocol = url.substring(0,proto).toLowerCase();

        if (pat == -1){
            if (por == -1){
                host = url.substring(proto + 3, url.length()).toLowerCase();
            }else{
                host = url.substring(proto + 3, por).toLowerCase();
                port = Integer.parseInt(url.substring(por+1, url.length()));
            }
        }else {
            if (por == -1){
                host = url.substring(proto + 3, pat).toLowerCase();
            }else{
                host = url.substring(proto + 3, por).toLowerCase();
                port = Integer.parseInt(url.substring(por+1, pat));
            }

        }

        if (quer == -1) {
            path = "";
        }else{
            path = url.substring(pat,quer);
        }
    }

    public String getProtocol() {
        return protocol;
    }

    public Integer getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public boolean hasProperty(String prop) {
        return true;
    }

    public String getProperty(String prop){
        return prop;
    }
}
