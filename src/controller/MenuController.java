package controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Menu;
import service.MenuService;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MenuController {
    @Resource
    private MenuService menuServiceImpl;

    @RequestMapping("show")
    @ResponseBody
    public List<Menu> show(String aa) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(menuServiceImpl.show()));
        return menuServiceImpl.show();
    }
}
