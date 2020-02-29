package com.devniwee.myfirst;

import com.sun.jmx.snmp.internal.SnmpAccessControlModel;
import com.sun.xml.internal.ws.addressing.WsaTubeHelper;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;


import javax.jnlp.ClipboardService;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {


    public static void main(String[] args) {

        List<String> students=new ArrayList<>();

        students.add("Dilshan");
        students.add("Muditha");
        students.add("Piyumi");
        students.add("Chamika");
        students.add("Kaushal");
        System.out.println(students);

        List<String> filterdata=students.stream().filter(s->s.length()>5).collect(Collectors.toList());
        System.out.println(filterdata);

        List<Sensors> sensors= new ArrayList<>();
        Sensors sensors1 = new Sensors("Living room", 25);
        
    }
    }






