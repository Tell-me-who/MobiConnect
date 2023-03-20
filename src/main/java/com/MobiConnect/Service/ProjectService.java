package com.MobiConnect.Service;

import com.MobiConnect.Entity.Project;
import com.MobiConnect.Repository.ProjectRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProjectService {

//    @Autowired
//    private ProjectRepository projectRepository;
//    private List<Project> project = new ArrayList<>(
//            Arrays.asList(
//                    new Project(1L,
//                            "MobiConnect",
//                            "John",
//                            "Basava Kiran",
//                            "2001/04/10",
//                            "2002-05-10",
//                            "Designing")
//            )
//    );
//
//    public List<Project> getList() {
//        return project;
//    }
//
////    public void addProject(Project project1) {
////        project.add(project1);
////
////    }
//
//    public Project addProject(Project projectData){
//        Project result = projectRepository.save(projectData);
//        return result;
//    }
}
