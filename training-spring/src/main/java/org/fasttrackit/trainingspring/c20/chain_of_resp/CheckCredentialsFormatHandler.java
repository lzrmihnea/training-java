package org.fasttrackit.trainingspring.c20.chain_of_resp;

import org.apache.commons.lang3.StringUtils;
import org.fasttrackit.trainingspring.c20.model.LoginCredentialsDto;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("checkCredentialsFormat")
public class CheckCredentialsFormatHandler implements Handler {

    private static final String ERROR_MESSAGE = "Format of credentials invalid";

    private final Handler next;

    public CheckCredentialsFormatHandler(@Qualifier("credentialsFromDbHandler") Handler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(LoginCredentialsDto req) {
        String username = req.getUsername();
        String password = req.getPassword();

        if (StringUtils.isBlank(username)
                || StringUtils.isBlank(password)
                || StringUtils.isBlank(req.getBrowser())
                || username.length() <= 10
                || password.length() <= 10) {
            throw new RuntimeException(ERROR_MESSAGE);
        }

        if (this.next != null) {
            this.next.handleRequest(req);
        }
    }
}
