package webjava.servlet.basic;

import com.slack.api.Slack;
import com.slack.api.webhook.Payload;
import com.slack.api.webhook.WebhookResponse;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;


@Slf4j
public class SlackNotifier2 {
    private static final String SLACK_WEBHOOK_URL = "https://hooks.slack.com/services/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";
    //WebHook URL 설정

    /*
     * 슬랙으로 메세지 보내는 메서드 구현
     * errorMsg: 매개변수
     * Slack.getInstance() 호출 : 슬랙 객체 획득 --> 이 객체를 사용하여 SLACK API 호출 가능
     * Payload.builder().text(errorMsg).build()  //슬랙에 보낼 메세지 내용 설정
     * text(errorMsg) 메서드를 통해 전달된 오류 메시지를 텍스트로 설정,  build() 메서드를 호출하여 Payload 객체를 생성함
     * */
    public static WebhookResponse send(String errorMsg) {
        try {
            WebhookResponse response = null;
            Slack slack = Slack.getInstance();
            Payload payload = Payload.builder().text(errorMsg).build();
            response = slack.send(SLACK_WEBHOOK_URL, payload); // Slack에 메세지 보냄, 웹훅URL과 생성된 payload객체 전달
            return response; // 메세지 전송 결과 return
        } catch (IOException e) {
            log.error(e.getMessage(), e);
            throw new RuntimeException(e);
        }
    }
}
