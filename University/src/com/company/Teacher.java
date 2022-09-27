package com.company;

import java.util.Date;

public class Teacher {
    private int Teacher_id;
    private String name;
    private String course;
    private String password;

    public int getTeacher_id() {
        return Teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        Teacher_id = teacher_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Task createTask(String name, String text, String group, Date begin, Date end){
        Task newTask= new Task();
        newTask.setBegin(begin);
        newTask.setGroup(group);
        newTask.setEnd(end);
        newTask.setText(text);
        newTask.setName(name);
        return  newTask;
    }
    public Response markTask (Student student, Task task, String result,String comment,Date date){
        Response test= new Response();
        test.setResult(result);
        test.setTaskName(task.getName());
        test.setTaskId(task.getTask_id());
        test.setTeacher_id(Teacher_id);
        test.setTeacherName(name);
        test.setComments(comment);
        test.setStudentName(student.getName());
        test.setStudentId(student.getStudent_id());
        test.setReplyDate(date);
        return test;
    }

}
