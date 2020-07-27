package com.action;

import com.service.ForeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@CrossOrigin
public class ForeignAction {
    @Autowired
    private ForeignService foreignService;

    @GetMapping("/getCommodityList")
    public Map getCommodityList(@RequestParam(required = false) Map param){
        return this.foreignService.getCommodityList(param);
    }

    @GetMapping("/getCarouselList")
    public Map getCarouselList(@RequestParam(required = false) Map param){
        return this.foreignService.getCarouselList(param);
    }

    @GetMapping("/getCateList")
    public Map getCateList(@RequestParam(required = false) Map param){
        return this.foreignService.getCateList(param);
    }
}
