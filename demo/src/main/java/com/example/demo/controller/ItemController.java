package com.example.demo.controller;
import com.example.demo.DAO.ItemDao;
import com.example.demo.Model.Item;
import com.example.demo.Exception.ItemNotFoundException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    private ItemDao itemdao = new ItemDao();
    
    @RequestMapping("/")
    public String hello() {
        Item item = itemdao.getItem(02);
        return item.getDesc();
    }
    
}
