package com.thesis.taskflow.services;

import com.thesis.taskflow.entities.ImageData;
import com.thesis.taskflow.entities.User;
import com.thesis.taskflow.reponsitories.ImageDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.List;

@Service
public class ImageDataService {
    @Autowired
    private ImageDataRepository imageDataRepository;

    public ImageData getImageByUser(User user) {
        List<ImageData> imageDatas = imageDataRepository.findByUser(user);
        return imageDatas.get(0);
    }

    @Transactional
    public String uploadImage(MultipartFile file, User user) throws IOException {
        List<ImageData> images = imageDataRepository.findByUser(user);
        if (images.size() == 0) {
//            imageDataRepository.saveNewImageData(user, ImageUtil.compressImage(file.getBytes()));
            imageDataRepository.saveNewImageData(user, file.getBytes());
            return ("Image created successfully" );
        }
        else {
            ImageData image = images.get(0);
//            imageDataRepository.updateImageData(image.getId(), ImageUtil.compressImage(file.getBytes()));
            imageDataRepository.updateImageData(image.getId(), file.getBytes());
            return ("Image uploaded successfully" );
        }
    }
}
