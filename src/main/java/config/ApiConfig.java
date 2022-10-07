package config;

import java.util.LinkedHashMap;
import java.util.Map;

public class ApiConfig {

    private LinkedHashMap urls;
    private String endpoint;
    private  String requestType;

    public ApiConfig(){}

    public ApiConfig(LinkedHashMap urls, String endpoint, String requestType){
        this.urls = urls;
        this.endpoint = endpoint;
        this.requestType = requestType;
    }

    public LinkedHashMap getUrls() {
        return urls;
    }

    public void setUrls(LinkedHashMap urls) {
        this.urls = urls;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }
}
