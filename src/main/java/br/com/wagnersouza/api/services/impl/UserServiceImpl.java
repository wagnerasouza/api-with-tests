package br.com.wagnersouza.api.services.impl;

import br.com.wagnersouza.api.domain.User;
import br.com.wagnersouza.api.domain.dto.UserDTO;
import br.com.wagnersouza.api.repositories.UserRepository;
import br.com.wagnersouza.api.services.UserService;
import br.com.wagnersouza.api.services.exceptions.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    @Override
    public List<User> findAll(){
        return repository.findAll();
    }

    @Override
    public User create(UserDTO dto) {
        return repository.save(mapper.map(dto, User.class));
    }
}
