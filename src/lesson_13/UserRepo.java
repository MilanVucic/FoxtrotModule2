package lesson_13;

import java.util.List;

public class UserRepo extends Thread{
    private Callback<List<User>> callback;

    public UserRepo(Callback<List<User>> callback) {
        this.callback = callback;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            List<User> users = List.of(new User(), new User(), new User());
            if (users.isEmpty()) {
                callback.onError("Cannot fetch users.");
            } else {
                callback.onSuccess(users);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
