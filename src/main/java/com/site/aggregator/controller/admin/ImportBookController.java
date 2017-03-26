package com.site.aggregator.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by cetig on 26.03.2017.
 */
@Controller
@RequestMapping(value = "/import/book")
public class ImportBookController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getPage(Model model){
        return "admin/import-book";
    }
}
