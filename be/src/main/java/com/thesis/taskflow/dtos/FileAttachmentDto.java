package com.thesis.taskflow.dtos;

import com.thesis.taskflow.entities.FileAttachment;
import lombok.Data;

@Data
public class FileAttachmentDto {
    private int id;
    private String filename;

    public FileAttachmentDto() {

    }

    public FileAttachmentDto(FileAttachment fileAttachment) {
        this.id = fileAttachment.getId();
        this.filename = fileAttachment.getFileName();
    }
}
