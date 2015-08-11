package net.gongmingqm10.tutorial.api;

import net.gongmingqm10.tutorial.model.APIMessage;
import net.gongmingqm10.tutorial.model.User;
import net.gongmingqm10.tutorial.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/api/users")
public class UsersApi {

    @Autowired
    protected UserService userService;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public
    @ResponseBody
    ResponseEntity index() {
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public
    @ResponseBody
    ResponseEntity create(HttpServletRequest request) {
        String username = request.getParameter("username");
        String city = request.getParameter("city");
        String email = request.getParameter("email");
        String telephone = request.getParameter("telephone");
        String avatar = request.getParameter("avatar");

        if (isEmpty(username)) {
            return new ResponseEntity<APIMessage>(new APIMessage("Username should not be null"),
                    HttpStatus.BAD_REQUEST);
        } else {
            User user = new User().setUsername(username)
                    .setCity(city)
                    .setAvatar(avatar)
                    .setEmail(email)
                    .setTelephone(telephone);

            userService.create(user);
            return new ResponseEntity<APIMessage>(new APIMessage("Create success"), HttpStatus.CREATED);
        }
    }

    @RequestMapping(method = RequestMethod.PUT, produces = "application/json")
    public
    @ResponseBody
    ResponseEntity update(HttpServletRequest request) {
        String username = request.getParameter("username");
        String city = request.getParameter("city");
        String email = request.getParameter("email");
        String telephone = request.getParameter("telephone");
        String avatar = request.getParameter("avatar");
        int userId = Integer.parseInt(request.getParameter("id"));

        if (isEmpty(username)) {
            return new ResponseEntity<APIMessage>(new APIMessage("Username should not be null"),
                    HttpStatus.BAD_REQUEST);
        }

        if (userService.getUserById(userId) == null) {
            return new ResponseEntity<APIMessage>(new APIMessage("Username not exists"),
                    HttpStatus.BAD_REQUEST);
        } else {
            User user = new User().setId(userId).setUsername(username)
                    .setCity(city)
                    .setAvatar(avatar)
                    .setEmail(email)
                    .setTelephone(telephone);

            userService.create(user);
            return new ResponseEntity<APIMessage>(new APIMessage("Create success"), HttpStatus.CREATED);
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public
    @ResponseBody
    ResponseEntity delete(@PathVariable("id") int userId) {
        if (userService.getUserById(userId) == null) {
            return new ResponseEntity<APIMessage>(new APIMessage("User not exists"), HttpStatus.BAD_REQUEST);
        } else {
            userService.delete(userId);
            return new ResponseEntity(HttpStatus.OK);
        }
    }

    private boolean isEmpty(String text) {
        return text == null || "".equals(text);
    }

}
