package hello.servlet.basic.web.frontcontroller.v5;

import hello.servlet.basic.web.frontcontroller.ModelView;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface MyHandlerAdapter {
    boolean supports(Object handler);
    ModelView handle(HttpServletRequest request, HttpServletResponse response,Object handler) throws SecurityException , IOException;

}
