package service;

import mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Menu;

import java.util.ArrayList;
import java.util.List;
@Service
public class MenuServiceImpl implements MenuService{
    @Autowired
    private MenuMapper menuMapper;

    public MenuMapper getMenuMapper() {
        return menuMapper;
    }

    public void setMenuMapper(MenuMapper menuMapper) {
        this.menuMapper = menuMapper;
    }
    @Override
    public List<Menu> show() {
        return menuMapper.sleByPid(0);
    }
}
