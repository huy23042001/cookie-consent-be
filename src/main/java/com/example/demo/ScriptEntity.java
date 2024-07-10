package com.example.demo;

import javax.persistence.*;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "script", schema = "public", catalog = "demo")
public class ScriptEntity {
    private long id;
    private String cookieBannerTitle;
    private String cookieBannerContent;
    private String adsBannerTitle;
    private String adsBannerContent;
    private String adsLink;
    private String cookie;
    private String script;
    private Instant createtime;
    private String webConfig;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "cookie_banner_title", nullable = true, length = -1)
    public String getCookieBannerTitle() {
        return cookieBannerTitle;
    }

    public void setCookieBannerTitle(String cookieBannerTitle) {
        this.cookieBannerTitle = cookieBannerTitle;
    }

    @Basic
    @Column(name = "cookie_banner_content", nullable = true, length = -1)
    public String getCookieBannerContent() {
        return cookieBannerContent;
    }

    public void setCookieBannerContent(String cookieBannerContent) {
        this.cookieBannerContent = cookieBannerContent;
    }

    @Basic
    @Column(name = "ads_banner_title", nullable = true, length = -1)
    public String getAdsBannerTitle() {
        return adsBannerTitle;
    }

    public void setAdsBannerTitle(String adsBannerTitle) {
        this.adsBannerTitle = adsBannerTitle;
    }

    @Basic
    @Column(name = "ads_banner_content", nullable = true, length = -1)
    public String getAdsBannerContent() {
        return adsBannerContent;
    }

    public void setAdsBannerContent(String adsBannerContent) {
        this.adsBannerContent = adsBannerContent;
    }

    @Basic
    @Column(name = "ads_link", nullable = true, length = -1)
    public String getAdsLink() {
        return adsLink;
    }

    public void setAdsLink(String adsLink) {
        this.adsLink = adsLink;
    }

    @Basic
    @Column(name = "cookie", nullable = true, length = -1)
    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    @Basic
    @Column(name = "script", nullable = true, length = -1)
    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    @Basic
    @Column(name = "createtime", nullable = true)
    public Instant getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Instant createtime) {
        this.createtime = createtime;
    }

    @Basic
    @Column(name = "web_config")
    public String getWebConfig() {
        return webConfig;
    }

    public void setWebConfig(String webConfig) {
        this.webConfig = webConfig;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScriptEntity that = (ScriptEntity) o;
        return id == that.id && Objects.equals(cookieBannerTitle, that.cookieBannerTitle) && Objects.equals(cookieBannerContent, that.cookieBannerContent) && Objects.equals(adsBannerTitle, that.adsBannerTitle) && Objects.equals(adsBannerContent, that.adsBannerContent) && Objects.equals(adsLink, that.adsLink) && Objects.equals(cookie, that.cookie) && Objects.equals(script, that.script) && Objects.equals(createtime, that.createtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cookieBannerTitle, cookieBannerContent, adsBannerTitle, adsBannerContent, adsLink, cookie, script, createtime);
    }
}
