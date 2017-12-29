package edu.technopolis.advanced.boatswain.incoming.request;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by esselesse on 29.12.2017.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Payload {
    String url;

    public Payload(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
