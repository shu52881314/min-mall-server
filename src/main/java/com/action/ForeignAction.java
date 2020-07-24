package com.action;

import com.util.PageData;
import com.service.ForeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
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
}
