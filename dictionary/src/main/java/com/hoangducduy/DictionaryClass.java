package com.hoangducduy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryClass{
    private String vi;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String value(@RequestParam("en") String en, Model eng,Model dash, Model vni) {
        Map<String, String> data = new HashMap<String, String>();
        data.put("hello", "xin chao");
        data.put("goodbye", "tam biet");
        for(String i : data.keySet())
            if(i.equals(en)){
                vi = data.get(i);
                eng.addAttribute("en", en);
                dash.addAttribute("dash", ": ");
                vni.addAttribute("vn", vi);
            }else {
                eng.addAttribute("en", "Not found !");
            }

//        eng.addAttribute("en", en);
//        vni.addAttribute("vn", vi);
        return "find";
    }
}