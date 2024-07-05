package com.thesis.taskflow.reponsitories;

import com.thesis.taskflow.entities.Folder;
import com.thesis.taskflow.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FolderRepository  extends JpaRepository<Folder, Integer> {
    List<Folder> findByProject(Project project);
}
