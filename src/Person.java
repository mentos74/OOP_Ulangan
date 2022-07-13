import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;

public class Person {

    String adress;
    String name;
    final String country = "Indonesia";

    Person (String name, String adress){
    this.name = name;
    this.adress = adress;
    }

    Person (String paramName){
    this(paramName,"null");
    }

    Person (){
    this ("null");
    }





    void sayHello (String name){
        System.out.println("Hello "+name+" My Name is "+this.name);

    }




}
