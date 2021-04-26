package com.sontekin.roomwebapp.controllers;

import com.sontekin.roomwebapp.services.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rooms")
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public String getRooms(Model model){
        model.addAttribute("rooms", roomService.getAllRooms());
        return "rooms";
    }
}
