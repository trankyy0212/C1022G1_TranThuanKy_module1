package service;

import model.User;

import java.util.List;

public interface IUserService {
    void add (User user);
    User findById (int id);
    List<User> listAll ();
    void delete (int id);
    void update (User user);
    List<User> searchByCountry(String country);
}
