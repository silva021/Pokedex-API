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

    @Query(value = "select *  from t_Pokemon p inner join t_Abilities a on p.id = a.id_pokemon", nativeQuery = true)
    Optional<List<Pokemon>> getAllPokemon();

    @Query(value = "select *  from t_Pokemon p inner join t_Abilities a on p.id = a.id_pokemon where name like %:name%", nativeQuery = true)
    Optional<List<Pokemon>> getPokemonByName(@Param(value = "name") String nome);

    @Query(value = "select *  from t_Pokemon p inner join t_Abilities a on p.id = a.id_pokemon where p.id = :id", nativeQuery = true)
    Optional<Pokemon> getPokemonById(@Param(value = "id") String id);

    @Query(value = "select *  from t_Pokemon p inner join t_Abilities a on p.id = a.id_pokemon where generation = :generation", nativeQuery = true)
    Optional<List<Pokemon>> getAllPokemonByGeneration(@Param(value = "generation") int generation);
}
