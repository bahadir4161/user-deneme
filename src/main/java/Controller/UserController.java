package Controller;


import Dto.UserDto;
import Model.User;
import Service.UserService;
import Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    public UserController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }


    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<List<UserDto>> getAllUsers() {
        List<UserDto> data = (List<UserDto>) getAllUsers();
        return ResponseEntity.ok(data);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity  getUser(@PathVariable("id") Long id) {
        User data = userServiceImpl.getById(id);
        return ResponseEntity.ok(data);
    }

    @PostMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<UserDto> saveUser(@RequestBody UserDto userDto) {
        userServiceImpl.save(userDto);
        return null;
    }
}



