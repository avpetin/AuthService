package ru.netology.authservice.repository;

import org.springframework.stereotype.Repository;
import ru.netology.authservice.model.Authorities;

import java.util.ArrayList;
import java.util.List;

@Repository
public final class UserRepository {
    private String admin = "admin";
    private String psw = "12345678";
    public List<Authorities> getUserAuthorities(String user, String password) {
        if(user.equals(admin) && password.equals(psw)){
            Authorities[] authorities = Authorities.values();
            return new ArrayList<>(List.of(authorities));
        }
        return new ArrayList<>();
    }
}
