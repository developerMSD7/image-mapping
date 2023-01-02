package com.example.imagemapping.service;

import com.example.imagemapping.entity.Avatar;
import com.example.imagemapping.repository.AvatarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AvatarImpl implements AvatarService {

    private final AvatarRepository avatarRepository;

    public Avatar saveNewDetails(Avatar avatar) {
//        avatar.setImage(Image.builder().profilePhoto(Base64.getEncoder().encodeToString(image.getBytes())).build());
        return this.avatarRepository.save(avatar);
    }

    @Override
    public Avatar getAvatarDetailsById(Long id) {
        return this.avatarRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Avatar> getAllData() {
        return this.avatarRepository.findAll();
    }

    public String findPhotoById(Long id) {
//        return this.avatarRepository.findById(id).orElseThrow().getImage().getProfilePhoto();
        return null;
    }

    @Override
    public String deleteById(Long id) {
        this.avatarRepository.deleteById(id);
        if (this.avatarRepository.findById(id).isPresent()) {
            return id + " not deleted successfully !";
        } else
            return id + " deleted successfully !";
    }
}