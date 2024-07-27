package hello.servlet.basic.web.frontcontroller.v4;

import hello.servlet.basic.web.frontcontroller.ModelView;
import jakarta.servlet.http.HttpServletRequest;

import java.util.Map;

public interface ControllerV4 {
    String process(Map<String, String> paramMap,Map<String, Object> model);
}
