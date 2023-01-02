package com.example.imagemapping.service;

import com.example.imagemapping.entity.Avatar;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface AvatarService {

    Avatar saveNewDetails(Avatar avatar);

    Avatar getAvatarDetailsById(Long id);

    List<Avatar> getAllData();

    String findPhotoById(Long id);

    String deleteById(Long id);
}
