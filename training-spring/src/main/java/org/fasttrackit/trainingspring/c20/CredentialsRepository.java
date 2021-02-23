package org.fasttrackit.trainingspring.c20;

import org.springframework.stereotype.Repository;

@Repository
public interface CredentialsRepository {

    boolean areCredentialsCorrect(String username, String password);
}
