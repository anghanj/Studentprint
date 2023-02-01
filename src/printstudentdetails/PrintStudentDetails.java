/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstudentdetails;

/** Array of objects  - java example  : printing Student Details
 * project - share to github  : collaboration tool , traking keep history  -  version control software
 * local rep in laptop : 1. initialize version 2. .gitconfig file 3. .gitignore file
 * netbeans code - working tree code - to local rep - commit
 * @author Jonty Anghan
 * print three students details are name, age store in array then prints --  Array of Objects
 */
public class PrintStudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student[] list = new Student[3] ; // Array of objects declartion 
       // Create three students 
       Student s1 = new Student();  
       s1.setName("peter");
       s1.setAge(20);
       list [0] = s1; // Store object in Array
       System.out.println(list[0].getName() + list[0].getAge());
    }
    
}
