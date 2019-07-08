package org.dimigo.openapi;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.net.URL;


public class NaverCrawl {
    public static void main(String[] args) {
        BufferedReader br;
        BufferedWriter bw;
        try {
            String str = "change";
            Document doc = Jsoup.parse(new URL("http://dictionary.cambridge.org/us/dictionary/english-korean/"+str), 5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
