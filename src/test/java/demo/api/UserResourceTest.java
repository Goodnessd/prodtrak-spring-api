package demo.api;

import demo.domain.User.User;
import demo.services.UserService;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.*;

public class UserResourceTest {


    @Autowired
    private UserService users;

    private UserResource userResource;

    @Before
    public void setUp(){
        userResource = new UserResource(users);
    }

    @Ignore
    @Test
    public void shouldReturnListOfStudents(){
        List<User> users = userResource.getUsers();

        assertThat(users, is(notNullValue()));
    }
}