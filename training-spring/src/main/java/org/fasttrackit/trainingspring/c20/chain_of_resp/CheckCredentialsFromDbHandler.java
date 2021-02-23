package org.fasttrackit.trainingspring.c20.chain_of_resp;

import org.fasttrackit.trainingspring.c20.CredentialsRepository;
import org.fasttrackit.trainingspring.c20.model.LoginCredentialsDto;
import org.springframework.stereotype.Component;

@Component("credentialsFromDbHandler")
public class CheckCredentialsFromDbHandler implements Handler {

    private static final String ERROR_MESSAGE = "Credentials incorrect";
    private final CredentialsRepository credentialsRepository;

    public CheckCredentialsFromDbHandler(CredentialsRepository credentialsRepository) {
        this.credentialsRepository = credentialsRepository;
    }

    @Override
    public void handleRequest(LoginCredentialsDto loginCredentials) {
        boolean areCredentialsCorrect = this.credentialsRepository.areCredentialsCorrect(
                loginCredentials.getUsername(),
                loginCredentials.getPassword());
        if(!areCredentialsCorrect) {
            throw new RuntimeException(ERROR_MESSAGE);
        }
    }
}
