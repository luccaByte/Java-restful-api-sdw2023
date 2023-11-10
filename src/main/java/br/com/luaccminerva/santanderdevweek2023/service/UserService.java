package br.com.luaccminerva.santanderdevweek2023.service;

import br.com.luaccminerva.santanderdevweek2023.domain.model.User;

public interface UserService {
    
    User findById(Long id);

    User create (User userToCreate);
}
