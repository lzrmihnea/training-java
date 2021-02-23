package org.fasttrackit.trainingspring.c20.chain_of_resp;

import org.fasttrackit.trainingspring.c20.model.LoginCredentialsDto;

public interface Handler {

    void handleRequest(LoginCredentialsDto loginCredentials);
}
