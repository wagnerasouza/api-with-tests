package br.com.wagnersouza.api.services;

import br.com.wagnersouza.api.domain.User;

public interface UserService {

    User findById(Integer id);
}
