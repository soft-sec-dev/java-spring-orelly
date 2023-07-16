package jordan.java.chap3.controllers;

import jordan.java.chap3.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationController {

    @Autowired
    private ConfigurationService config;

    @RequestMapping("/config")
    public ConfigurationService getAllonConfiguration(){
        return config;
    }
}
