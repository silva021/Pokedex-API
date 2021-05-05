package com.silva.PokedexAPI.api.repository;

import com.silva.PokedexAPI.api.model.pokemon.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
//Anotação que declara que essa classe é responsavel pela persistencia que de dados que irá fazer a comunicação com o banco de dados
public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {

    @Query(value = "select * from t_Pokemon", nativeQuery = true)
    Optional<List<Pokemon>> getAllPokemon();

    @Query(value = "select * from t_Pokemon where name like %:name%", nativeQuery = true)
    Optional<List<Pokemon>> getPokemonByName(@Param(value = "name") String nome);

    @Query(value = "select * from t_Pokemon where id like %:id%", nativeQuery = true)
    Optional<Pokemon> getPokemonById(@Param(value = "id") String id);
}
