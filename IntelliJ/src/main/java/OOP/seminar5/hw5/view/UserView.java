package OOP.seminar5.hw5.view;

import OOP.seminar5.hw5.model.User;

import java.util.List;

public interface UserView<T extends User> {
    public void sendOnConsole(List<T> list);
}