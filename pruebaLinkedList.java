/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaaplication;
/**
 *
 * @author AngelLopez Vigil
 * @date Aug, 17, 2026
 */
class Student {
    String name;
    int score;
    Student next;
    
    public Student(String name, int score) {
        this.name = name;
        this.next = null;
        this.score = score;
    }
}
    class LnkdLst {
        Student head;
        public LnkdLst() {
    this.head = null;
    }
    //Agrega un nuevo estudiante al final de la lista
    public void add(String name,int score) {
        Student newStudent = new Student(name,score);
        if(head == null) {
            head = newStudent;
            return;
      
    }
        Student current = head;
        current = current.next;      
        current.next = newStudent;
    }
}
public class PruebaLinkedList {
    public static void main(String[] args) {
        LnkdLst lista = new LnkdLst();
        lista.add("Linus",90);
        lista.add("ada", 95);
        lista.add("Paul", 70);
    }
        }
