package hello.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


/**
 * 1.파라미터 전송기능
 * http://localhost:8080/request-param?username=hello
 */
@WebServlet(name = "requestParamServlet" , urlPatterns = "/request-param")
public class RequstParamServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("[전체 파라미터 조회] - start");
        req.getParameterNames().asIterator()
                .forEachRemaining(name -> System.out.println("paramName = " + req.getParameter(name)));
        System.out.println("[전체 파라미터 조회] - end");
        System.out.println();
        System.out.println("[단일 파라미터 조회]");
      String username =  req.getParameter("username");
      System.out.println("username = " + username);

        System.out.println("[이름이 같은 복수 파라미터 조회]");
        String [] usernames = req.getParameterValues("username");
        for (String s : usernames) {
            System.out.println("usernames = " + s);
        }

        resp.getWriter().write("ok " + username);
    }
}
