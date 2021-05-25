package com.silva.PokedexAPI.api.repository;

import com.silva.PokedexAPI.api.model.pokemon.Pokemon;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
//Anotação que declara que essa classe é responsavel pela persistencia que de dados que irá fazer a comunicação com o banco de dados
public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {

//    @Query(value = "select *  from t_Pokemon p inner join t_Abilities a on p.id = a.id_pokemon ORDER BY id OFFSET ((:page - 1) * 10) ROWS FETCH NEXT 10 ROWS ONLY", nativeQuery = true)
    @Query(value = "select * from t_Pokemon p inner join t_Abilities a on p.id = a.id_pokemon ORDER BY id limit :page, 10;", nativeQuery = true)
    Optional<List<Pokemon>> getAllPokemon(@Param(value = "page") int page);

    @Query(value = "select *  from t_Pokemon p inner join t_Abilities a on p.id = a.id_pokemon where name like %:name%  ORDER BY id  limit :page, 10;", nativeQuery = true)
    Optional<List<Pokemon>> getPokemonByName(@Param(value = "name") String nome, @Param(value = "page") int page);

    @Query(value = "select *  from t_Pokemon p inner join t_Abilities a on p.id = a.id_pokemon where p.id = :id", nativeQuery = true)
    Optional<Pokemon> getPokemonById(@Param(value = "id") String id);

    @Query(value = "select *  from t_Pokemon p inner join t_Abilities a on p.id = a.id_pokemon where generation = :generation ORDER BY id  limit :page, 10;", nativeQuery = true)
    Optional<List<Pokemon>> getAllPokemonByGeneration(@Param(value = "generation") int generation, @Param(value = "page") int page);

    @Query(value = "select *  from t_Pokemon p inner join t_Abilities a on p.id = a.id_pokemon where (type1 = :type) or (type2 = :type) order by id   limit :page, 10;", nativeQuery = true)
    Optional<List<Pokemon>> findPokemonByType(@Param(value = "type") String type, @Param(value = "page") int page);
}
