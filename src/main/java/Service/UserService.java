package Service;


import Dto.UserDto;
import Model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    User save(UserDto user);

    User getById(Long id);

    UserDto getAll();

    Page<User> getAllPageable(Pageable pageable);

    User getByUsername(String username);
}

