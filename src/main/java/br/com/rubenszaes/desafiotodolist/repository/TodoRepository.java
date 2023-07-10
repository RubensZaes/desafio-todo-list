package br.com.rubenszaes.desafiotodolist.repository;

import br.com.rubenszaes.desafiotodolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
