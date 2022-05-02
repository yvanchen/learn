package top.yvanchen.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenyuwen
 * @date 2022/4/27
 */
@Slf4j
@RestController
@RequestMapping
public class IndexController {

    @GetMapping
    public String index(String echo){
        log.info(echo);
        return "echo:"+echo;
    }
}
