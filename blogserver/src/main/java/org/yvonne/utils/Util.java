package org.yvonne.utils;

import org.springframework.security.core.context.SecurityContextHolder;
import org.yvonne.bean.User;

/**
 * Created by yvonne
 */
public class Util {
    public static User getCurrentUser() {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return user;
    }
}
