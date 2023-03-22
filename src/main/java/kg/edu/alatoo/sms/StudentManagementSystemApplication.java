package kg.edu.alatoo.sms;

import kg.edu.alatoo.sms.entity.Student;
import kg.edu.alatoo.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		/*Student student1 = new Student("Murat","Myrzataev","myrzataevmurat@alatoo.edu.kg");
		studentRepository.save(student1);

		Student student2 = new Student("Bekzhan","Kochkonov","bkochkonov@gmail.com");
		studentRepository.save(student2);

		Student student3 = new Student("Anas","Kaarov","kaarovanas@gmail.com");
		studentRepository.save(student3);
*/

	}

}
