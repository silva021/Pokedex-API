package com.silva.PokedexAPI.api.repository;

import com.silva.PokedexAPI.api.model.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(value = "select * from t_User", nativeQuery = true)
    Optional<User> getUser();

}
