package me.kodysimpson.musicarchivebackend.controllers;

import me.kodysimpson.musicarchivebackend.services.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class IndexController {

    private final StorageService storageService;

    @Autowired
    public IndexController(StorageService storageService) {
        this.storageService = storageService;
    }

    @GetMapping
    public String getHomepage(Model model){

        //MVC - Model, View, Controller
        model.addAttribute("songFileNames", storageService.getSongFileNames());

        return "index";
    }

    @PostMapping
    public String handleFileUpload(@RequestParam("file")MultipartFile file) throws IOException {

        storageService.uploadSong(file);

        return "redirect:/";
    }

}
