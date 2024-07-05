package com.thesis.taskflow.dtos;

import com.thesis.taskflow.entities.Folder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SubFolderDto {
    private int id;
    private String folderName;
    private LocalDateTime updateTime;

    public SubFolderDto(Folder folder) {
        this.id = folder.getId();
        this.folderName = folder.getName();
        this.updateTime = folder.getUpdateTime();
    }
}
