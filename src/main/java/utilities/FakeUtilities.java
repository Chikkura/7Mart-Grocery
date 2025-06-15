package utilities;

import org.apache.poi.ss.formula.functions.Address;

import com.github.javafaker.Faker;

public class FakeUtilities {
	public String getFakeFirstName() {

		Faker faker = new Faker();

		com.github.javafaker.Address address = faker.address();

		String text = address.firstName();

		return text;

	}
public String getPassword() {

		Faker faker = new Faker();

		com.github.javafaker.Address address = faker.address();

		String text = address.lastName();

		return text;
	}
public String getFakeCityName() {

		Faker faker = new Faker();

		com.github.javafaker.Address address = faker.address();

		String text = address.cityName();

		return text;

	}
}
