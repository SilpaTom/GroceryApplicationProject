package utilities;
import com.github.javafaker.Faker;
//faker class used to generate random data without duplication(name,password,email,full name)
public class FakerUtility {
		
		Faker faker = new Faker();
		
		public String createRandomUserName() {
			return faker.name().username();
		}
		
		public String createRandomPassword() {
			return faker.internet().password();
		}
		
		public String createRandomFullName() {
			return faker.name().fullName();
		}
		
		public String createRandomEmailAddress() {
			return faker.internet().emailAddress();
		}
		
		
	}

