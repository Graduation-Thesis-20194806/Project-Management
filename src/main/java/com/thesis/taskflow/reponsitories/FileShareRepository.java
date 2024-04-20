package com.thesis.taskflow.reponsitories;

import com.thesis.taskflow.entities.FileShare;
import com.thesis.taskflow.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FileShareRepository extends JpaRepository<FileShare, Integer> {
    List<FileShare> findByProject(Project project);

}
