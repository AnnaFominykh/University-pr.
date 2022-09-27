package com.company;

public class Users {
    public Student createStudent(int id, String name,String group,String password){
        Student newStudent= new Student();
        newStudent.setGroup(group);
        newStudent.setStudent_id(id);
        newStudent.setName(name);
        newStudent.setPassword(password);
        return  newStudent;
    }
    public Teacher createTeacher(int id, String name,String course ,String password){
        Teacher newTeacher= new Teacher();
        newTeacher.setCourse(course);
        newTeacher.setTeacher_id(id);
        newTeacher.setName(name);
        newTeacher.setPassword(password);
        return  newTeacher;
    }

    public Chat_user createUser(Student stud, Teacher teach, String name,String role ,String password){
        if (role == "Student"){name=stud.getName();password=stud.getPassword();}
        if (role == "Teacher"){name=teach.getName();password=teach.getPassword();}
        Chat_user newUser= new Chat_user();
        newUser.setRole(role);
        newUser.setName(name);
        newUser.setPassword(password);
        return  newUser;
    }
}
