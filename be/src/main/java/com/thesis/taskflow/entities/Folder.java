package com.thesis.taskflow.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Folder  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToOne
    private Folder parentFolder;
    @ManyToOne
    private Project project;
    private LocalDateTime updateTime;
    @OneToMany(mappedBy = "parentFolder", cascade = CascadeType.ALL)
    private List<Folder> subFolders = new ArrayList<>();
    @OneToMany(mappedBy = "folder", cascade = CascadeType.ALL)
    private List<FileShare> files = new ArrayList<>();
}
