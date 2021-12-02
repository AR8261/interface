/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

import java.util.List;
import java.util.Scanner;
import static pkginterface.DaoImpl.listStudents;

/**
 *
 * @author arezo
 */
public class firstInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Dao dao = new DaoImpl();

        for (int i = 0; i < 5; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter student's first name :");
            String firstName = scan.next();

            System.out.println("Please enter student's last name :");
            String lastName = scan.next();
            Student student = new Student();
            student.setFirstName(firstName);
            student.setLastName(lastName);
            dao.add(student);
        }

        List<Student> l1 = dao.findAll();
        for (Student student : l1) {
            System.out.println(student.getFirstName() + "," + student.getLastName());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter student's id :");
        int i = sc.nextInt();

        int size = listStudents.size();

        System.out.println("length of list :" + size);

        if (i < size) {
            Student found = dao.find(i);
            System.out.println(found.getFirstName() + "," + found.getLastName());
            System.out.println("You are going to delete the" + found.getFirstName() + "," + found.getLastName() + ".are you sure?press 1 if not press anykey");
            Scanner sc2 = new Scanner(System.in);
            int key = sc2.nextInt();
            if (key == 1) {
                dao.delete(i);
                for (Student student : l1) {
                    System.out.println(student.getFirstName() + "," + student.getLastName());
                }
            }
            else {
                System.out.println("You decide no to delete the student.");
                for (Student student : l1) {
                    System.out.println(student.getFirstName() + "," + student.getLastName());
                }
            }

        } else {
            System.out.println("Studetn Id is not exist!!");
        }
    }
}
