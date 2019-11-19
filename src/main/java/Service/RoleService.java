package Service;

import Model.Role;

public interface RoleService {

    Role save(Role role);

    Object getById(Long id);
}
