package org.yinan.client.config;

/**
 * @author yinan
 * @date 18-12-12
 */
public class Config {

    /**
     * 服务端ip
     */
    private String serverHost;

    /**
     * 客户端key,作为验证凭据
     */
    private String clientKey;

    /**
     * 服务端端口
     */
    private int port;

    public Config(String serverHost, String clientKey, int port) {
        this.serverHost = serverHost;
        this.clientKey = clientKey;
        this.port = port;
    }

    public String getServerHost() {
        return serverHost;
    }

    public void setServerHost(String serverHost) {
        this.serverHost = serverHost;
    }

    public String getClientKey() {
        return clientKey;
    }

    public void setClientKey(String clientKey) {
        this.clientKey = clientKey;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
