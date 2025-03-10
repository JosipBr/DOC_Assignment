package via.doc1.spring_boot_docker_app1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutController {

    @RequestMapping("/about")
    public String aboutMe() {
        return "<body bgcolor=\"#9FE2BF\">"
                + "<h1>DevOps and Cloud</h1> "
                + "<h2>Dockerizing Spring Boot Application.</h2>"
                + "<section>"
                + "<h2>About Me</h2>"
                + "<p> describe your <span style=\"color: blue;\">team wish for SEP4</span> here...</p>"
                + "</section>"
                + "<p>Team members wish</p>"
                + "<ul>"
                + "<li>Name of team member 1</li>"
                + "<li>Name of team member 2</li>"
                + "<li>Name of team member 3</li>"
                + "</ul>"
                + "</body>";
    }
}
