package com.springboot.vuejs.fullstack.springbootmvcvuejsmysql.todo;


import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
