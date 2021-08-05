package com.company;

public class Student {

    int Condition_Field_Total_Student_Count;
    int Ales_Exam;
    double Graduation_Score;
    int Field_Proficiency_Exam;

    public Student(int Condition_Field_Total_Student_Count,int Alex_Exam, double Graduation_Score,int Field_Proficiency_Exam) {
        this.Condition_Field_Total_Student_Count =Condition_Field_Total_Student_Count;
        this.Ales_Exam=Alex_Exam;
        this.Graduation_Score=Graduation_Score;
        this.Field_Proficiency_Exam=Field_Proficiency_Exam;
    }

    public static void main(String[] args) {
	    Student student = new Student(10,82,3.08,64);


        assert student.Condition_Field_Total_Student_Count<30 : "Kabul alan total öğrenci sayısı 30 dan büyük olmamalı";
        assert student.Ales_Exam >80 : "Ales sınavı puanı 80 den küçük olamaz";
        assert student.Graduation_Score> 2.50 && student.Graduation_Score <3.50 : "Öğrencinin mezuniyet derecesi 2.50 dan küçük olmamalı ve 3.50 den büyük olmamalı";
        assert student.Field_Proficiency_Exam >65 : "Alan yeterlilik sınavı notu 65 den küçük olmamalı";
    }


}
