import smtplib
from email.mime.text import MIMEText
from email.mime.multipart import MIMEMultipart

#서버 정보
smtp_server = "" #
smtp_port = 25
smtp_user = "text" # SMTP 서버 로그인 계정
smtp_password = "test" # // 로그인 비밀번호


# 보내는 사람, 받는 사람, 제목, 본문 설정
smtp_from = ""
smtp_to = ""
message_subject = ""
message_body = "This is test email"

# 이메일 메시지 구성
message = MIMEMultipart()
message["From"] = smtp_from
message["To"] = smtp_to
message["Subject"] = message_subject

# 이메일 본문 추가
message.attach(MIMEText(message_body, "plain"))

try:
    with smtplib.SMTP(smtp_server, smtp_port) as server:
        server.login(smtp_user, smtp_password)

        server.sendmail(smtp_from, smtp_to, message.as_string())

    print("이메일이 성공적으로 전송되었습니다.")
except Exception:
    print("이메일 전송이 실패했습니다.")