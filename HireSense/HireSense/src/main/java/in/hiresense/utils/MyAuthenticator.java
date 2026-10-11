package in.hiresense.utils;

import jakarta.mail.Authenticator;
import jakarta.mail.PasswordAuthentication;

public class MyAuthenticator extends Authenticator {

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        String email = System.getenv("SMTP_EMAIL");
        String password = System.getenv("SMTP_PASSWORD");

        if (email == null || email.trim().isEmpty()
                || password == null || password.trim().isEmpty()) {
            throw new IllegalStateException(
                "SMTP_EMAIL and SMTP_PASSWORD environment variables must be configured.");
        }

        return new PasswordAuthentication(email, password);
    }
}
