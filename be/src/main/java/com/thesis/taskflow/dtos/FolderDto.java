package com.thesis.taskflow.dtos;

import com.thesis.taskflow.entities.FileShare;
import com.thesis.taskflow.entities.Folder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class FolderDto {
    private int id;
    private String folderName;
    private LocalDateTime updateTime;
    private List<SubFolderDto> subFolders = new ArrayList<>();
    private List<FileShareDto> fileShares = new ArrayList<>();

    public FolderDto() {
    }

    public FolderDto(Folder folder) {
        this.id = folder.getId();
        this.folderName = folder.getName();
        this.updateTime = folder.getUpdateTime();
        for (FileShare fileShare : folder.getFiles()) {
            FileShareDto fileShareDto = new FileShareDto(fileShare);
            this.fileShares.add(fileShareDto);
        }
        for (Folder folder1 : folder.getSubFolders()) {
            SubFolderDto subFolderDto = new SubFolderDto(folder1);
            this.subFolders.add(subFolderDto);
        }
    }
}
