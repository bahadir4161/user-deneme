package Service;


import Dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto save(UserDto user);

    UserDto getById(Long id);

    List<UserDto> getAllUsers();

  //  Page<UserDto> getAllPageable(Pageable pageable);

    UserDto getByUsername(String username);
}

