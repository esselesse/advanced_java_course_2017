package edu.technopolis.advanced.boatswain.incoming.request;

import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Message {
    private String seq;
    private String mid;
    private String text;
//    private Object[] attachment;
    private Object[] attachment;

    public Message() {
    }

    public Message(String text) {
        this.text = text;
    }

    public Message(String type, String url) {
        this.attachment = new Object[1];
        this.attachment[0]=new Attachments(type, url);
    }

    public Message(Object[] attachments) {
        this.attachment = attachments;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Object[] getAttachments(){
        return attachment;
    }

    public void setAttachments(Object[] attachment){
        this.attachment = attachment;
    }

//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public String getPayload() {
//        return payload;
//    }
//
//    public void setPayload(String payload) {
//        this.payload = payload;
//    }



    @Override
    public String toString() {
        return "Message{" +
                "seq='" + seq + '\'' +
                ", mid='" + mid + '\'' +
                ", text='" + text + '\'' +
//                ", type='" + type + '\'' +
//                ", payload='" + payload + '\'' +
                '}';
    }

//    public static class Attachment {
//        String type;
//        String payload;
//        public Attachment(String type, String payload){
//            this.type = type;
//            this.payload = payload;
//        }
//
//        public String toString() {
//            return "{type=" + type + '\'' +
//                    ", payload='" + payload + '\'' +
//                    '}';
//        }
//
//    }


}
