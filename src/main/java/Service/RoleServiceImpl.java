package Service;

import Model.Role;
import Repository.RoleRepository;

public class RoleServiceImpl implements RoleService{
    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {

        this.roleRepository = roleRepository;

    }
    @Override
    public Role save(Role role) {
        return (Role) roleRepository.save(role);
    }

    @Override
    public Object getById(Long id) {
        return roleRepository.getOne(id);
    }
}
