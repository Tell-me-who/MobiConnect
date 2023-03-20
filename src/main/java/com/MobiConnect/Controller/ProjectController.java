package com.MobiConnect.Controller;

import com.MobiConnect.Entity.Client;
import com.MobiConnect.Entity.Project;
import com.MobiConnect.Repository.ClientRepository;
import com.MobiConnect.Repository.ProjectRepository;
import com.MobiConnect.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProjectController {
//    @Autowired
//    private ProjectService projectService;
//
//    // uri - http://localhost:8080/projects
//    @GetMapping("/projects")
//    public List<Project> getAllList(){
//        return this.projectService.getList();
//    }
//
//
//    // uri - http://localhost:8080/add
//    @PostMapping("/add")
//
//    public ResponseEntity<Project> addProject(@RequestBody Project project){
//        this.projectService.addProject(project);
//        return ResponseEntity.ok(project);
//
//
//    }

    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping("project")
    public List<Project> getProject(){
        return this.projectRepository.findAll();
    }

    @PostMapping("addProject")
    public Project addProject(@RequestBody Project project){
        return this.projectRepository.save(project);
    }
}
