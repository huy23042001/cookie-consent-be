package com.example.demo;
import javax.persistence.*;
import java.sql.Date;
import java.time.Instant;

@Entity
@Table(name = "consent")
public class ConsentEntity {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ip_client", nullable = false)
    private String ipClient;

    @Column(name = "domain_web", nullable = false)
    private String domainWeb;

    @Column(name = "timestamp")
    private Instant timestamp;

    @Column(name = "config")
    private String config;

    @Column(name = "status_consent")
    private Integer statusConsent;

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIpClient() {
        return ipClient;
    }

    public void setIpClient(String ipClient) {
        this.ipClient = ipClient;
    }

    public String getDomainWeb() {
        return domainWeb;
    }

    public void setDomainWeb(String domainWeb) {
        this.domainWeb = domainWeb;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatusConsent() {
        return statusConsent;
    }

    public void setStatusConsent(Integer statusConsent) {
        this.statusConsent = statusConsent;
    }
}
