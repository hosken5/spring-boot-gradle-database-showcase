package database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hongpf on 16/4/19.
 */
@Controller
public class HomeController {

    @Autowired
    JdbcTemplate jdbcTemplate ;

    @RequestMapping("/")
    @ResponseBody
    public Object index(){
       return  jdbcTemplate.queryForObject("select count(1) from test",String.class);
    }
}
