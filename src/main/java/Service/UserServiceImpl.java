package Service;


import Dto.UserDto;
import Model.User;
import Repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private ModelMapper modelMapper;

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDto getById(Long id) {
        User user = userRepository.getOne(id);
        UserDto userDto = modelMapper.map(user, UserDto.class);
        return userDto;
    }


    @Override
    public List<UserDto> getAllUsers() {
        List<UserDto> userDtos=new List<UserDto>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<UserDto> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(UserDto userDto) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends UserDto> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends UserDto> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public UserDto get(int index) {
                return null;
            }

            @Override
            public UserDto set(int index, UserDto element) {
                return null;
            }

            @Override
            public void add(int index, UserDto element) {

            }

            @Override
            public UserDto remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<UserDto> listIterator() {
                return null;
            }

            @Override
            public ListIterator<UserDto> listIterator(int index) {
                return null;
            }

            @Override
            public List<UserDto> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        List<User> users = userRepository.findAll();
        for(User user : users){
           userDtos.add(modelMapper.map(user,UserDto.class));
        }
        return userDtos;

    }



    @Override
    public UserDto save(UserDto userDto) {
        User user=modelMapper.map(userDto,User.class);
        if (user.getUsername() == null)
            throw new IllegalArgumentException("email code cannot be null");
        userRepository.save(user);
        user.setUser_id(user.getUser_id());

        return userDto=modelMapper.map(user,UserDto.class);
    }



    @Override
    public UserDto getByUsername(String username) {
        User u = userRepository.findByUsername(username);
        return modelMapper.map(u, UserDto.class);
    }
}