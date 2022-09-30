package com.mapper.example.demo.mapper.userEntity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

@Document(collection = "user")
public class UserEntity {

    private String avatar;
    @Id
    private Integer playerId;
    private String id;
    private String url;
    private String username;
    private Integer followers;
    private String country;
    private Integer lastOnline;
    private Integer joined;
    private String status;
    private Boolean isStreamer;
    private Boolean verified;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getFollowers() {
        return followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getLastOnline() {
        return lastOnline;
    }

    public void setLastOnline(Integer lastOnline) {
        this.lastOnline = lastOnline;
    }

    public Integer getJoined() {
        return joined;
    }

    public void setJoined(Integer joined) {
        this.joined = joined;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getIsStreamer() {
        return isStreamer;
    }

    public void setIsStreamer(Boolean isStreamer) {
        this.isStreamer = isStreamer;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
    @Override
    public String toString() {
        return "name:"+this.username;
    }

}