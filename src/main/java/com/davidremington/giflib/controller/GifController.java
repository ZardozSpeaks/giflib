package com.davidremington.giflib.controller;

import com.davidremington.giflib.data.GifRepository;
import com.davidremington.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GifController {

    private GifRepository gifRepository;

    @Autowired
    public GifController(GifRepository gifRepository) {
        this.gifRepository = gifRepository;
    }

    @RequestMapping(value = "/")
    public String listGifs(){
        return "home";
    }

    @RequestMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelMap) {
        Gif gif = gifRepository.findByName(name);
        modelMap.put("gif", gif);
        return "gif-details";
    }


}
