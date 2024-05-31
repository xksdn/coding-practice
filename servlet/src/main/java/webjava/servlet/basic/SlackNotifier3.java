package webjava.servlet.basic;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

public class SlackNotifier3 {

    private static final String SLACK_WEBHOOK_URL = "https://hooks.slack.com/services/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";

    public static void send(String errorMsg) {
        RestTemplate restTemplate = new RestTemplate();  //RestTemplate 객체 생성 (HTTP요청을 보내고 응답 받는 용도)
        HttpHeaders headers = new HttpHeaders(); //  HttpHeaders 객체 생성 (HTTP 요청 및 응답 헤더 설정)
        headers.setContentType(MediaType.APPLICATION_JSON); //HttpHeaders 객체에 JSON으로 컨텐츠 타입 설정


        //System.out.println("errorMsg: " + errorMsg);

        String reg_Error = errorMsg.replace("\"", "\\\"");
        //System.out.println("reg_Error: " + reg_Error);
        String slackMessage = "{\"text\": \"" + reg_Error + "\"}"; // 슬랙으로 보낼 메세지 생성 (JSON)
        //System.out.println("slackMessage: " + slackMessage);

        HttpEntity<String> request = new HttpEntity<>(slackMessage, headers); //HttpEntity 객체 생성
        /*  HttpEntity 객체를 생성하여 Slack으로 보낼 HTTP 요청 생성, HTTP 바디와 헤더를 캡슐화
        slackMessage : 슬랙으로 보낼 메세지 (JSON) / header : HTTP 요청의 헤더 정보 (JSON)
        * */

        // restTemplate.postForObject(SLACK_WEBHOOK_URL, request, String.class);
        // HTTP POST 요청을 보내고 서버로부터 받은 응답을 지정한 클래스 타입의 객체로 반환

        restTemplate.postForObject(SLACK_WEBHOOK_URL, request, String.class);

    }
}
