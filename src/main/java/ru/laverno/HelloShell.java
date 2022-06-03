package ru.laverno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class HelloShell {

    private final HelloService helloService;

    @Autowired
    public HelloShell(HelloService helloService) {
        this.helloService = helloService;
    }

    @ShellMethod(key = "hello-to", value = "Say hello to username")
    public String helloTo(@ShellOption({"username"}) String username) {
        return helloService.helloTo(username);
    }

    @ShellMethod(key = "goodbye", value = "Say goodbye to username")
    public String goodbye(@ShellOption({"username"}) String username) {
        return helloService.goodbye(username);
    }
}
