package com.kushkumardhawan.test.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dao.repositories.ImageRepository;
import entities.ImageData;


@ActiveProfiles("dev")
@ContextConfiguration(locations ={"classpath:com/kushkumardhawan/test/config/datasource-jpa.xml"} )
@RunWith(SpringJUnit4ClassRunner.class)
public class ImageSaveTest {
	
	@Autowired
	ImageRepository imageRepository;
	
	
	@Test
	public void saveImage() throws IOException {
		ImageData id = new ImageData();
		id.setImageName("IPAV2.apk");
		
		File file = new File("C:/Users/Kush.Dhawan/Desktop/IPAV2.1.apk");
		byte[] content = new byte[(int) file.length()]; 
		FileInputStream stream = new FileInputStream(file); 
		stream.read(content);
		
		id.setImageData(content);
		id.setImageuploadedby("Kush");
		
		imageRepository.save(id);
		stream.close();
	}
	
	@Test
	public void retrieveImage() throws IOException {
		
		Optional<ImageData> data = imageRepository.findById(8);
		File file = new File("C:/Users/Kush.Dhawan/Desktop/Downloads/"+ data.get().getImageName());
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(data.get().getImageData());
		fos.close();
		
	}
	
	
	
	
}
