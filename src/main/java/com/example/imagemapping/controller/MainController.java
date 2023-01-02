package com.example.imagemapping.controller;

import com.example.imagemapping.entity.Avatar;
import com.example.imagemapping.service.AvatarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@CrossOrigin
@RestController
@RequiredArgsConstructor
public class MainController {
    private final AvatarService avatarService;

    @PostMapping(value = "/save")
    private Avatar saveNewDetails(@ModelAttribute Avatar avatar){
        return this.avatarService.saveNewDetails(avatar);
    }

    @GetMapping(value = "/get/{id}")
    private Avatar getAvatarDetails(@PathVariable("id") Long id) {
        return this.avatarService.getAvatarDetailsById(id);
    }

    @GetMapping(value = "/getImage/{id}")
    public ResponseEntity<String> getImageById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(this.avatarService.findPhotoById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/loadAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Avatar>> loadAllDAta() {
        return new ResponseEntity<>(this.avatarService.getAllData(), HttpStatus.OK);
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public ResponseEntity<String> deleteById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(this.avatarService.deleteById(id), HttpStatus.OK);
    }
}