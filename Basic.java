package java;

 

import java.util.Scanner;

 

class Patient_node{

                String name,address,disease;

                int age,room_no,ID;

                long contact_no;

                String date;

                Patient_node(String name){

                                this.name=name;

                }

}

class Staff_node{

                String name,address,department;

                int contact_no,ID,Experience;

                Staff_node(){

                               

                }

               

}

class doctor_node{

                String name,address;

                String specialisation,qualification;

                int contact_no,ID,Experience;

                doctor_node next_doc;

                Scanner sc=new Scanner(System.in);

               

                doctor_node(int ID,String name){

                                this.ID=ID;

                                this.name=name;

                                this.address=address;

                                this.contact_no=contact_no;

                                this.Experience=Experience;

                                this.specialisation=specialisation;

                                this.qualification=qualification;

                               

                }

                void add_Doc_info() {

                                System.out.println("Enter Doctor Information here");

                                System.out.println("Enter doctor's assigned ID");

                                ID=sc.nextInt();

                                System.out.println("Enter doctor's name");

                                name=sc.nextLine();

                                System.out.println("Enter doctor's specialisation");

                                specialisation=sc.nextLine();

                                System.out.println("Enter doctor's qualification");

                                qualification=sc.nextLine();

                                System.out.println("Enter doctor's contact number");

                                contact_no=sc.nextInt();

                                System.out.println("Enter doctor's address");

                                address=sc.nextLine();

                }

                void display_Doc_info() {

                                System.out.println("Doctor Information");

                                System.out.println("Doctor ID:  "+ID);

                                System.out.println("Doctor name  "+name);

                                System.out.println("Doctor specialisation:  "+specialisation);

                                System.out.println("Doctor qualification  "+qualification);

                                System.out.println("Doctor contact number:  "+contact_no);

                                System.out.println("Doctor address  "+address);

                }

}

class Hospital_Management{

                doctor_node head_doc;

                Scanner sc=new Scanner(System.in);

               

                doctor_node temp=new doctor_node(0, null);

                void Add_doctor() {

                                int op=0;

                                do {

                                temp.add_Doc_info();

                                if(head_doc==null)

                                                head_doc=temp;

                                else

                                {  doctor_node ptr=head_doc;

                                                while(ptr.next_doc!=null)

                                                {

                                                                ptr=ptr.next_doc;

                                                }

                                                                ptr.next_doc=temp;

                                }

                               

                                  System.out.println("Enter 1 to continue adding doctor details else enter 0");

                                  op=sc.nextInt();

                               

                }while(op==1);

                                }

 

                Hospital_Management(){

                                head_doc=null;

                }

}

 

public class mini {

public static void main(String args[]) {

               

}

}
