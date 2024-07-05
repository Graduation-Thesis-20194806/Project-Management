package com.thesis.taskflow.reponsitories;

import com.thesis.taskflow.entities.FileAttachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileAttachmentRepository extends JpaRepository<FileAttachment, Integer> {
}
