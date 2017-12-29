package edu.technopolis.advanced.boatswain.incoming.request;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by esselesse on 29.12.2017.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Attachments<R extends String> {
    String type;
    Payload payload;

    public Attachments(String type, String url) {
        this.type = type;
        this.payload = new Payload(url);
    }
//    private R[] params;

//    public Object[] getThings() {
//        return things;
//    }

//    public void setThings(Object[] things) {
//        this.things = things;
//    }

//    public R[] getParams() {
//        return params;
//    }
//
//    public void setParams(R[] params) {
//        this.params = params;
//    }

        public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Payload getPayload() {
        return payload;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }
}
