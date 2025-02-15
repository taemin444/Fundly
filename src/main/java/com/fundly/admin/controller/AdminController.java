package com.fundly.admin.controller;

import com.persistence.dto.NewsDto;
import com.fundly.admin.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller

public class AdminController {
    @Autowired
    NewsService newsService;
//    @GetMapping("/admin")
//    public String admin(){
//            return "admin/index";
//    }

    @GetMapping("/list")
    public String getNewsList(Model model){
        try {
            List<NewsDto> NewsList = newsService.selectAllNews();
            model.addAttribute("NewsList",NewsList);
            System.out.println(NewsList);
            return "admin/index";
        } catch (Exception e) {
            return "error";
        }

    }
}
