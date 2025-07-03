package com.qy.utils;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordEncoder {

    public static String encode(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public static boolean check(String password, String encodedPassword) {
        return BCrypt.checkpw(password, encodedPassword);
    }
}
