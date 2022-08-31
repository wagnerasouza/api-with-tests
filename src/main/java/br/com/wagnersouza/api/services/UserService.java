package br.com.wagnersouza.api.services;

import br.com.wagnersouza.api.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();
}
