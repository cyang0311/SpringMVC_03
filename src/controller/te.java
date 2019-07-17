package controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.Menu;
import pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
@WebServlet("/ajax2")
public class te extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User("张三","123");
        User user2 = new User("张三","123");
        List<User> list = new ArrayList<>();
        list.add(user);
        list.add(user2);
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(list));
        PrintWriter out = resp.getWriter();
        out.print(mapper.writeValueAsString(list));
        out.flush();
        out.close();

    }
}
