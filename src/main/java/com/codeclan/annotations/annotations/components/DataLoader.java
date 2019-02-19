package com.codeclan.annotations.annotations.components;

import com.codeclan.annotations.annotations.models.File;
import com.codeclan.annotations.annotations.models.Folder;
import com.codeclan.annotations.annotations.models.User;
import com.codeclan.annotations.annotations.repositories.FileRepository;
import com.codeclan.annotations.annotations.repositories.FolderRepository;
import com.codeclan.annotations.annotations.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

    User louise = new User("Louise");
    userRepository.save(louise);

    User selina = new User("Selina");
    userRepository.save(selina);

    Folder java = new Folder("Java", louise);
    folderRepository.save(java);

    Folder ruby = new Folder("Ruby", selina);
    folderRepository.save(ruby);

    File homework = new File("Homework", ".pdf", 2, java);
    fileRepository.save(homework);

    File classwork = new File("Classwork", ".xml", 6, java);
    fileRepository.save(classwork);

    }


}
