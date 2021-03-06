package site.timely.services.base.service;


import site.timely.services.base.domain.User;

import java.util.List;

/**
 * 用户服务
 */
public interface UserService extends JpaService<User, Long> {
    User findByUsername(String username);

    void deleteByUsername(String username);

    /**
     * 查询所有权限码
     *
     * @param user 用户
     * @return 权限码集合
     */
    List<String> getPrivilegeCodes(User user);

}
