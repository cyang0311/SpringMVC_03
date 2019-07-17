package mapper;

import org.apache.ibatis.annotations.Select;
import pojo.Menu;

import java.util.List;

public interface MenuMapper {

    List<Menu> sleByPid(int pid);

}
