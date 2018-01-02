/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginsystem;

/**
 *
 * @author 348676487
 */
public class Account {

    //First name
    private String first;
    //Last name
    private String last;
    //Username
    private String user;
    //Encrypted Password
    private String encryptedpass;

    public Account() {

    }

    public Account(String first, String last, String user, String pass) {
        this.first = first;
        this.last = last;
        this.user = user;
        this.encryptedpass = pass;
    }

    /**
     * @return the first name
     */
    public String getFirst() {
        return first;
    }

    /**
     * @param first the first name to set
     */
    public void setFirst(String first) {
        this.first = first;
    }

    /**
     * @return the last name
     */
    public String getLast() {
        return last;
    }

    /**
     * @param last the last name to set
     */
    public void setLast(String last) {
        this.last = last;
    }

    /**
     * @return the username
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the username to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the password
     */
    public String getencryptedPass() {
        return encryptedpass;
    }

    /**
     * @param pass the password to set
     */
    public void setencryptedPass(String pass) {
        this.encryptedpass = pass;
    }
}
