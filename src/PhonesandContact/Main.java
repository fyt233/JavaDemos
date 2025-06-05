package PhonesandContact;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //联系人输入
        Contact c1 = new Contact(sc.nextInt(),sc.next());

        //电话输入
        Phone p1=new Phone(sc.next(),sc.next(),c1);
        Phone p2=new Phone(sc.next(),sc.next(),c1);
        Phone p3=new Phone(sc.next(),sc.next(),c1);

        ArrayList phones = c1.getPhoneArray();

        String theName = c1.getName();
        for(int i=0;i< phones.size();i++){
            Phone aPhone = (Phone) phones.get(i);

            System.out.println("ContactName:"+theName+
                    " PhoneNumber:"+aPhone.getPhoneNumber()+
                    " type:"+aPhone.getType());
        }

        System.out.println("Contact of the second phone:"+p2.getaContact().getName());
    }
}
