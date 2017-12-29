package edu.technopolis.advanced.boatswain.response;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Joker {
    public static String bashImRnd() throws IOException {
        String address = "http://bash.org.ru/forweb/?u";
        URL url = new URL(address);
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));
        String s, whole="";

        while((s = br.readLine())!=null){
            whole+=s;
        }
        br.close();

        String delims = "<' + '/span><' + 'br> | <' + 'br><' + 'small>";
        String[] strs = whole.split(delims);
        String text = strs[0].replace("<' + 'br>", " \n ");
        text = text.replace("<' + 'br />", " \n ");
        text = text.replace("&quot;", "\"");
        text = text.replace("&lt;", "<");
        text = text.replace("&gt;", ">");
        text = text.replace("var borq='';borq += '<' + 'div id=\"b_q\"><' + 'a href=\"", "");
        text = text.replace("<' + '/a> <' + 'span id=\"b_q_h\">[", "");
        text = text.replace("]<' + '/span><' + 'div id=\"b_q_t\" style=\"padding: 1em 0;\">", " \n ");
        text = text.replace("<' + '/div><' + 'small><' + 'a href=\"http://bash.im/\" target=\"_blank\" title=\"bash.im откроется в новом окне\">Больше на bash.im!<' + '/a><' + '/small><' + '/div>';document.write(borq);", "");
        String str = text.substring(text.indexOf(" ")+1);
        str = str.substring(str.indexOf(" "));
        text = text.substring(0, text.indexOf(" "))+ str;
        return text;
    }
}
