package com.example.imagemapping.repository;

import com.example.imagemapping.entity.Avatar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvatarRepository extends JpaRepository<Avatar, Long> {

    byte[] findImageProfilePhotoById(Long id);

}
