package com.codeclan.annotations.annotations;

import com.codeclan.annotations.annotations.models.File;
import com.codeclan.annotations.annotations.models.Folder;
import com.codeclan.annotations.annotations.models.User;
import com.codeclan.annotations.annotations.repositories.FileRepository;
import com.codeclan.annotations.annotations.repositories.FolderRepository;
import com.codeclan.annotations.annotations.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnnotationsApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createUserFolderAndFile() {
		User louise = new User("Louise");
		userRepository.save(louise);

		Folder java = new Folder("Java", louise);
		folderRepository.save(java);

		File homework = new File("Homework", ".pdf", 2, java);
		fileRepository.save(homework);
	}

}
