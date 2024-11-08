package list_Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class HandlerWeekDays {

    public List<String>days;

    public HandlerWeekDays(){
        crateList();
    }

     public List<String>getDays(){
        return days;
    }

   // public void setDays(List<String>days){
   //     this.days = days;
   // }


   public void sortdays(){
    Collections.sort(days);
}


   

    public void crateList(){

         days = new ArrayList<String>();
        days.add("lunes");
        days.add("Martes");
        days.add("Miercoles");
        days.add("Jueves");
        days.add("Viernes");
        days.add("Sabado");
        days.add("Domingo");
    }
    public void render(){
        System.err.println(days);
    }

   
}
