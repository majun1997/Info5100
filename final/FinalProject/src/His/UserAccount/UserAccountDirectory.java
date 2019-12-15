/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package His.UserAccount;
import His.Employee.Employee;
import His.Network.Role.Role;
import His.Network.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;
    /**
     * 
     */
    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }
    /**
     * 
     * @return 
     */
    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    /**
     * 
     * @param username
     * @param password
     * @return 
     */
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    /**
     * 
     * @param username
     * @param password
     * @param realname
     * @param SSN
     * @param role
     * @param workqueue
     * @return 
     */
    public UserAccount createUserAccount(String username, String password,String realname,String SSN,Role role,Employee employee){
       
        UserAccount userAccount = new UserAccount(username,password,realname,SSN,role,employee);
        userAccountList.add(userAccount);
        return userAccount;
    }
    /**
     * 
     * @param username
     * @return 
     */
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
