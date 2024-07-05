package com.thesis.taskflow.reponsitories;

import com.thesis.taskflow.entities.ImageData;
import com.thesis.taskflow.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ImageDataRepository extends JpaRepository<ImageData, Integer> {
    public List<ImageData> findByUser(User user);
    @Transactional
    default void updateImageData(int id, byte[] newImageData) {
        ImageData imageData = findById(id).orElse(null);
        if (imageData != null) {
            imageData.setImageData(newImageData);
            save(imageData); // Hoặc có thể sử dụng saveAndFlush(imageData);
        }
    }
    @Transactional
    default void saveNewImageData(User user, byte[] newImageData) {
        ImageData imageData = new ImageData();
        imageData.setImageData(newImageData);
        imageData.setUser(user);
        imageData.setName("aaaa");
        imageData.setType("aaaa");
        save(imageData);
    }
}
