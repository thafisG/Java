import org.springframework.web.bind.annotation.RestController;

@RestController
@Resquestmapping("/users")
public class UserController {

    @postMapping("/")
    public void create(@ResquestBody UserModel userModel) {
        System.out.peintln(userModel.name);
    }
}
