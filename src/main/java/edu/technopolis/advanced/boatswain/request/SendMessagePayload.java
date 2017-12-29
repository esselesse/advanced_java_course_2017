package edu.technopolis.advanced.boatswain.request;

import java.net.URL;

import com.sun.xml.internal.ws.api.message.Attachment;

import edu.technopolis.advanced.boatswain.incoming.request.Message;

public class SendMessagePayload implements RequestPayload {
    private final SendRecipient recipient;
    private final Message message;
    private final URL picture;

    public SendMessagePayload(SendRecipient recipient, Message message) {
        this.recipient = recipient;
        this.message = message;
        this.picture = null;
    }

    public SendMessagePayload(SendRecipient recipient, Message message, URL picture) {
        this.recipient = recipient;
        this.message = message;
        this.picture = picture;
    }

    public SendRecipient getRecipient() {
        return recipient;
    }

    public Message getMessage() {
        return message;
    }

    @Override
    public String toString() {
        String s = "SendMessagePayload{" +
                "recipient=" + recipient +
                ", message=" + message + (picture==null?"":(", attachment=IMAGE {payload=" + picture + "}")) +
                '}';
        return s;
    }


//                    {
//                        "recipient":{"chat_id":"chat:C3ecb9d02a600"},                     /* ID чата в формате chat:id */
//                        "message":{                                                       /* Содержание сообщения */
//                        "attachment":{
//                            "type":"IMAGE",
//                                    "payload":{"url":"https://st.mycdn.me/res/i/ok_logo.png"}     /* URL изображения в формате jpg или png */
//                        }
//                    }
//                    }

}
