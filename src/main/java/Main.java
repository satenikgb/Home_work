import com.google.gson.Gson;
import org.json.JSONException;
import org.json.JSONObject;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.*;
import java.util.List;

import static javax.xml.bind.JAXBContext.newInstance;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\User\\Desktop\\jsonexample.json";
        Address address=new Address("Armenia","Yerevan","Heratsi","0025");

        JSONObject json = new JSONObject();
        try {
            json.put("firstName", "Saten");
            json.put("lastName", "Gabrielyan");
            json.put("age", 31);
            json.put("address", List.of("Armenia","Yerevan","Aygestan","0025"));
            json.put("phoneNumbers",List.of("095098642","MOBILE"));

        } catch (JSONException e) {
            e.printStackTrace();
        }

        try (PrintWriter out = new PrintWriter(new FileWriter(path))) {
            out.write(json.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Gson gson = new Gson();
        Employee employee = gson.fromJson(new FileReader("C:\\Users\\User\\Desktop\\New Text Document (2).json"),
                Employee.class);
        System.out.println("firstName " + employee.getFirstName());
        System.out.println("lastName " + employee.getLastName());
        System.out.println("age " + employee.getAge());
        System.out.println("address " + employee.getAddress().getCountry() + " " + employee.getAddress().getCity() + " " +
                employee.getAddress().getStreet() + " " + employee.getAddress().getPostalcode());
        System.out.println("phone " + employee.getPhoneNumbers().get(0).getType() + " " +
                employee.getPhoneNumbers().get(0).getNumber());

        JAXBContext jaxbContext = null;
        PhoneNumber phoneNumber=new PhoneNumber("095098642",PhoneNumberType.HOME);
        Address address1=new Address("Arm","Yer","Ayg","0025");
        try {
            jaxbContext = newInstance(Employee.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            Employee employee1 = new Employee("Saten", "Gabrielyan", 31,address1,
                    (List<PhoneNumber>) phoneNumber);
            marshaller.marshal(employee1, new File("C:\\Users\\User\\Desktop\\aaa.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
