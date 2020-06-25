package com.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;

/**
 * <p> The describe </p>
 *
 * @author Li Xingping
 */
@ConfigurationProperties("app.cors")
public class AppCorsProperties implements Serializable {

    private String allowOrigin = "*";
    private String allowMethods;
    private String allowHeaders;
    private Boolean allowCredentials = false;
    private Long maxAge = 3600L;
    private boolean local = false;

    public String getAllowOrigin() {
        return allowOrigin;
    }

    public void setAllowOrigin(String allowOrigin) {
        this.allowOrigin = allowOrigin;
    }

    public String getAllowMethods() {
        return allowMethods;
    }

    public void setAllowMethods(String allowMethods) {
        this.allowMethods = allowMethods;
    }

    public String getAllowHeaders() {
        return allowHeaders;
    }

    public void setAllowHeaders(String allowHeaders) {
        this.allowHeaders = allowHeaders;
    }

    public Boolean getAllowCredentials() {
        return allowCredentials;
    }

    public void setAllowCredentials(Boolean allowCredentials) {
        this.allowCredentials = allowCredentials;
    }

    public Long getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(Long maxAge) {
        this.maxAge = maxAge;
    }

    public boolean isLocal() {
        return local;
    }

    public void setLocal(boolean local) {
        this.local = local;
    }
}
