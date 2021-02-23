package org.fasttrackit.trainingspring.c20.chain_of_resp;

import org.fasttrackit.trainingspring.c20.model.LoginCredentialsDto;
import org.springframework.beans.factory.annotation.Qualifier;

public class ChainOfRespService {

    private final Handler loginHandler;

    public ChainOfRespService(@Qualifier("checkCredentialsFormat") Handler loginHandler) {
        this.loginHandler = loginHandler;
    }

    public boolean canLogin(LoginCredentialsDto login) {
        this.loginHandler.handleRequest(login);

        // do some other logic

        return true; // return result of logic
    }
}
