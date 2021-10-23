package Observer;
import java.util.ArrayList;

/**
 *
 * @author heman
 */
public class Subject {
   private ArrayList<extrasUsers> users= new ArrayList<>();
   private int count;
   
   public void registerUser(extrasUsers user)
   {
       users.add(user);   
   }
   public void removeUser(extrasUsers user)
   {
       int i = users.indexOf(user);
       if(i>=0)
       {
       users.remove(user);    
       }
       
   }
   public void notifyUsers()
   {
     for(extrasUsers user : users)
     {
         user.update();
     }
   }
   public void setCount(int count)
   {
       this.count=count;
       notifyUsers();
   }
}
