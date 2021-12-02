/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

import java.util.List;

/**
 *
 * @author arezo
 */
public interface Dao {
    
    //add (Student st);
    //List<Student> displayAll();
    void add (Student st);
    List<Student> findAll();
    void delete (int i);
    Student find(int i);
    
}
