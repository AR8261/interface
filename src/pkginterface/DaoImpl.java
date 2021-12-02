/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arezo
 */
public class DaoImpl implements Dao{
    static List<Student> listStudents;
    static Student found_student;

    public DaoImpl() {

        listStudents = new ArrayList<Student>();
        
    }

  
    public void add(Student st) {
       listStudents.add(st);
    }

    
    public List<Student> findAll() {
        return listStudents;
    }
    
    public void delete(int i){
        listStudents.remove(i);
    }
    public Student find(int i){
        
        return listStudents.get(i);
    }

}
