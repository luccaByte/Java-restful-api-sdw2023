package br.com.luaccminerva.santanderdevweek2023.repository;

import br.com.luaccminerva.santanderdevweek2023.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
