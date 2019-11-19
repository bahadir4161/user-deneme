package Service;


import Dto.UserDto;
import Model.User;
import Repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getById(Long id) {
        User user = userRepository.getOne(id);
        return user;
    }


    @Override
    public UserDto getAll() {
        List<User> users=userRepository.findAll();
        return null;
    }

    @Override
    public User save(UserDto user) {
        if (user.getUsername() == null)
            throw new IllegalArgumentException("email code cannot be null");
        return userRepository.save(user);
    }

    @Override
    public Page<User> getAllPageable(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public User getByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}