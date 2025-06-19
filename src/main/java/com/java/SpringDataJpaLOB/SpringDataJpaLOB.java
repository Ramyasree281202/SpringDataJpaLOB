package com.java.SpringDataJpaLOB;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.java.SpringDataJpaLOB.dao.Jobseeker;
import com.java.SpringDataJpaLOB.service.JobServiceImp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Optional;
@SpringBootApplication
public class SpringDataJpaLOB {

	public static void main(String[] args) throws IOException {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpaLOB.class, args);
		JobServiceImp service = container.getBean(JobServiceImp.class);
		
//		FileInputStream file=null;
//		File file1=null;
//		FileReader reader=null;
//		byte[] img=null;
//		try {
//			file = new FileInputStream("C:/Users/ragav/OneDrive/Pictures/ocean1.jpg");
//			img = new byte[file.available()];
//			file.read(img);
//			
//			file1 = new File("C:/Users/ragav/OneDrive/Desktop/Vijaya/requirements.txt");
//			reader = new FileReader(file1);
//			char[] text = new char[(int) file1.length()];
//			reader.read(text);
//		}
//		
//		catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		finally {
//			try {
//				reader.close();
//				file.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
//		
//		Jobseeker one = new Jobseeker();
//		
//		one.setName("Rohit");
//		one.setImage(img);
////		one.setText(text);
//		one.setDob(LocalDateTime.of(2002, 12, 28, 10, 30));
//		System.out.println(service.registerjobSeeker(one));
		
		Optional<Jobseeker> optional = service.getAllDetails(1);
		Jobseeker job = optional.get();
		System.out.println(job.getId()+" --> "+job.getName()+ " -->"+job.getDob());
		
		FileOutputStream fos = new FileOutputStream("Java.JPG");
		fos.write(job.getImage());
		fos.flush();
		
		FileWriter writer=new FileWriter("PersonalInfo.txt");
		writer.write(job.getText());
		writer.flush();
	}

}
